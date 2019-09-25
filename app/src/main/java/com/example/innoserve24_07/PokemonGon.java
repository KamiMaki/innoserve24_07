package com.example.innoserve24_07;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Timer;
import java.util.TimerTask;

public class PokemonGon extends FragmentActivity
        implements OnMapReadyCallback , GoogleMap.OnMarkerClickListener {
int flag=0;
    GoogleMap map;
    private static final LatLng LungTan1 = new LatLng(24.870541, 121.222465);
    private Marker mLungTan1;
    private static final LatLng LungTan2 = new LatLng(24.870172, 121.220379);
    private Marker mLungTan2;
    //便利商店，靠近1
    private static final LatLng LungTan3 = new LatLng(24.867952, 121.215667);
    private Marker mLungTan3;
    private static final LatLng LungTan4 = new LatLng(24.864634, 121.211069);
    private Marker mLungTan4;
    private static final LatLng LungTan5 = new LatLng(24.866450, 121.217117);
    private Marker mLungTan5;
    private static final LatLng LungTan6 = new LatLng(24.866167, 121.217450);
    private Marker mLungTan6;
    private static final LatLng LungTan7 = new LatLng(24.866315, 121.216637);
    private Marker mLungTan7;
    private static final LatLng LungTan8 = new LatLng(24.865963, 121.216760);
    private Marker mLungTan8;
    private static final LatLng LungTan9 = new LatLng(24.865073, 121.217149);
    private Marker mLungTan9;
    private static final LatLng LungTan10 = new LatLng(24.866536, 121.221891);
    private Marker mLungTan10;
    private static final LatLng LungTan11= new LatLng(24.865594, 121.222678);
    private Marker mLungTan11;
    private static final LatLng LungTan12 = new LatLng(24.864962, 121.222479);
    private Marker mLungTan12;
    //便利商店，靠近2
    private static final LatLng LungTan13 = new LatLng(24.870395, 121.223271);
    private Marker mLungTan13;
    private static final LatLng LungTan14 = new LatLng(24.872288, 121.227715);
    private Marker mLungTan14;
    private static final LatLng LungTan15 = new LatLng(24.873380, 121.231282);
    private Marker mLungTan15;
    private static final LatLng LungTan16 = new LatLng(24.873695, 121.232599);
    private Marker mLungTan16;
    //假人
    private static final LatLng LungTanPeople1 = new LatLng(24.874123, 121.236516);
    private Marker mLungTanPeole1;
    private static final LatLng LungTanPeople2 = new LatLng(24.865100, 121.231234);
    private Marker mLungTanPeole2;
    private static final LatLng LungTanPeople3 = new LatLng(24.865325, 121.230153);
    private Marker mLungTanPeole3;
    private static final LatLng LungTanPeople4 = new LatLng(24.867789, 121.220415);
    private Marker mLungTanPeole4;
    private static final LatLng LungTanPeople5 = new LatLng(24.865637, 121.212389);
    private Marker mLungTanPeole5;
    private static final LatLng LungTanPeople6 = new LatLng(24.866307, 121.214657);
    private Marker mLungTanPeole6;
    private static final LatLng LungTanPeople7 = new LatLng(24.867156, 121.221234);
    private Marker mLungTanPeole7;
    private static final LatLng LungTanPeople8 = new LatLng(24.869456, 121.229744);
    private Marker mLungTanPeole8;
    private static final LatLng LungTanPeople9 = new LatLng(24.869000, 121.226321);
    private Marker mLungTanPeole9;
    private static final LatLng LungTanPeople10 = new LatLng(24.870123, 121.214052);
    private Marker mLungTanPeole10;
    private static final LatLng LungTanPeople11= new LatLng(24.871234, 121.218462);
    private Marker mLungTanPeole11;
    private static final LatLng LungTanPeople12 = new LatLng(24.870564, 121.216849);
    private Marker mLungTanPeole12;
    private static final LatLng LungTanPeople13 = new LatLng(24.872987, 121.216452);
    private Marker mLungTanPeole13;
    private static final LatLng LungTanPeople14 = new LatLng(24.873489, 121.219452);
    private Marker mLungTanPeole14;
    private static final LatLng LungTanPeople15 = new LatLng(24.874489, 121.226481);
    private Marker mLungTanPeole15;
    private static final LatLng LungTanPeople16 = new LatLng(24.875789, 121.228456);
    private Marker mLungTanPeole16;
    private static final LatLng LungTanPeople17 = new LatLng(24.87231, 121.231234);
    private Marker mLungTanPeole17;
    private static final LatLng LungTanPeople18 = new LatLng(24.861056, 121.234894);
    private Marker mLungTanPeole18;
    private static final LatLng LungTanPeople19 = new LatLng(24.879453, 121.227894);
    private Marker mLungTanPeole19;
    private static final LatLng LungTanPeople20 = new LatLng(24.870153, 121.235003);
    private Marker mLungTanPeole20;
    private static final LatLng me = new LatLng(24.87, 121.23);
    private Marker mme;
    Button friend;
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
        setContentView(R.layout.activity_pokemon_gon);

        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Button beacon = (Button)findViewById(R.id.beacon);
        beacon.setVisibility(View.VISIBLE);
        beacon.setBackgroundColor(Color.TRANSPARENT);
        beacon.setOnClickListener(listener);
        Button friend = (Button)findViewById(R.id.friend);
        friend.setOnClickListener(listener);
/*
            if(flag==0)
            {
                mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
                mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
                mSensorManager.registerListener(callSensorListener, mSensor,SensorManager.SENSOR_DELAY_GAME);
                flag++;
                Toast.makeText(this, "callSensorListener", Toast.LENGTH_LONG).show();
            }
            else
            {
                mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
                mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
                mSensorManager.registerListener(callSensorListener, mSensor,SensorManager.SENSOR_DELAY_GAME);
                Toast.makeText(this, "callSensorListener1", Toast.LENGTH_LONG).show();
            }

*/



    }
    private Button.OnClickListener listener=new Button.OnClickListener(){
        @Override
        public void onClick(View v){

            if(v.getId()==R.id.beacon)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(PokemonGon.this);
                builder.setTitle("打卡成功!!")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("今天依然健康呢!")
                        .setNegativeButton("太好了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
                                mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
                                mSensorManager.registerListener(callSensorListener, mSensor,SensorManager.SENSOR_DELAY_GAME);
                            }
                        })
                        .show();
            }
            if(v.getId()==R.id.friend)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(PokemonGon.this);
                builder.setTitle("加好友")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("請搖一搖來加好友")
                        .setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
                                mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
                                mSensorManager.registerListener(SensorListener1, mSensor,SensorManager.SENSOR_DELAY_GAME);
                            }
                        })
                        .show();
            }
        }
    };

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;
        mLungTan1=map.addMarker((new MarkerOptions().position(LungTan1).icon(BitmapDescriptorFactory.fromResource(R.drawable.office))));
        mLungTan2=map.addMarker((new MarkerOptions().position(LungTan2).icon(BitmapDescriptorFactory.fromResource(R.drawable.office))));
        mLungTan3=map.addMarker((new MarkerOptions().position(LungTan3).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan4=map.addMarker((new MarkerOptions().position(LungTan4).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan5=map.addMarker((new MarkerOptions().position(LungTan5).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan6=map.addMarker((new MarkerOptions().position(LungTan6).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan7=map.addMarker((new MarkerOptions().position(LungTan7).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan8=map.addMarker((new MarkerOptions().position(LungTan8).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan9=map.addMarker((new MarkerOptions().position(LungTan9).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan10=map.addMarker((new MarkerOptions().position(LungTan10).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan11=map.addMarker((new MarkerOptions().position(LungTan11).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan12=map.addMarker((new MarkerOptions().position(LungTan12).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan13=map.addMarker((new MarkerOptions().position(LungTan13).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan14=map.addMarker((new MarkerOptions().position(LungTan14).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan15=map.addMarker((new MarkerOptions().position(LungTan15).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTan16=map.addMarker((new MarkerOptions().position(LungTan16).icon(BitmapDescriptorFactory.fromResource(R.drawable.convenience_store))));
        mLungTanPeole1=map.addMarker(new MarkerOptions().position(LungTanPeople1).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandpa)));
        mLungTanPeole2=map.addMarker(new MarkerOptions().position(LungTanPeople2).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandma)));
        mLungTanPeole3=map.addMarker(new MarkerOptions().position(LungTanPeople3).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandpa)));
        mLungTanPeole4=map.addMarker(new MarkerOptions().position(LungTanPeople4).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandma)));
        mLungTanPeole5=map.addMarker(new MarkerOptions().position(LungTanPeople5).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandpa)));
        mLungTanPeole6=map.addMarker(new MarkerOptions().position(LungTanPeople6).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandma)));
        mLungTanPeole7=map.addMarker(new MarkerOptions().position(LungTanPeople7).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandpa)));
        mLungTanPeole8=map.addMarker(new MarkerOptions().position(LungTanPeople8).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandma)));
        mLungTanPeole9=map.addMarker(new MarkerOptions().position(LungTanPeople9).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandpa)));
        mLungTanPeole10=map.addMarker(new MarkerOptions().position(LungTanPeople10).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandma)));
        mLungTanPeole11=map.addMarker(new MarkerOptions().position(LungTanPeople11).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandpa)));
        mLungTanPeole12=map.addMarker(new MarkerOptions().position(LungTanPeople12).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandma)));
        mLungTanPeole13=map.addMarker(new MarkerOptions().position(LungTanPeople13).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandpa)));
        mLungTanPeole14=map.addMarker(new MarkerOptions().position(LungTanPeople14).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandma)));
        mLungTanPeole15=map.addMarker(new MarkerOptions().position(LungTanPeople15).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandpa)));
        mLungTanPeole16=map.addMarker(new MarkerOptions().position(LungTanPeople16).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandma)));
        mLungTanPeole17=map.addMarker(new MarkerOptions().position(LungTanPeople17).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandpa)));
        mLungTanPeole18=map.addMarker(new MarkerOptions().position(LungTanPeople18).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandma)));
        mLungTanPeole19=map.addMarker(new MarkerOptions().position(LungTanPeople19).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandpa)));
        mLungTanPeole20=map.addMarker(new MarkerOptions().position(LungTanPeople20).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandma)));
        // 改標記符號這樣寫             mLungTanPeole20=map.addMarker(new MarkerOptions().position(LungTanPeople20).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mme=map.addMarker(new MarkerOptions().position(me).icon(BitmapDescriptorFactory.fromResource(R.drawable.me)));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(me, 18));
        map.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick(final Marker marker) {

        if (marker.equals(mLungTan1))
        {
            Toast.makeText(this, "龍潭區公所", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan2))
        {
            Toast.makeText(this, "龍潭衛生所", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan3))
        {
            Toast.makeText(this, "7-11 龍運門市", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan4))
        {
            Toast.makeText(this, "OK便利商店 龍潭龍元店", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan5))
        {
            Toast.makeText(this, "OK便利商店 龍潭北龍店", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan6))
        {
            Toast.makeText(this, "OK便利商店 龍潭龍華店", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan7))
        {
            Toast.makeText(this, "全家便利商店 龍潭興龍店", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan8))
        {
            Toast.makeText(this, "7-ELEVEN 龍政門市", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan9))
        {
            Toast.makeText(this, "全家便利商店 龍潭五福店", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan10))
        {
            Toast.makeText(this, "全家便利商店 龍潭龍昌店", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan11))
        {
            Toast.makeText(this, "7-ELEVEN 龍昌門市", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan12))
        {
            Toast.makeText(this, "7-ELEVEN 紹福門市", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan13))
        {
            Toast.makeText(this, "萊爾富便利商店 桃縣桃亮店", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan14))
        {
            Toast.makeText(this, "7-ELEVEN 龍德門市", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan15))
        {
            Toast.makeText(this, "OK便利商店 龍潭武漢店", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan16))
        {
            Toast.makeText(this, "全家龍潭武漢店", Toast.LENGTH_LONG).show();
        }
        return false;
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
    private SensorEventListener SensorListener1 = new SensorEventListener() {
        public void onSensorChanged(SensorEvent mSensorEvent) {
            // 當前觸發時間
            long mCurrentUpdateTime = System.currentTimeMillis();
            // 觸發間隔時間 = 當前觸發時間 - 上次觸發時間
            long mTimeInterval = mCurrentUpdateTime - mLastUpdateTime;
            // 若觸發間隔時間< 70 則return;
            if (mTimeInterval < UPTATE_INTERVAL_TIME1)
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

            if (mSpeed >= SPEED_SHRESHOLD1) {
                // 達到搖一搖甩動後要做的事情
                Intent intent = new Intent();
                intent.setClass(PokemonGon.this, PokemonGon_shake.class);
                startActivity(intent);
                onPause();
            }

        }

        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };
    private SensorEventListener SensorListener= new SensorEventListener() {
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
                Intent intent = new Intent();
                intent.setClass(PokemonGon.this, PokemonGon_shake.class);
                startActivity(intent);
                onPause();
            }

        }

        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };
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
                AlertDialog.Builder builder = new AlertDialog.Builder(PokemonGon.this);
                builder.setTitle("出大事!!")
                        .setIcon(R.mipmap.ic_launcher)
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
    private SensorEventListener callSensorListener1 = new SensorEventListener() {
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


            }

        }

        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };
    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(SensorListener);
    }

}
