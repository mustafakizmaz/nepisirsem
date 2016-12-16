package com.example.user.nepisirsem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button corba;
    private Button etTavuk;
    private Button sebze;
    private Button içecek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corba=(Button) findViewById(R.id.corba);
        corba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,corbaActivity.class);
                startActivity(i);
            }
        });
        etTavuk=(Button) findViewById(R.id.et);
        etTavuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,etTavukActivity.class);
                startActivity(i);
            }
        });
        sebze=(Button) findViewById(R.id.sebze);
        sebze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,sebzeActivity.class);
                startActivity(i);
            }
        });
        içecek=(Button) findViewById(R.id.icecek);
        içecek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,icecekActivity.class);
                startActivity(i);
            }
        });
    }
}