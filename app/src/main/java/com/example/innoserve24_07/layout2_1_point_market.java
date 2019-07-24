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
        @Override
         public void onClick(View v){
            if(v.getId()==R.id.rice){
                if(point>=30)
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market.this);
                    builder.setTitle("請示出條碼")
                            .setIcon(R.mipmap.ic_launcher)
                            .setMessage("池上米:30點")
                            .setNegativeButton("關閉", null)
                            .show();
                    point-=30;
                    textView3.setText(Integer.toString(point));
                }
                else
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market.this);
                    builder.setTitle("您的點數不夠!")
                            .setIcon(R.mipmap.ic_launcher)
                            .setMessage("\n\n請再多走走來集點吧!")
                            .setNegativeButton("我知道了", null)
                            .show();
                }
            }
            if(v.getId()==R.id.water){
              if(point>=70)
              {
                  AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market.this);
                  builder.setTitle("請示出條碼")
                          .setIcon(R.mipmap.ic_launcher)
                          .setMessage("水壺:70點")
                          .setNegativeButton("關閉", null)
                          .show();
                  point-=70;
                  textView3.setText(Integer.toString(point));
              }
              else
              {
                  AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market.this);
                  builder.setTitle("您的點數不夠!")
                          .setIcon(R.mipmap.ic_launcher)
                          .setMessage("\n\n請再多走走來集點吧!")
                          .setNegativeButton("我知道了", null)
                          .show();
              }

            }
            if(v.getId()==R.id.oil){
              if(point>=50)
              {
                  AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market.this);
                  builder.setTitle("請示出條碼")
                          .setIcon(R.mipmap.ic_launcher)
                          .setMessage("醬油:50點")
                          .setNegativeButton("關閉", null)
                          .show();
                  point-=50;
                  textView3.setText(Integer.toString(point));
              }
              else
              {
                  AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market.this);
                  builder.setTitle("您的點數不夠!")
                          .setIcon(R.mipmap.ic_launcher)
                          .setMessage("\n\n請再多走走來集點吧!")
                          .setNegativeButton("我知道了", null)
                          .show();
              }

            }
            if(v.getId()==R.id.tissue){
                if(point>=10)
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market.this);
                    builder.setTitle("請示出條碼")
                            .setIcon(R.mipmap.ic_launcher)
                            .setMessage("衛生紙:10點")
                            .setNegativeButton("關閉", null)
                            .show();
                    point-=10;
                    textView3.setText(Integer.toString(point));
                }
                else
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1_point_market.this);
                    builder.setTitle("您的點數不夠!")
                            .setIcon(R.mipmap.ic_launcher)
                            .setMessage("\n\n請再多走走來集點吧!")
                            .setNegativeButton("我知道了", null)
                            .show();
                }

            }
        }
    };
}
