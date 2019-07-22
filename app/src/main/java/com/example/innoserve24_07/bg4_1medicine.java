package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bg4_1medicine extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg4_1medicine);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt1.setOnClickListener(listener);
        bt2.setOnClickListener(listener);
        bt3.setOnClickListener(listener);
    }

    private Button.OnClickListener listener=new Button.OnClickListener(){

        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.bt1)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(bg4_1medicine.this);

                builder.setTitle("糖尿病藥")
                    .setIcon(R.mipmap.ic_launcher)
                    .setMessage("早上7點\n中午12點30分\n晚上6點")
                    .setPositiveButton("關閉", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .show();
            }
            if(view.getId()==R.id.bt2)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(bg4_1medicine.this);

                builder.setTitle("心臟病藥")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("早上7點")
                        .setPositiveButton("關閉", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();
            }
            if(view.getId()==R.id.bt3)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(bg4_1medicine.this);

                builder.setTitle("感冒藥")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("早上9點\n晚上9點")
                        .setPositiveButton("關閉", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();
            }
        }
    };
}
