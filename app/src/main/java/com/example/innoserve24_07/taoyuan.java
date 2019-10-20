package com.example.innoserve24_07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class taoyuan extends AppCompatActivity {

    Button point,info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taoyuan);
        point = findViewById(R.id.tao1);
        info = findViewById(R.id.tao2);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(taoyuan.this,taoyuan_NFC.class);
                startActivity(intent);

            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(taoyuan.this,gov_info.class);
                startActivity(intent);
            }
        });
    }
}
