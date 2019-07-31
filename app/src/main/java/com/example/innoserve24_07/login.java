package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        /*
        MyApplication myApplication = (MyApplication) getApplicationContext();
        myApplication.a++;
        AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
        builder.setTitle("打卡成功!!")
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("今天依然健康呢!")
                .setNegativeButton("太好了", null)
                .setPositiveButton("恩恩", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent();
                        intent.setClass(login.this,MainActivity.class);
                        startActivity(intent);

                    }
                })
                .show();
                */
    }
}
