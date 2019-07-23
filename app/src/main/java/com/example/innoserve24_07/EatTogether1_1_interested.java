package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class EatTogether1_1_interested extends AppCompatActivity {

    Button par;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_together1_1_interested);
        par=(Button)findViewById(R.id.par);
        par.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(EatTogether1_1_interested.this);
                builder.setTitle("鄭奶奶揪吃飯")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("您確定要參加嗎?")
                        .setNegativeButton("不要參加", null)
                        .setPositiveButton("我要參加", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                accepted();
                            }
                        })
                        .show();

            }
        });
    }

  
    private void accepted() {
        AlertDialog.Builder MyAlertDialog = new AlertDialog.Builder(this);
        MyAlertDialog.setTitle("新活動");
        MyAlertDialog.setMessage("您已成功報名!");
        DialogInterface.OnClickListener OkClick = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // 如果不做任何事情 就會直接關閉 對話方塊
            }
        };
        ;
        //MyAlertDialog.setPositiveButton("   關閉", OkClick);
        MyAlertDialog.show();

    }
}
