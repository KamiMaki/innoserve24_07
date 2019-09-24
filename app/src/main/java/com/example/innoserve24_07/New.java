package com.example.innoserve24_07;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class New extends AppCompatActivity
    implements GoogleMap.OnMarkerClickListener, OnMapReadyCallback {
    GoogleMap map;
    //點宣告在這裡
    private static final LatLng me = new LatLng(24.911000, 121.233500);
    private Marker mme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    //地圖的點放這裡，宣告在上面
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        mme=map.addMarker((new MarkerOptions().position(me)).anchor(0.5f,0.5f).icon(BitmapDescriptorFactory.fromResource(R.drawable.grandma)));


        map.moveCamera(CameraUpdateFactory.newLatLngZoom(me, 15));

        //map.setOnMarkerClickListener(this);
    };


    //按地標放這裡
    @Override
    public boolean onMarkerClick(Marker marker) {
        /*if (marker.equals(mPingChen1))
        {
            act5ListAlertDialog();
            Toast.makeText(this, "東社社區活動中心", Toast.LENGTH_LONG).show();
        }*/
        return false;
    }
}
