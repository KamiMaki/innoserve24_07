package com.example.innoserve24_07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bg extends AppCompatActivity {

    Button bm;
    Button bb;
    Button bq;
    Button bh;
    Button bw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg);
        final EditText mPhoneNoEt = (EditText) findViewById(R.id.et_phone_no);
        bm=(Button)findViewById(R.id.bm);
        bb=(Button)findViewById(R.id.bb);
        bq=(Button)findViewById(R.id.bq);


        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(bg.this,bg4_1medicine.class);
                startActivity(intent);
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(bg.this,bg4_2buy.class);
                startActivity(intent);
            }
        });
        bq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(bg.this,bg4_3question.class);
                startActivity(intent);
            }
        });
    }
}
