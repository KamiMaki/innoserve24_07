package com.example.innoserve24_07;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chatbot extends AppCompatActivity {
 Button ask,Medicine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        ask=(Button)findViewById(R.id.ask);
        Medicine=(Button)findViewById(R.id.Medicine);
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://nav.cx/irJd3Vx");//要跳转的网址
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        Medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =getPackageManager().getLaunchIntentForPackage(("com.Happy.Medicine"));
                startActivity(intent);
            }
        });


    }
}
