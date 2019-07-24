package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.MenuInflater;
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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
//test
public class EatTogether1_1 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OnMapReadyCallback ,GoogleMap.OnMarkerClickListener{

    GoogleMap map;
    //平鎮區所有活動中心zz
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

    private static final LatLng LungTan1 = new LatLng(24.845209, 121.153220 );
    private Marker mLungTan1;
    private static final LatLng LungTan2 = new LatLng(24.882359, 121.195308 );
    private Marker mLungTan2;
    private static final LatLng LungTan3 = new LatLng(24.881135, 121.212040 );
    private Marker mLungTan3;
    private static final LatLng LungTan4 = new LatLng(24.868270, 121.215471 );
    private Marker mLungTan4;
    private static final LatLng LungTan5 = new LatLng(24.864885, 121.217324 );
    private Marker mLungTan5;
    private static final LatLng LungTan6 = new LatLng(24.864500, 121.225853 );
    private Marker mLungTan6;
    private static final LatLng LungTan7 = new LatLng(24.875568, 121.228132 );
    private Marker mLungTan7;
    private static final LatLng LungTan8 = new LatLng(24.840931, 121.232381 );
    private Marker mLungTan8;
    private static final LatLng LungTan9 = new LatLng(24.842218, 121.241571 );
    private Marker mLungTan9;
    private static final LatLng LungTan10 = new LatLng(24.829095, 121.246823 );
    private Marker mLungTan10;

