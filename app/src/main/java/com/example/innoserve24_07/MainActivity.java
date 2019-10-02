package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Vibrator;
public class MainActivity extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button weather;
    Button buysth;
    Button alarm;
    private final static int NOTIFICATION_ID = 0;
    private NotificationManager notificationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);


        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
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
                intent.setClass(MainActivity.this,EatTogether1_1.class);
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
                intent.setClass(MainActivity.this,chatbot.class);
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

       bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,taoyuan.class);
                startActivity(intent);
            }
        });

        buysth=(Button)findViewById(R.id.buysth) ;
        buysth.setVisibility(View.VISIBLE);
        buysth.setBackgroundColor(Color.TRANSPARENT);
        buysth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Thread.sleep(7000); //1000為1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Notification notification = new Notification.Builder(MainActivity.this)
                        .setContentTitle("日用品購買提醒")
                        .setContentText("要添購衛生紙")
                        .setSmallIcon(android.R.drawable.ic_dialog_email)
                        .setAutoCancel(true)
                        .build();
                notificationManager.notify(NOTIFICATION_ID, notification);
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
                        .setIcon(R.drawable.oldyeahhh)
                        .setMessage("\n天氣好出去走走之餘\n要小心不要中暑喔!")
                        .setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                builder.setTitle("健康資訊")
                                        .setIcon(R.drawable.oldyeahhh)
                                        .setMessage("\n65歲以上長者免費肺炎鏈球菌疫苗接種\n\n您接種了嗎?\n\n相關資訊請洽委蝦密")
                                        .setNegativeButton("相關資訊", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                Intent intent = new Intent();
                                                intent.setClass(MainActivity.this, chatbot.class);
                                                startActivity(intent);
                                            }
                                        })
                                        .setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                                builder.setTitle("每日小問題!!")
                                                        .setIcon(R.drawable.oldyeahhh)
                                                        .setMessage("前任的總統是誰?\n答案:")
                                                        .setView(input)
                                                        .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                                            @Override
                                                            public void onClick(DialogInterface dialog, int which) {
                                                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                                                builder.setTitle("每日小問題!!")
                                                                        .setIcon(R.drawable.oldyeahhh)
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

        alarm = (Button)findViewById(R.id.alarm);
        alarm.setVisibility(View.VISIBLE);
        alarm.setBackgroundColor(Color.TRANSPARENT);
        alarm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setVibrate(500); // 震動 1 秒
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("吃藥提醒")
                        .setIcon(R.drawable.oldyeahhh)
                        .setMessage("早上10點\n糖尿病藥紅包")
                        .setNegativeButton("好",null)
                        .show();
            }
        });

    }
    public void setVibrate(int time){
        Vibrator myVibrator = (Vibrator) getSystemService(Service.VIBRATOR_SERVICE);
        myVibrator.vibrate(time);
    }
}

