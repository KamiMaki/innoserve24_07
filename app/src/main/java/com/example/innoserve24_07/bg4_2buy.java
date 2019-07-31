package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bg4_2buy extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;
    Button bt5;
    TextView buyText;
    Button buybt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg4_2buy);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt5=(Button)findViewById(R.id.bt5);
        buybt=(Button)findViewById(R.id.buybt);
        buyText=(TextView)findViewById(R.id.buyText);
        bt1.setOnClickListener(listener);
        bt2.setOnClickListener(listener);
        bt3.setOnClickListener(listener);

        final EditText item = new EditText(this);
        final EditText day = new EditText(this);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(bg4_2buy.this);
                builder.setTitle("新增項目")
                        .setMessage("請輸入項目:")
                        .setView(item)
                        .setPositiveButton("繼續", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String string="4."+item.getText().toString();
                                buyText.setText(string);
                                AlertDialog.Builder builder=new AlertDialog.Builder(bg4_2buy.this);
                                builder.setTitle("新增項目")
                                        .setMessage("請輸入幾天購買一次:\n舉例:20")
                                        .setView(day)
                                        .setPositiveButton("新增", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                buybt.setText("查看");
                                                buybt.setBackgroundColor(Color.LTGRAY);
                                            }
                                        })
                                        .show();
                            }
                        })
                        .show();
               // buyText.setText("4."+item.getText().toString());
            }
        });
        buybt.setVisibility(View.VISIBLE);
        buybt.setBackgroundColor(Color.TRANSPARENT);
        buybt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(bg4_2buy.this);
                builder.setTitle(item.getText())
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage(day.getText()+"天購買一次\n下次購買時間 : 11月30日")
                        .setPositiveButton("關閉", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                buybt.setText("查看");
                                buybt.setBackgroundColor(Color.LTGRAY);
                            }
                        })
                        .show();
            }
        });
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
