package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class EatTogether1_1 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OnMapReadyCallback ,GoogleMap.OnMarkerClickListener{

    GoogleMap map;
    //平鎮區所有活動中心
    private static final LatLng PingChen1 = new LatLng(24.922596, 121.244921);
    private Marker mPingChen1;
    private static final LatLng PingChen2 = new LatLng(24.910730, 121.232426);
    private Marker mPingChen2;
    private static final LatLng PingChen3 = new LatLng(24.928368, 121.225914);
    private Marker mPingChen3;
    private static final LatLng PingChen4 = new LatLng(24.937601, 121.225295);
    private Marker mPingChen4;
    private static final LatLng PingChen5 = new LatLng(24.942486, 121.221168);
    private Marker mPingChen5;
    private static final LatLng PingChen6 = new LatLng(24.892994, 121.202910);
    private Marker mPingChen6;
    private static final LatLng PingChen7 = new LatLng(24.900090, 121.214187 );
    private Marker mPingChen7;
    private static final LatLng PingChen8 = new LatLng(24.892936, 121.202642 );
    private Marker mPingChen8;
    private static final LatLng PingChen9 = new LatLng(24.955200, 121.189572);
    private Marker mPingChen9;
    private static final LatLng PingChen10 = new LatLng(24.951171, 121.206371 );
    private Marker mPingChen10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_together);

        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(EatTogether1_1.this,EatTogether1_1_add_activity.class);
                startActivity(intent);
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.eat_together, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        mPingChen1 = map.addMarker(new MarkerOptions()
                .position(PingChen1));
        mPingChen2 = map.addMarker(new MarkerOptions()
                .position(PingChen2));
        mPingChen3 = map.addMarker(new MarkerOptions()
                .position(PingChen3));
        mPingChen4 = map.addMarker(new MarkerOptions()
                .position(PingChen4));
        mPingChen5 = map.addMarker(new MarkerOptions()
                .position(PingChen5));
        mPingChen6 = map.addMarker(new MarkerOptions()
                .position(PingChen6));
        mPingChen7 = map.addMarker(new MarkerOptions()
                .position(PingChen7));
        mPingChen8 = map.addMarker(new MarkerOptions()
                .position(PingChen8));
        mPingChen9 = map.addMarker(new MarkerOptions()
                .position(PingChen9));
        mPingChen10 = map.addMarker(new MarkerOptions()
                .position(PingChen10));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(PingChen2, 13));
        map.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        if (marker.equals(mPingChen1))
        {
            myAlertDialog();
        }
        if (marker.equals(mPingChen2))
        {
            myAlertDialog();
        }
        if (marker.equals(mPingChen3))
        {
            myAlertDialog();
        }
        if (marker.equals(mPingChen4))
        {
            myAlertDialog();
        }
        if (marker.equals(mPingChen5))
        {
            myAlertDialog();
        }
        if (marker.equals(mPingChen6))
        {
            myAlertDialog();
        }
        if (marker.equals(mPingChen7))
        {
            myAlertDialog();
        }
        if (marker.equals(mPingChen8))
        {
            myAlertDialog();
        }
        if (marker.equals(mPingChen9))
        {
            myAlertDialog();
        }
        if (marker.equals(mPingChen10))
        {
            myAlertDialog();
        }
        return false;

    }
    private void myAlertDialog() {
        AlertDialog.Builder MyAlertDialog = new AlertDialog.Builder(this);
        MyAlertDialog.setTitle("標題");
        MyAlertDialog.setMessage("我是內容");
        DialogInterface.OnClickListener OkClick = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // 如果不做任何事情 就會直接關閉 對話方塊
            }
        };
        ;
        MyAlertDialog.setNeutralButton("我要參加", OkClick);
        MyAlertDialog.setPositiveButton("   關閉", OkClick);
        MyAlertDialog.setNegativeButton("我感興趣    ", OkClick);
        MyAlertDialog.show();

    }
}
