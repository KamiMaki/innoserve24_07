package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bg4_3question extends AppCompatActivity {

    Button bt;
    TextView q7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg4_3question);
        bt=(Button)findViewById(R.id.bt6);
        q7=(TextView)findViewById(R.id.q7);
        final EditText hm = new EditText(this);
       bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               AlertDialog.Builder builder = new AlertDialog.Builder(bg4_3question.this);
               builder.setTitle("請輸入問題與答案:")
                       .setIcon(R.mipmap.ic_launcher)
                       .setMessage("範例:\nQ:結婚紀念日是什麼時候?\nA:8/31")
                       .setView(hm)
                       .setNegativeButton("新增", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               q7.setText(hm.getText().toString());
                           }
                       })
                       .show();


           }
       });
    }

}
