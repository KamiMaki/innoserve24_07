package com.example.innoserve24_07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EatTogether1_1_accepted_chatroom extends AppCompatActivity {

    private EditText et;
    private Button bt;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_together1_1_accepted_chatroom);
        et=(EditText)findViewById(R.id.et);
        tv=(TextView)findViewById(R.id.tv);
        bt=(Button)findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string="陳奶奶：\n"+et.getText().toString();
                tv.setText(string);
                et.setText("");
            }
        });
    }
}
