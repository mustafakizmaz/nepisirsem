package com.example.user.nepisirsem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class etTavukDetayActivity extends AppCompatActivity {

    private String pozisyonAnahtari = "pozisyonAnahtari";
    private int detayPozisyon;

    private TextView detayText;
    private String[] detayListe;

    private TextView link;
    private  String[] url;

    private TextView res;
    private ImageView imajlar;
    private  int[] imajlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifler);

        detayPozisyon = getIntent().getIntExtra(pozisyonAnahtari, -1);
        // internet
        url=new String[]{
                "https://youtu.be/_-n3FNfN9IY",
                "https://youtu.be/xHYDrUAhcYE",
                "ops",
                "https://www.youtube.com/watch?v=-etQBxEJTzI",
                "https://www.youtube.com/watch?v=BE67yRcDzow",
                "https://www.youtube.com/watch?v=ljzxxIGEaVs",
                "https://youtu.be/ljzxxIGEaVs",
                "https://youtu.be/Wb0EEnfP9jw",
        };
        link = (TextView) findViewById(R.id.link);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (detayPozisyon == -1) {
                    Toast.makeText(etTavukDetayActivity.this, "Hata", Toast.LENGTH_LONG).show();
                } else {
                    link.setText(url[detayPozisyon]);
                    Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse(url[detayPozisyon]));
                    startActivity(i);
                }
            }
        });
        //resim
        res = (TextView) findViewById(R.id.res);
        imajlist = new  int[]{
                R.drawable.acisoslubonfile,
                R.drawable.askindorugu,
                R.drawable.bogazliyantavasi,
                R.drawable.kuzuguvec,
                R.drawable.soyasoslusebzelitavuk,
                R.drawable.firindakasarlitavuk,
                R.drawable.firindapatatestava,
                R.drawable.firindatavuksis,
        };
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (detayPozisyon == -1) {
                    Toast.makeText(etTavukDetayActivity.this, "Hata", Toast.LENGTH_LONG).show();
                } else {
                    imajlar = new ImageView(getApplicationContext());
                    imajlar.setImageResource(imajlist[detayPozisyon]);
                    Toast toast = new Toast(getApplicationContext());
                    toast.setView(imajlar);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        //tarifler
        detayText = (TextView) findViewById(R.id.tarifler);
        detayText.setMovementMethod(new ScrollingMovementMethod());
        detayListe = new String[] {
                "       Malzemeler\n" +
                        "2 Soğan\n" +
                        "2 Havuç\n" +
                        "1 Kereviz\n" +
                        "1 Sap Pırasa\n" +
                        "1,2 kg Patates\n" +
                        "1 Demet Dereotu\n" +
                        "1 Çorba Kaşığı Margarin\n" +
                        "2 Et Suyu Tableti\n" +
                        "1 Defne Yaprağı\n" +
                        "1,3 kg Dana Fileto\n" +
                        "500 gr Süt Kreması\n" +
                        "Rendelenmiş Limon Kabuğu\n" +
                        "Tuz\n" +
                        "Karabiber\n" +
                        "             Yapılışı\n" +
                        "Soğanları kabuklarını soymadan doğrayın. " +
                        " Havuç, kereviz ve pırasayı yıkayıp ayıkladıktan sonra küçük küpler halinde doğrayın. " +
                        "Margarini bir tencerede eritin. Soğanları yağda kavurun. " +
                        " Sebzeleri ekleyip kavurmaya devam edin. 2,5 litre su ilave edin. " +
                        " Et suyu tabletlerini ekleyin. Tuz ve karabiberle tatlandırıp defne" +
                        " yaprağını ekleyin. Dilimlenmiş filetoyu tenceredeki karışıma ilave edip kısık ateşte" +
                        " 2 saat kadar pişirin. " +
                        "Bu arada patatesleri yıkayıp kabuklarını soyduktan sonra sekize bölün. " +
                        "Dereotunu yıkayıp ayıklayın ve ince ince kıyın. " +
                        "100 gr süt kremasını çırpıp limon kabuğu, tuz ve karabiberle tatlandırın." +
                        "Patatesleri haşlayın. " +
                        " Kalan süt kremasını dereotu ve suyu süzülmüş patatesle karıştırın. " +
                        "Tuz ve karabiberle tatlandırın. " +
                        "Eti tencereden alıp servis tabaklarına yerleştirin. " +
                        "Kremalı patates eşliğinde servis yapın. " +
                        "Öneri: Tencerede kalan et suyundan çorba yapabilirsiniz. " +
                        "Bunun için et suyunu bir süzgeçten geçirin." +
                        " Bir miktar su ve şehriye ekleyip tekrar pişirin. ",

                "        Malzemeler\n" +
                        "750 gr Bonfile\n" +
                        "2 Adet Soğan\n" +
                        "2 Çorba Kaşığı Margarin\n" +
                        "1 Çorba Kaşığı Un\n" +
                        "1 Çorba Kaşığı Salça\n" +
                        "2 Çay Kaşığı Hardal\n" +
                        "200 gr Krema\n" +
                        "1 Çay Kaşığı Karabiber\n" +
                        "1 Tatlı Kaşığı Limon\n" +
                        "Tuz\n" +
                        "            Yapılışı\n" +
                        "Eti yarım parmak kalınlığında ve iki parmak uzunluğunda doğrayıp, " +
                        "bir çay kaşığı karabiberle ovalım. " +
                        " Derince bir tavaya margarini alıp ince kıyılmış iki soğanı kısık ateşte on dakika çevirelim.  " +
                        "Etleri ilave edip harlı ateşte karıştırarak beş dakika kavuralım. " +
                        " Bir çorba kaşığı unu kavrulmakta olan etlere serpip karıştıralım.  " +
                        "Sonra bir çorba kaşığı domates salçası ile ikişer çay kaşığı hardal ve tuzu katıp, " +
                        "üç dört dakika daha harlı ateşte pişirelim. " +
                        "Bir bardak çiğ krema ile birkaç damla limon suyunu ilave edelim. " +
                        "Kaynatmadan iyice ısıtalım. Isıtılmış bir tabağa alıp hemen servis yapalım. " +
                        "Eğer bonfile yerine başka bir et kullanırsanız, " +
                        "kremayı eklemeden önce etleri yumuşayıncaya kadar " +
                        "kapalı olarak harlı olmayan ateşte pişirmeniz gerekir. " +
                        "     NOT: Mantarların kararmaması için limonlu suda haşlayın."+
                        "Acı sıır bon.",

                "       Malzemeler\n" +
                        "2 soğan\n" +
                        "4 patates\n" +
                        "4 biber yeşil, 2 kırmızı biber\n" +
                        "1 tüm Sarımsak\n" +
                        "1 çay bardağı sıvı yağ\n" +
                        "4 domates rendesi\n" +
                        "Yarım kilo et\n" +
                        "Kuyruk yağı\n" +
                        "           Yapılışı\n" +
                        "Tüm malzemeleri doğruyorum, " +
                        " bir tabakta tuzlayıp karıştırıyorum, tepsinin altına " +
                        " doğradığımız kuyruk yağını dizin, üzerine harmanladığımız " +
                        " sebzeleri ve 20 dk haşladığımız etleri, suyuyla beraber tepsiye " +
                        "koyalım, yarım çay bardağı sıvı yağı da gezdirip fırına verelim.",

                "       Malzemeler\n" +
                        "2 kg kuzu et ( kemikli)\n" +
                        "3 adet domates\n" +
                        "3 adet biber\n" +
                        "6 adet patates\n" +
                        "10-20 diş sarımsak\n" +
                        "Karabiber\n" +
                        "Tuz\n" +
                        "Yarım su bardağı su\n" +
                        "           Yapılışı\n" +
                        "Öncelikle etler güzelce yıkanıp güveç tenceresinin " +
                        "en altına dizilir. Daha sonra üzerine sırasıyla patates,  " +
                        " sarımsak domates ve biber eklenir. Tuzu ve karabiberini " +
                        "de attıktan sonra yarım su bardağı suyumuzu da koyarak " +
                        "kaynaması için ocağa alırız. Kaynadıktan sonra 45 dk " +
                        " pişmesi için kısık ateşte pişiririz. Etler pişince yemekte olmuş oluyor.",

                "       Malzemeler\n" +
                        "4- 6 parça tavuk pirzola ( kemikleri ve derisi çıkartılmış )\n" +
                        "200 gr kültür mantarı\n" +
                        "200 gr istiridye mantarı\n" +
                        "3 adet kırmızı biber\n" +
                        "3 adet sivri biber\n" +
                        "1 kutu haşlanmış mısır\n" +
                        "Pul biber\n" +
                        "        Marine için;\n" +
                        "Yarım su bardağı Soya sosu\n" +
                        "2 yemek kaşığı zeytinyağ\n" +
                        "1 çay kaşığı tuz\n" +
                        "        Makarna için,\n" +
                        "Yarım paket krema\n" +
                        "1 yemek kaşığı tavuk harcı baharati\n" +
                        "1 çay kaşığı tuz\n" +
                        "6-8 top tagliatelle makarna\n" +
                        "        Yapılışı\n" +
                        "öncelikle tavuklarımızın üzerine soya " +
                        "sosu, yağ ve ve tuz ekleyip en az yarım " +
                        " saat dinlendiriyoruz. Vaktiniz varsa 4-5 saat bekletebilirsiniz. " +
                        "Marine edilmiş tavuklarımızı çok kızgın mümkünse " +
                        "demir döküm ızgara tavada önce ilk yüzünü hiç dokunmadan " +
                        " yüksek ateşte 10 dakika sonra diğer yüzlerini 10 " +
                        "dakika pişiriyoruz. (bu aşamada kontrollü olursanız iyi " +
                        " olur yakmamaya dikkat edelim.) " +
                        "Kızaran tavuklarımızı kesme tahtasına alalım. " +
                        "Aynı tavaya irice doğranmış sebzelerimizi " +
                        "ve mısırlarımızı alıp soteleyelim. " +
                        "Tavuklarımızı  lokmalık doğrayıp sebzelerimizin " +
                        " üzerine ekleyelim. " +
                        "Yaklaşık 10 dakika da bu şekilde pişirelim. Pul " +
                        "biber ekleyip kapatalım. " +
                        "Ayrı bir tencerede bol su kaynatıp tuz ve sıvı yağ " +
                        " ekleyelim. Makarnalarımızı atıp isteğinize göre yaklaşık " +
                        "10 dakika pişirip süzün. " +
                        "Tencereye krema biraz sıvı yağ tuz ve tavuk baharatını " +
                        "ekleyip 1 dakika pişirin ve makarnalarımızı  ekleyip " +
                        " güzelce karıştırın. "+
                        "Servis tabağımızın  bir tarafına tavuklu harcı diğer " +
                        "tarafına makarnalarımızı koyalım ve sıcak servis yapalım.",

                "       Malzemeler\n" +
                        "2 adet tavuk göğsü\n" +
                        "2 adet biber\n" +
                        "3 adet domates\n" +
                        "Tereyağı\n" +
                        "3 diş sarımsak\n" +
                        "Karabiber\n" +
                        "Kırmızı biber\n" +
                        "Kimyon\n" +
                        "Kekik\n" +
                        "Tuz\n" +
                        "         Üzeri için;\n" +
                        "Rendelenmiş kaşar peyniri\n" +
                        "         Yapılışı\n" +
                        "Tavuk göğsünü kuşbaşı şeklinde doğradıktan " +
                        " sonra yıkayıp suyunun süzülmesini sağlayalım. " +
                        " Tencereye tavuğu koyup suyunu çekinceye kadar pişirelim. " +
                        " Domatesin kabuklarını soyup doğrayalım. Biberi ve sarımsağı " +
                        "da doğrayıp tencereye alalım. Yağları da ilave edip, baharatları " +
                        " da katalım. Hep birlikte soteleyelim. Biraz sulu kalırsa daha " +
                        " lezzetli oluyor. Tavuklar dağılmadan 15-20 dakika kadar pişirelim. " +
                        " Hazır olan yemeğimizi tepsimize alalım ve üzerine bolca kaşar " +
                        " rendeleyelim. Fırına verip 15-20 dakika kaşarlar kızarıncaya " +
                        "kadar pişirelim. Yemeğimiz hazır.",

                "        Malzemeler\n" +
                        "1 paket tavuk göğsü\n" +
                        "1 paket tavuk but\n" +
                        "5-6 patates\n" +
                        "1 adet soğan\n" +
                        "3 adet sarımsak\n" +
                        "5 adet yeşil biber\n" +
                        "3 adet domates\n" +
                        "2 kaşık bolca biber salçası\n" +
                        "Zeytinyağı\n" +
                        "Tuz\n" +
                        "Pul biber\n" +
                        "1 bardak su\n" +
                        "           Yapılışı\n" +
                        "Bu yemek Gaziantep yöresine aittir." +
                        "Öncelikle tavuk göğsünü doğruyoruz pişirme " +
                        "tepsimize koyuyoruz, ardından patatesleri küçük küpler" +
                        " halinde doğruyoruz ekliyoruz, biberleri yemeklik olacak " +
                        "şekilde doğruyoruz ekliyoruz, domatesleri salataya doğradığımız " +
                        "gibi doğrayıp ekliyoruz, soğanı halka halka doğrayıp ekliyoruz, " +
                        "3 adet sarımsağımızı ekliyoruz, butların üzerine bıçakla çizik " +
                        "atarak ekliyoruz, son olarak bolca zeytinyağı ve 2 kaşık biber " +
                        " salçamızı ekleyerek elimiz yardımı ile tüm malzemeleri yoğurur " +
                        "gibi karıştırıp salçanın dağılmasını sağlıyoruz. 1 bardak su " +
                        "ilave ederek fırına veriyoruz, 1-1, 5 saat pişiriyoruz ama 1 " +
                        " buçuk saatte daha güzel pişiyor.",

                "       Malzemeler\n" +
                        "600 gram tavuk göğsü ( ben göğüs içi fileto aldım tavuk göğsünün en lezzetli yeri)\n" +
                        "Tavuk baharatı\n" +
                        "1 diş sarımsak\n" +
                        "Pul biber\n" +
                        "Sıvı yağ\n" +
                        "Yarım çay bardağı süt\n" +
                        "Çöp şiş çubuk\n" +
                        "           Yapılışı\n" +
                        "Tavuk baharatı ,ezilmiş sarımsak ,süt ,sıvı " +
                        " yağ iyice karıştıralım. Küp küp kestiğimiz tavuk " +
                        " filetolarını harcın içinde karıştırıp 1 saat bekletelim. " +
                        " ( acı olanını ayrı tabakta pul biberledim)arada çöp şişlerimizi " +
                        " suyun içinde yarım saat bekletelim( etler piştikten sonra şişten " +
                        "daha kolay çıkıyor). Sonra etleri şişlere geçirip hatta tepsiye " +
                        " domates, soğan, biberde koyalım ve önceden ısıtılmış ızgara " +
                        "fırına sürelim. Teflon tavada olur ben fırının ızgara bölümünü " +
                        "kullandım. Yaklaşıp 20 dakika sonra tavuk şişler hazır."
        };
        if (detayPozisyon == -1) {
            Toast.makeText(etTavukDetayActivity.this, "Hata", Toast.LENGTH_LONG).show();
        } else {
            detayText.setText(detayListe[detayPozisyon]);
        }
    }
}
