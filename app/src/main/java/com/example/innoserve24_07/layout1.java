package com.example.innoserve24_07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1);
        Button act =(Button)findViewById(R.id.act);//依活動搜尋
        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(layout1.this,EatTogether1_1.class);
                startActivity(intent);
            }
        });
        Button mapp =(Button)findViewById(R.id.mapp);//原本的
        mapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(layout1.this,PokemonGon.class);
                startActivity(intent);
            }
        });

    }
}
