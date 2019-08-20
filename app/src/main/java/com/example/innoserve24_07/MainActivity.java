package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button weather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
/*
        MyApplication myApplication = (MyApplication) getApplicationContext();
        //myApplication.a = 0;
        if(myApplication.a==0)
        {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,login.class);
            startActivity(intent);

        }

*/
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,New.class);
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
                intent.setClass(MainActivity.this, CHATBOT.class);
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
        final EditText input = new EditText(this);
        weather = (Button)findViewById(R.id.weather);
        weather.setVisibility(View.VISIBLE);
        weather.setBackgroundColor(Color.TRANSPARENT);
        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("今天天氣晴\n溫度約27~30度")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("\n天氣好出去走走之餘\n要小心不要中暑喔!")
                        .setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                builder.setTitle("健康資訊")
                                        .setIcon(R.mipmap.ic_launcher)
                                        .setMessage("\n65歲以上長者免費肺炎鏈球菌疫苗接種\n\n您接種了嗎?\n\n相關資訊請洽委蝦密")
                                        .setNegativeButton("相關資訊", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                Intent intent = new Intent();
                                                intent.setClass(MainActivity.this, CHATBOT.class);
                                                startActivity(intent);
                                            }
                                        })
                                        .setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                                builder.setTitle("每日小問題!!")
                                                        .setIcon(R.mipmap.ic_launcher)
                                                        .setMessage("前任的總統是誰?\n答案:")
                                                        .setView(input)
                                                        .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                                            @Override
                                                            public void onClick(DialogInterface dialog, int which) {
                                                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                                                builder.setTitle("每日小問題!!")
                                                                        .setIcon(R.mipmap.ic_launcher)
                                                                        .setMessage("\n恭喜答對!!\n\n今天依然健康呢!\n沒有失智喔!放心\n")
                                                                        .setNegativeButton("太好了",null)
                                                                        .show();
                                                            }
                                                        })
                                                        .show();
                                            }
                                        })

                                        .show();
                            }
                        })
                        .show();
            }
        });

    }
}

