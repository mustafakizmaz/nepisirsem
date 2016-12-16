package com.example.user.nepisirsem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class icecekActivity extends AppCompatActivity {

    private ListView içeceklist;
    private String[] içecekElemanlari;
    private String pozisyonAnahtari = "pozisyonAnahtari";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icecek);

        içeceklist = (ListView) findViewById(R.id.içeceklist);
        içecekElemanlari = new String[]{
                "Yoğurtlu Milkshake ",
                "Muzlu Süt",
                "Çilek Şerbeti",
                "Serinleten Yaz İçeceği",
                "Çikolatalı Latte",
                "Boza",
                "Sıcak Çikolata",
                "Çilekli ve Portakallı Smoothie",
                "Ahududulu Kokteyl"
        };
        ArrayAdapter<String> basitAdaptor = new ArrayAdapter<String>(icecekActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1,içecekElemanlari);

       içeceklist.setAdapter(basitAdaptor);
        içeceklist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(icecekActivity.this,icecekDetayActivity.class);
                intent.putExtra(pozisyonAnahtari, position);
                startActivity(intent);
            }
        });
    }
}
