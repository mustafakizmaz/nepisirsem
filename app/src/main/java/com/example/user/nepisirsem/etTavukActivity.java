package com.example.user.nepisirsem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class etTavukActivity extends AppCompatActivity {

    private ListView etTavuklist;
    private String[] etTavukElemanlari;
    private String pozisyonAnahtari = "pozisyonAnahtari";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_et_tavuk);

        etTavuklist = (ListView) findViewById(R.id.etlist);
        etTavukElemanlari = new String[] {
                "Acı Soslu Sığır Bonfile",
                "Aşkın Doruğu",
                "Boğazlıyan Tavası",
                "Kuzu Güveç",
                "Soya Soslu Sebzeli Tavuk",
                "Fırında Kaşarlı Tavuk",
                "Fırında Patates Tava",
                "Tavuk Şiş"
        };
        ArrayAdapter<String> basitAdaptor = new ArrayAdapter<String>(etTavukActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, etTavukElemanlari);

        etTavuklist.setAdapter(basitAdaptor);
        etTavuklist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(etTavukActivity.this,etTavukDetayActivity.class);
                intent.putExtra(pozisyonAnahtari, position);
                startActivity(intent);
            }
        });
    }
}
