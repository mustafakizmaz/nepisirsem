package com.example.user.nepisirsem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class corbaActivity extends AppCompatActivity {

    private ListView corbalist;
    private String[] corbaElemanlari;
    private String pozisyonAnahtari = "pozisyonAnahtari";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corba);

        corbalist = (ListView) findViewById(R.id.corbalist);
        corbaElemanlari = new String[] {
                "Düğün Çorbası",
                "Tavuk Çorbası",
                "Fıstık Çorbası",
                "Kremalı Mantar Çorbası",
                "Kuzu Etli Sorpa",
                "Yayla Çorbası",
                "Tel Şehriye Çorbası",
                "Nar Ekşili Ezogelin Çorbası",
                "Terbiyeli Buğday Çorbası"
        };
        ArrayAdapter<String> basitAdaptor = new ArrayAdapter<String>(corbaActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, corbaElemanlari);

        corbalist.setAdapter(basitAdaptor);
        corbalist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(corbaActivity.this,corbaDetayActivity.class);
                intent.putExtra(pozisyonAnahtari, position);
                startActivity(intent);
            }
        });
    }
}

