package com.example.innoserve24_07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bg4_3question extends AppCompatActivity {

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg4_3question);
        bt=(Button)findViewById(R.id.bt6);
       // bt.setOnClickListener(listener);
    }
    /*private Button.OnClickListener listener= new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.bt6){

            }
        }
    };*/
}
