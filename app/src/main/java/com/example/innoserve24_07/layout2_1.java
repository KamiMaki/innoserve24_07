package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class layout2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2_1);
        final EditText input = new EditText(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1.this);
        builder.setTitle("每日小問題!!")
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("請問您的媽媽名子叫什麼?\n答案:")
                .setView(input)
                .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(layout2_1.this);
                        builder.setTitle("每日小問題!!")
                                .setIcon(R.mipmap.ic_launcher)
                                .setMessage("\n恭喜答對!!\n\n今天依然健康呢!\n沒有失智喔!放心\n")
                                .setNegativeButton("太好了",null)
                                .show();
                    }
                })
                .show();
       Button point = (Button)findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(layout2_1.this,layout2_1_point_market.class);
                startActivity(intent);
            }
        });

       Button search =(Button)findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(layout2_1.this,PokemonGon.class);
                startActivity(intent);
            }
        });

        Button ar=(Button)findViewById(R.id.ar);
         ar.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View view) {

                 Intent intent =getPackageManager().getLaunchIntentForPackage(("com.please.abc"));
                 startActivity(intent);
             }
         });

        Button share=(Button)findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(layout2_1.this,layout2_1_share.class);
                startActivity(intent);
            }
        });
    }
}
