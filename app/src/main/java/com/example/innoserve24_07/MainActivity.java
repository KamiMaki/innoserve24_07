package com.example.innoserve24_07;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.graphics.Color;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.RingtoneManager;
import android.net.Uri;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

import android.os.Build;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Vibrator;

import java.util.Timer;
import java.util.TimerTask;

import static com.example.innoserve24_07.pass_through.CHANNEL_1_ID;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button weather;
    //Button buysth;
    Button alarm;
    Button pass_through;
    private NotificationManagerCompat notificationManager;
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
    int flag=1;
    long[] vibrate = {0,100,200,300};
    Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
    /*private final static int NOTIFICATION_ID = 0;
    private NotificationManager notificationManager;*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);

        notificationManager=NotificationManagerCompat.from(this);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,EatTogether1_1.class);
                startActivity(intent);
            }
        });

       bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,layout2_1.class);
                startActivity(intent);
            }
        });

       bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,chatbot.class);
                startActivity(intent);

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,bg.class);
                startActivity(intent);
            }
        });

       bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,taoyuan.class);
                startActivity(intent);
            }
        });

        final EditText input = new EditText(this);
        weather = (Button)findViewById(R.id.weather);
        weather.setVisibility(View.VISIBLE);
        weather.setBackgroundColor(Color.TRANSPARENT);
        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
                mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
                mSensorManager.registerListener(callSensorListener, mSensor,SensorManager.SENSOR_DELAY_GAME);
            }
        });

       /* pass_through = (Button)findViewById(R.id.pass_through);
        pass_through.setVisibility(View.VISIBLE);
        pass_through.setBackgroundColor(Color.TRANSPARENT);
        pass_through.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendOnChannel1(view);
            }
        });*/

    }
    public void setVibrate(int time){
        Vibrator myVibrator = (Vibrator) getSystemService(Service.VIBRATOR_SERVICE);
        myVibrator.vibrate(time);
    }
    public void callPhone(String phoneNum){
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
                if(flag==1)
                {

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
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
                            String phoneNum="0978732031";
                            callPhone(phoneNum);
                            dlg.dismiss();
                            t.cancel();
                        }
                    }, 0);
                    flag=0;
                }
            }




        }

        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };
        }

