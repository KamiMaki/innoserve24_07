package com.example.innoserve24_07;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
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

public class PokemonGon extends FragmentActivity
        implements OnMapReadyCallback , GoogleMap.OnMarkerClickListener {

    GoogleMap map;
    private static final LatLng LungTan1 = new LatLng(24.870765, 121.221829);
    private Marker mLungTan1;
    private static final LatLng LungTan2 = new LatLng(24.870172, 121.220379);
    private Marker mLungTan2;
    //便利商店，靠近1
    private static final LatLng LungTan3 = new LatLng(24.868066, 121.216248);
    private Marker mLungTan3;
    private static final LatLng LungTan4 = new LatLng(24.866479, 121.213920);
    private Marker mLungTan4;
    private static final LatLng LungTan5 = new LatLng(24.866450, 121.217117);
    private Marker mLungTan5;
    private static final LatLng LungTan6 = new LatLng(24.866167, 121.217450);
    private Marker mLungTan6;
    private static final LatLng LungTan7 = new LatLng(24.865457, 121.219005);
    private Marker mLungTan7;
    private static final LatLng LungTan8 = new LatLng(24.865184, 121.217600);
    private Marker mLungTan8;
    private static final LatLng LungTan9 = new LatLng(24.865077, 121.221216);
    private Marker mLungTan9;
    private static final LatLng LungTan10 = new LatLng(24.865778, 121.223233);
    private Marker mLungTan10;
    private static final LatLng LungTan11= new LatLng(24.866751, 121.222428);
    private Marker mLungTan11;
    //便利商店，靠近2
    private static final LatLng LungTan12 = new LatLng(24.870580, 121.223957);
    private Marker mLungTan12;
    private static final LatLng LungTan13 = new LatLng(24.872495, 121.228300);
    private Marker mLungTan13;
    private static final LatLng LungTan14 = new LatLng(24.875279, 121.228215);
    private Marker mLungTan14;
    private static final LatLng LungTan15 = new LatLng(24.873562, 121.231502);
    private Marker mLungTan15;
    //假人
    private static final LatLng LungTanPeople1 = new LatLng(24.874123, 121.236516);
    private Marker mLungTanPeole1;
    private static final LatLng LungTanPeople2 = new LatLng(24.865100, 121.231234);
    private Marker mLungTanPeole2;
    private static final LatLng LungTanPeople3 = new LatLng(24.865325, 121.230153);
    private Marker mLungTanPeole3;
    private static final LatLng LungTanPeople4 = new LatLng(24.867789, 121.220415);
    private Marker mLungTanPeole4;
    private static final LatLng LungTanPeople5 = new LatLng(24.868958, 121.226542);
    private Marker mLungTanPeole5;
    private static final LatLng LungTanPeople6 = new LatLng(24.866000, 121.223125);
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
        Button call = (Button)findViewById(R.id.call);
        call.setVisibility(View.VISIBLE);
        call.setBackgroundColor(Color.TRANSPARENT);
        call.setOnClickListener(listener);
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
                        .setNegativeButton("太好了", null)
                        .show();
            }
            if(v.getId()==R.id.call)
            {
                String phoneNum="0925837969";
                callPhone(phoneNum);
            }
        }
    };

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;
        mLungTan1=map.addMarker((new MarkerOptions().position(LungTan1)));
        mLungTan2=map.addMarker((new MarkerOptions().position(LungTan2)));
        mLungTan3=map.addMarker((new MarkerOptions().position(LungTan3)));
        mLungTan4=map.addMarker((new MarkerOptions().position(LungTan4)));
        mLungTan5=map.addMarker((new MarkerOptions().position(LungTan5)));
        mLungTan6=map.addMarker((new MarkerOptions().position(LungTan6)));
        mLungTan7=map.addMarker((new MarkerOptions().position(LungTan7)));
        mLungTan8=map.addMarker((new MarkerOptions().position(LungTan8)));
        mLungTan9=map.addMarker((new MarkerOptions().position(LungTan9)));
        mLungTan10=map.addMarker((new MarkerOptions().position(LungTan10)));
        mLungTan11=map.addMarker((new MarkerOptions().position(LungTan11)));
        mLungTan12=map.addMarker((new MarkerOptions().position(LungTan12)));
        mLungTan13=map.addMarker((new MarkerOptions().position(LungTan13)));
        mLungTan14=map.addMarker((new MarkerOptions().position(LungTan14)));
        mLungTan15=map.addMarker((new MarkerOptions().position(LungTan15)));
        mLungTanPeole1=map.addMarker(new MarkerOptions().position(LungTanPeople1).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole2=map.addMarker(new MarkerOptions().position(LungTanPeople2).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole3=map.addMarker(new MarkerOptions().position(LungTanPeople3).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole4=map.addMarker(new MarkerOptions().position(LungTanPeople4).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole5=map.addMarker(new MarkerOptions().position(LungTanPeople5).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole6=map.addMarker(new MarkerOptions().position(LungTanPeople6).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole7=map.addMarker(new MarkerOptions().position(LungTanPeople7).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole8=map.addMarker(new MarkerOptions().position(LungTanPeople8).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole9=map.addMarker(new MarkerOptions().position(LungTanPeople9).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole10=map.addMarker(new MarkerOptions().position(LungTanPeople10).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole11=map.addMarker(new MarkerOptions().position(LungTanPeople11).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole12=map.addMarker(new MarkerOptions().position(LungTanPeople12).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole13=map.addMarker(new MarkerOptions().position(LungTanPeople13).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole14=map.addMarker(new MarkerOptions().position(LungTanPeople14).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole15=map.addMarker(new MarkerOptions().position(LungTanPeople15).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole16=map.addMarker(new MarkerOptions().position(LungTanPeople16).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole17=map.addMarker(new MarkerOptions().position(LungTanPeople17).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole18=map.addMarker(new MarkerOptions().position(LungTanPeople18).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole19=map.addMarker(new MarkerOptions().position(LungTanPeople19).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mLungTanPeole20=map.addMarker(new MarkerOptions().position(LungTanPeople20).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mme=map.addMarker(new MarkerOptions().position(me).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(me, 13));
        map.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick(final Marker marker) {

        if (marker.equals(mLungTan1))
        {
            Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
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
}
