package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static android.app.ProgressDialog.show;

public class layout2_1_point_market extends AppCompatActivity {

    ImageButton oil;
    ImageButton tissue;
    ImageButton water;
    ImageButton rice;
    TextView textView3;
    ImageView img;
    int point =100;
    String p = Integer.toString(point);
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
        textView3=(TextView)findViewById(R.id.textView3);
       // String p = Integer.toString(point);
        textView3.setText(p);

    }
    private Button.OnClickListener listener=new Button.OnClickListener(){
        //LayoutInflater inflater = LayoutInflater.from(layout2_1_point_market.this);
        //final View v = inflater.inflate(R.layout.code38, null);
        @Override
         public void onClick(View v){

            if(v.getId()==R.id.rice){
                point-=30;
                textView3.setText(Integer.toString(point));
                AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market.this);

                builder.setTitle("請示出條碼")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("池上米:30點")
                        .setPositiveButton("關閉", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }

                            /*public void onClick(View view) {
                                Intent intent = new Intent();
                                intent.setClass(layout2_1_point_market.this,layout2_1_point_market_fake.class);
                                startActivity(intent);
                            }*/
                        })
                        .show();


            }
            if(v.getId()==R.id.water){
                point-=70;
                textView3.setText(Integer.toString(point));
                AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market.this);
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
                point-=50;
                textView3.setText(Integer.toString(point));
                AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market.this);
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
                point-=10;
                textView3.setText(Integer.toString(point));
                AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market.this);
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