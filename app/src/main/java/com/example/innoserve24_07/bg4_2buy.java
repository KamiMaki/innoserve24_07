package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bg4_2buy extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg4_2buy);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(bg4_2buy.this);

                builder.setTitle("維骨力")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("100天購買一次\n下次購買時間：12月5日")
                        .setNegativeButton("關閉", null)
                        .show();
            }
            if(view.getId()==R.id.bt2)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(bg4_2buy.this);

                builder.setTitle("奶粉")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("20天購買一次\n下次購買時間：11月15日")
                        .setNegativeButton("關閉", null)
                        .show();
            }
            if(view.getId()==R.id.bt3)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(bg4_2buy.this);

                builder.setTitle("假牙清潔錠")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("60天購買一次\n下次購買時間：11月13日")
                        .setNegativeButton("關閉", null)
                        .show();
            }
        }
    };
}
