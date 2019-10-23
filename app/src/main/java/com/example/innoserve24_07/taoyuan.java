package com.example.innoserve24_07;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class taoyuan extends AppCompatActivity {

    Button point,info,fall;
    private SensorManager mSensorManager;   //體感(Sensor)使用管理
    private Sensor mSensor;                 //體感(Sensor)類別
    private float mLastX;                    //x軸體感(Sensor)偏移
    private float mLastY;                    //y軸體感(Sensor)偏移
    private float mLastZ;                    //z軸體感(Sensor)偏移
    private double mSpeed;                 //甩動力道數度
    private long mLastUpdateTime;           //觸發時間
    //甩動力道數度設定值 (數值越大需甩動越大力，數值越小輕輕甩動即會觸發)
    private static final int SPEED_SHRESHOLD1 = 3000;
    private static final int SPEED_SHRESHOLD= 4000;
    //觸發間隔時間
    private static final int UPTATE_INTERVAL_TIME1= 200;
    private static final int UPTATE_INTERVAL_TIME = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taoyuan);
        point = findViewById(R.id.tao1);
        info = findViewById(R.id.tao2);
        fall=findViewById(R.id.fall);
        fall.setVisibility(View.VISIBLE);
        fall.setBackgroundColor(Color.TRANSPARENT);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(taoyuan.this,taoyuan_NFC.class);
                startActivity(intent);

            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(taoyuan.this,gov_info.class);
                startActivity(intent);
            }
        });
        fall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
                mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
                mSensorManager.registerListener(callSensorListener, mSensor,SensorManager.SENSOR_DELAY_GAME);
            }
        });
    }

    public void callPhone(String phoneNum){

        //android6版本获取动态权限
        if (Build.VERSION.SDK_INT >= 23) {
            int REQUEST_CODE_CONTACT = 101;
            String[] permissions = {Manifest.permission.CALL_PHONE};
            //验证是否许可权限
            for (String str : permissions) {
                if (this.checkSelfPermission(str) != PackageManager.PERMISSION_GRANTED) {
                    //申请权限
                    this.requestPermissions(permissions, REQUEST_CODE_CONTACT);
                    return;
                }
            }
        }
        //如果需要手动拨号将Intent.ACTION_CALL改为Intent.ACTION_DIAL（跳转到拨号界面，用户手动点击拨打）
        Intent intent = new Intent(Intent.ACTION_CALL);
        Uri data = Uri.parse("tel:" + phoneNum);
        intent.setData(data);
        startActivity(intent);
    }

    private SensorEventListener callSensorListener = new SensorEventListener() {
        public void onSensorChanged(SensorEvent mSensorEvent) {
            // 當前觸發時間
            long mCurrentUpdateTime = System.currentTimeMillis();
            // 觸發間隔時間 = 當前觸發時間 - 上次觸發時間
            long mTimeInterval = mCurrentUpdateTime - mLastUpdateTime;
            // 若觸發間隔時間< 70 則return;
            if (mTimeInterval < UPTATE_INTERVAL_TIME)
                return;

            mLastUpdateTime = mCurrentUpdateTime;
            // 取得xyz體感(Sensor)偏移
            float x = mSensorEvent.values[0];
            float y = mSensorEvent.values[1];
            float z = mSensorEvent.values[2];
            // 甩動偏移速度 = xyz體感(Sensor)偏移 - 上次xyz體感(Sensor)偏移
            float mDeltaX = x - mLastX;
            float mDeltaY = y - mLastY;
            float mDeltaZ = z - mLastZ;
            mLastX = x;
            mLastY = y;
            mLastZ = z;
            // 體感(Sensor)甩動力道速度公式
            mSpeed = Math.sqrt(mDeltaX * mDeltaX + mDeltaY * mDeltaY + mDeltaZ * mDeltaZ) / mTimeInterval * 10000;
            // 若體感(Sensor)甩動速度大於等於甩動設定值則進入 (達到甩動力道及速度)

            if (mSpeed >= SPEED_SHRESHOLD) {
                // 達到搖一搖甩動後要做的事情
                AlertDialog.Builder builder = new AlertDialog.Builder(taoyuan.this);
                builder.setTitle("出大事!!")
                        .setIcon(R.drawable.oldyeahhh)
                        .setMessage("偵測到您有跌倒\n請於 5秒 內回報是否安好\n如果沒有將自動撥打給緊急聯絡人")
                        .setNegativeButton("我很好",null)
                        .setCancelable(true)
                        .show();
                final AlertDialog dlg = builder.create();
                dlg.show();
                final Timer t = new Timer();
                t.schedule(new TimerTask() {
                    public void run() {
                        String phoneNum="0925837969";
                        callPhone(phoneNum);
                        dlg.dismiss();
                        t.cancel();
                    }
                }, 5000);
            }

        }

        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };

}
