package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class chatbot extends AppCompatActivity {
 Button askme,Medicine,note,note2;
 private static MediaPlayer mp = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        try {
            //R.raw.notice 是ogg格式的音频 放在res/raw/下
            AssetFileDescriptor afd = getApplicationContext().getResources().openRawResourceFd(R.raw.alert);
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp.setAudioStreamType(AudioManager.STREAM_RING);
            afd.close();
            mp.prepare();
        } catch (Exception e) {
            e.printStackTrace();
        }

        askme=(Button)findViewById(R.id.askme);
        Medicine=(Button)findViewById(R.id.Medicine);
        note=(Button)findViewById(R.id.note);
        note2=(Button)findViewById(R.id.note2);
        askme.setOnClickListener(new View.OnClickListener() {
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
        note = (Button)findViewById(R.id.note);
        note.setVisibility(View.VISIBLE);
        note.setBackgroundColor(Color.TRANSPARENT);
        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(chatbot.this);
                builder.setTitle("吃藥提醒")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("\n已新增提醒")
                        .setNegativeButton("太好了",null)
                        .show();
            }
        });

        note2 = (Button)findViewById(R.id.note2);
        note2.setVisibility(View.VISIBLE);
        note2.setBackgroundColor(Color.TRANSPARENT);
        note2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                AlertDialog.Builder builder = new AlertDialog.Builder(chatbot.this);
                builder.setTitle("吃藥！！！")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("\n現在要吃早上的藥喔！")
                        .setNegativeButton("太好了",null)
                        .show();
            }
        });
    }
}
