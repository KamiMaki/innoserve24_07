package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class layout2_1_point_market_fake extends AppCompatActivity {

    private ImageButton oil;
    private ImageButton tissue;
    private ImageButton water;
    private ImageButton rice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2_1_point_market);
        rice=(ImageButton)findViewById(R.id.rice);
        rice.setOnClickListener(listener);
        oil=(ImageButton)findViewById(R.id.oil);
        oil.setOnClickListener(listener);
        water=(ImageButton)findViewById(R.id.water);
        water.setOnClickListener(listener);
        tissue=(ImageButton)findViewById(R.id.tissue);
        tissue.setOnClickListener(listener);
    }
    private Button.OnClickListener listener=new Button.OnClickListener(){
        @Override
         public void onClick(View v){
            if(v.getId()==R.id.rice){
                AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market_fake.this);
                builder.setTitle("請示出條碼")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("池上米:30點")
                        .setPositiveButton("關閉", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }

                        })
                        .show();

            }
            if(v.getId()==R.id.water){
                AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market_fake.this);
                builder.setTitle("請示出條碼")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("水壺:70點")
                        .setPositiveButton("關閉", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();

            }
            if(v.getId()==R.id.oil){
                AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market_fake.this);
                builder.setTitle("請示出條碼")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("醬油:50點")
                        .setPositiveButton("關閉", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();

            }
            if(v.getId()==R.id.tissue){
                AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market_fake.this);
                builder.setTitle("請示出條碼")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("衛生紙:10點")
                        .setPositiveButton("關閉", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();

            }
        }
    };
}
