package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.graphics.Color;
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
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class PokemonGon extends FragmentActivity
        implements OnMapReadyCallback , GoogleMap.OnMarkerClickListener {

    GoogleMap map;
    private static final LatLng Taiwan = new LatLng(24,121 );
    private static final LatLng Taiwan2 = new LatLng(24,122 );


    private Marker mTaiwan;
    private Marker mTaiwan2;
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
    }
    private Button.OnClickListener listener=new Button.OnClickListener(){
        @Override
        public void onClick(View v){

            if(v.getId()==R.id.beacon){
                AlertDialog.Builder builder = new AlertDialog.Builder(PokemonGon.this);

                builder.setTitle("打卡成功!!")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("今天依然健康呢!")
                        .setPositiveButton("太好了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();
            }
        }
    };
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

/*
        LatLng A=new LatLng(24,121);
        map.addMarker(new MarkerOptions().position(A).title("Taiwan"));
        map.setOnMarkerClickListener();

        map.moveCamera(CameraUpdateFactory.newLatLng(A));
        */

        mTaiwan = map.addMarker(new MarkerOptions()
                .position(Taiwan)
                );
        mTaiwan2 = map.addMarker(new MarkerOptions()
                .position(Taiwan2)
                );


        map.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick(final Marker marker) {

        if (marker.equals(mTaiwan))
        {
            Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
        }
        return false;
    }
}
