package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PokemonGon_shake extends AppCompatActivity {
Button yes;
Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_gon_shake);
        yes=(Button)findViewById(R.id.yes);
        no=(Button)findViewById(R.id.no);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PokemonGon_shake.this);
                builder.setTitle("加好友")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("您已成功加   杜爺爺   為好友")
                        .setPositiveButton("太好了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                PokemonGon_shake.this.finish();
                            }
                        })
                        .show();
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PokemonGon_shake.this);
                builder.setTitle("加好友")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("基於您已經那麼用力搖了\n您還是跟  杜爺爺  成為好友了\n去好友名單確認吧!")
                        .setPositiveButton("那很好啊", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                PokemonGon_shake.this.finish();
                            }
                        })
                        .show();
            }
        });
    }
}