    int flag =0;
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
                flag=1;
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
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.accepted)
        {

            Intent intent = new Intent();
            intent.setClass(EatTogether1_1.this,EatTogether1_1_accepted.class);
            startActivity(intent);
        }
        else if (id == R.id.interested)
        {
            Intent intent = new Intent();
            intent.setClass(EatTogether1_1.this,EatTogether1_1_interested.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_slideshow)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(EatTogether1_1.this);

            builder.setTitle("以下是您主辦的活動")
                    .setIcon(R.mipmap.ic_launcher)
                    .setMessage("\n益智遊戲大賽:\n\n參加人員:\n                   鄭奶奶\n                   溫爺爺\n                   陳奶奶\n                   杜爺爺\n\n總共:  4   人參加\n\n")
                    .setPositiveButton("關閉", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .show();
        }
        else if (id == R.id.nav_tools)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(EatTogether1_1.this);

            builder.setTitle("活動的回憶")
                    .setIcon(R.mipmap.ic_launcher)
                    .setMessage("\n108.04.28 溫爺爺的南極之旅\n\n108.08.24 杜爺爺的剉冰派對\n\n108.10.08 鄭奶奶的唱歌大會\n\n108.10.13 陳奶奶的下午茶\n")
                    .setPositiveButton("關閉", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .show();
        }
        else if (id == R.id.nav_share)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(EatTogether1_1.this);

            builder.setTitle("好友名單:")
                    .setIcon(R.mipmap.ic_launcher)
                    .setMessage("\n溫爺爺\n\n杜爺爺\n\n鄭奶奶\n\n陳奶奶\n")
                    .setPositiveButton("關閉", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .show();
        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        mPingChen1 = map.addMarker(new MarkerOptions().position(PingChen1));
        mPingChen2 = map.addMarker(new MarkerOptions().position(PingChen2));
        mPingChen3 = map.addMarker(new MarkerOptions().position(PingChen3));
        mPingChen4 = map.addMarker(new MarkerOptions().position(PingChen4));
        mPingChen5 = map.addMarker(new MarkerOptions().position(PingChen5));
        mPingChen6 = map.addMarker(new MarkerOptions().position(PingChen6));
        mPingChen7 = map.addMarker(new MarkerOptions().position(PingChen7));
        mPingChen8 = map.addMarker(new MarkerOptions().position(PingChen8));
        mPingChen9 = map.addMarker(new MarkerOptions().position(PingChen9));
        mPingChen10 = map.addMarker(new MarkerOptions().position(PingChen10));

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

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(PingChen1, 18));

        map.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        if (marker.equals(mPingChen1))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "東社社區活動中心", Toast.LENGTH_LONG).show();
        }

        if (marker.equals(mPingChen2))
        {
            Toast.makeText(this, "東勢社區活動中心", Toast.LENGTH_LONG).show();
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
        }
        if (marker.equals(mPingChen3))
        {
            Toast.makeText(this, "獅子林社區活動中心", Toast.LENGTH_LONG).show();
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
        }
        if (marker.equals(mPingChen4))
        {
            Toast.makeText(this, "北興社區活動中心", Toast.LENGTH_LONG).show();
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
        }
        if (marker.equals(mPingChen5))
        {
            Toast.makeText(this, "北勢社區活動中心", Toast.LENGTH_LONG).show();
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
        }
        if (marker.equals(mPingChen6))
        {
            Toast.makeText(this, "山峰社區活動中心", Toast.LENGTH_LONG).show();
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
        }
        if (marker.equals(mPingChen7))
        {
            Toast.makeText(this, "山峰社區長壽俱樂部", Toast.LENGTH_LONG).show();
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
        }
        if (marker.equals(mPingChen8))
        {
            Toast.makeText(this, "山子頂社區活動中心", Toast.LENGTH_LONG).show();
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
        }
        if (marker.equals(mPingChen9))
        {
            Toast.makeText(this, "高連社區活動中心", Toast.LENGTH_LONG).show();
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
        }
        if (marker.equals(mPingChen10))
        {
            Toast.makeText(this, "廣隆社區活動中心", Toast.LENGTH_LONG).show();
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();

            Toast.makeText(this, "東社社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mPingChen2))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "東勢社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mPingChen3))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "獅子林社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mPingChen4))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "北興社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mPingChen5))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "北勢社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mPingChen6))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "山峰社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mPingChen7))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "山峰社區長壽俱樂部", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mPingChen8))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "山子頂社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mPingChen9))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "高連社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mPingChen10))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "廣隆社區活動中心", Toast.LENGTH_LONG).show();

        }


        if (marker.equals(mLungTan1))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "黃唐社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan2))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "佳安社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan3))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "九龍社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan4))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "中山社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan5))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "烏林社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan6))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "八德社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan7))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "三和社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan8))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "三水社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan9))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "高平社區活動中心", Toast.LENGTH_LONG).show();
        }
        if (marker.equals(mLungTan10))
        {
            if(flag==0)
                myAlertDialog();
            else
                mmyAlertDialog();
            Toast.makeText(this, "上林社區活動中心", Toast.LENGTH_LONG).show();
        }
        return false;

    }
    //     點marker時跳出來的彈跳視窗
    private void myAlertDialog() {
        AlertDialog.Builder MyAlertDialog = new AlertDialog.Builder(this);
        MyAlertDialog.setTitle("活動:");
        MyAlertDialog.setMessage("目前無活動");
        DialogInterface.OnClickListener OkClick = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // 如果不做任何事情 就會直接關閉 對話方塊
            }
        };
        ;
        MyAlertDialog.setPositiveButton("   關閉", OkClick);
        MyAlertDialog.show();

    }
    private void mmyAlertDialog() {
        AlertDialog.Builder MyAlertDialog = new AlertDialog.Builder(this);
        MyAlertDialog.setTitle("活動:");
        MyAlertDialog.setMessage("\n\n鄭奶奶揪吃飯\n\n活動地點:社區活動中心\n\n活動日期:108.07.28\n\n活動時間:11:30\n\n活動內容:大家每個人帶一道菜來，一人一道就有一桌菜了\n\n");
        DialogInterface.OnClickListener OkClick = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // 如果不做任何事情 就會直接關閉 對話方塊
            }
        };
        ;
        MyAlertDialog.setPositiveButton("我要參加", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                accepted();
            }
        });
        MyAlertDialog.setNeutralButton("   關閉", OkClick);
        MyAlertDialog.setNegativeButton("我感興趣    ", OkClick);
        MyAlertDialog.show();

    }
    private void accepted() {
        AlertDialog.Builder MyAlertDialog = new AlertDialog.Builder(this);
        // MyAlertDialog.setTitle("新活動");
        MyAlertDialog.setMessage("您已成功報名!");
        DialogInterface.OnClickListener OkClick = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // 如果不做任何事情 就會直接關閉 對話方塊
            }
        };
        ;
        //MyAlertDialog.setPositiveButton("   關閉", OkClick);
        MyAlertDialog.show();

    }

}
