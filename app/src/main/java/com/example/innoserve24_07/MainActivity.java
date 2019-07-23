package com.example.innoserve24_07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);

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
                Intent intent = getPackageManager().getLaunchIntentForPackage("jp.naver.line.android");
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



    }
}
