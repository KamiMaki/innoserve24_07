package com.example.innoserve24_07;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class taoyuan_point extends AppCompatActivity {
    ImageView img;
    private ListView listView;
    private ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taoyuan_point);
        img = findViewById(R.id.imageView11);
        img.setImageAlpha(200);//0~255

        listView = (ListView) findViewById(R.id.listview);
        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]
                {"桃園客運                                             18點",
                "中壢客運                                             20點",
                        "台北捷運                                             15元"});
        listView.setAdapter(listAdapter);


    }
}
