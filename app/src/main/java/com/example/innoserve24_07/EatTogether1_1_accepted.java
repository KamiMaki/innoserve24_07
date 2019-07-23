package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EatTogether1_1_accepted extends AppCompatActivity {
    Button ac1;
    Button ac2;
    Button ac3;
    Button ac4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_together1_1_accepted);
        ac1=(Button)findViewById(R.id.ac1);
        ac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(EatTogether1_1_accepted.this,EatTogether1_1_accepted_chatroom.class);
                startActivity(intent);
            }
        });
        ac2=(Button)findViewById(R.id.ac2);
        ac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(EatTogether1_1_accepted.this,EatTogether1_1_accepted_chatroom.class);
                startActivity(intent);
            }
        });
        ac3=(Button)findViewById(R.id.ac3);
        ac3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(EatTogether1_1_accepted.this,EatTogether1_1_accepted_chatroom.class);
                startActivity(intent);
            }
        });
        ac4=(Button)findViewById(R.id.ac4);
        ac4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(EatTogether1_1_accepted.this,EatTogether1_1_accepted_chatroom.class);
                startActivity(intent);
            }
        });


    }
}
