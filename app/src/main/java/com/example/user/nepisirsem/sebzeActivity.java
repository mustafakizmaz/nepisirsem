package com.example.user.nepisirsem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sebzeActivity extends AppCompatActivity {

    private ListView sebzelist;
    private String[] sebzeElemanlari;
    private String pozisyonAnahtari = "pozisyonAnahtari";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebze);

        sebzelist= (ListView) findViewById(R.id.sebzelist);
        sebzeElemanlari = new String[]{
                "Bademli ve Kaşarlı Karışık Sebze",
                "Ballı Sebze",
                "Buharda Türlü",
                "Etli Sebze Yemeği",
                "Fesleğenli Sebze Yahnisi",
                "Etli Kabak Dolması",
                "Pırasa Mücveri",
                "Beyaz Lahana Sarması",
                "Zeytin Yağlı Yaprak Sarması"
        };
        ArrayAdapter<String> basitAdaptor = new ArrayAdapter<String>(sebzeActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1,sebzeElemanlari);

        sebzelist.setAdapter(basitAdaptor);
        sebzelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(sebzeActivity.this,sebzeDetayActivity.class);
                intent.putExtra(pozisyonAnahtari, position);
                startActivity(intent);
            }
        });
    }
}
