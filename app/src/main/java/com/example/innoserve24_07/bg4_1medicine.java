package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bg4_1medicine extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;
    Button bt;
    Button add;
    TextView addtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg4_1medicine);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt=(Button)findViewById(R.id.bt);
        add=(Button)findViewById(R.id.add);
        final MyApplication myApplication = (MyApplication) getApplicationContext();

        bt1.setOnClickListener(listener);
        bt2.setOnClickListener(listener);
        bt3.setOnClickListener(listener);
        addtext=(TextView) (findViewById(R.id.addtext));
        final EditText kkk = new EditText(this);
       // addtext = findViewById(R.id.addtext);
        final EditText input = new EditText(this);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                AlertDialog.Builder builder=new AlertDialog.Builder(bg4_1medicine.this);
                builder.setTitle("新增項目")
                        .setMessage("請輸入項目:")
                        .setView(input)
                        .setPositiveButton("繼續", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String string="4."+input.getText().toString();
                                addtext.setText(string);
                                AlertDialog.Builder builder=new AlertDialog.Builder(bg4_1medicine.this);
                                builder.setTitle("新增項目")
                                        .setMessage("請輸入提醒時間:\n舉例:早上9點")
                                        .setView(kkk)
                                        .setPositiveButton("新增",null)
                                        .show();
                                add.setText("查看");
                            }
                        })
                        .show();
                myApplication.medicine=1;
            }
        });
        if(myApplication.medicine==0)
        {
            add.setVisibility(View.VISIBLE);
            add.setBackgroundColor(Color.TRANSPARENT);
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder=new AlertDialog.Builder(bg4_1medicine.this);
                    builder.setTitle(input.getText())
                            .setIcon(R.mipmap.ic_launcher)
                            .setMessage(kkk.getText())
                            .setPositiveButton("關閉",null)
                            .show();
                }
            });
        }


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(bg4_1medicine.this);
                builder.setTitle(input.getText())
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage(kkk.getText())
                        .setPositiveButton("關閉",null)
                        .show();
            }
            });
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
                        .setNegativeButton("關閉", null)
                    .show();
            }
            if(view.getId()==R.id.bt2)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(bg4_1medicine.this);

                builder.setTitle("心臟病藥")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("早上7點")
                        .setNegativeButton("關閉", null)
                        .show();
            }
            if(view.getId()==R.id.bt3)
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(bg4_1medicine.this);

                builder.setTitle("感冒藥")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("早上9點\n晚上9點")
                        .setNegativeButton("關閉", null)
                        .show();
            }

        }
    };
}
