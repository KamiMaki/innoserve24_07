package com.example.innoserve24_07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2_1);
        Button point = (Button)findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(layout2_1.this,layout2_1_point_market.class);
                startActivity(intent);
            }
        });


    }
}
