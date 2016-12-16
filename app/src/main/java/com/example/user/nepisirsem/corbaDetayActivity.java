package com.example.user.nepisirsem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class corbaDetayActivity extends AppCompatActivity {

    private String pozisyonAnahtari = "pozisyonAnahtari";
    private int detayPozisyon;

    private TextView detayText;
    private String[] detayListe;

    private TextView link;
    private  String[] url;

    private TextView res;
    private ImageView imajlar;
    private int[] imajlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifler);

        detayPozisyon = getIntent().getIntExtra(pozisyonAnahtari, -1);
        // internet
        url=new String[]{
                "https://youtu.be/LifBShAvsjk",
                "https://www.youtube.com/watch?v=26uO62qq2Z8",
                "https://www.youtube.com/watch?v=6HCSci4xW9M",
                "https://www.youtube.com/watch?v=8k_WQN160HI",
                "https://youtu.be/ItGqPbj-qVk",
                "https://youtu.be/DFkxiEU9_kc",
                "https://youtu.be/d4KkzXm9RJE",
                "https://youtu.be/RKXjprHk95A",
                "https://youtu.be/Q_j2s23DjDo",
        };
        link = (TextView) findViewById(R.id.link);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (detayPozisyon == -1) {
                    Toast.makeText(corbaDetayActivity.this, "Hata", Toast.LENGTH_LONG).show();
                } else {
                    link.setText(url[detayPozisyon]);
                    Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse(url[detayPozisyon]));
                    startActivity(i);
                }
            }
        });
        //resim
        res = (TextView) findViewById(R.id.res);
        imajlist = new int[]{
                R.drawable.duguncorbasi,
                R.drawable.tavukcorbasi,
                R.drawable.fistikcorbasi,
                R.drawable.kremalimantarcorbasi,
                R.drawable.kuzuetlisorpa,
                R.drawable.yaylacorbasi,
                R.drawable.telsehriye,
                R.drawable.ezogelincorbasi,
                R.drawable.terbiyelibugday,
        };
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (detayPozisyon == -1) {
                    Toast.makeText(corbaDetayActivity.this, "Hata", Toast.LENGTH_LONG).show();
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
        detayListe = new String[]{
                "        Malzemeler\n" +
                        "100 gr Kuzu Gerdan\n" +
                        "2 Çorba Kaşığı Un\n" +
                        "2 Çorba Kaşığı Yoğurt\n" +
                        "1/2 Çay Bardağı Limon Suyu\n" +
                        "1 Adet Yumurta\n" +
                        "4 Su Bardağı Et Suyu\n" +
                        "3 Çorba Kaşığı Tereyağı\n" +
                        "Bir Tutam Kırmızıbiber\n" +
                        "Tuz\n" +
                        "          Yapılışı\n" +
                        "Kuzu gerdanını 4 su bardağı suda haşlayın." +
                        "Küp küp doğrayın. Suyunu süzüp, ayrı bir tencereye alın." +
                        "2 çorba kaşığı un, 2 çorba kaşığı yourt, yarım çay bardağı" +
                        " limon suyu ve yumurtayı derin bir kapta iyice çırpın." +
                        "Yavaş yavaş ocaktaki et suyuna ilave edin. Tuzunu ayarladıktan sonra etleri ilave edin." +
                        "Tencereyi ocaktan alın. Ayrı bir yerde 3 çorba kaşığı tereyağında " +
                        "bir tutam kırmızıbiberi yakıp, çorbanın üzerine gezdirin.",

                "       Malzemeler\n" +
                        "1 lt Tavuk Suyu\n" +
                        "150 gr Haşlanmış Tavuk Göğsü\n" +
                        "1 Küçük Soğan\n" +
                        "Ceviz Büyüklüğünde Zencefil\n" +
                        "4 Çorba Kaşığı Soya Yağı\n" +
                        "1/2 Demet Maydanoz\n" +
                        "2 Çorba Kaşığı Soya Sosu\n" +
                        "2 Yufka\n" +
                        "1 Havuç\n" +
                        "1 Sap Pırasa\n" +
                        "1 Çorba Kaşığı Zeytinyağı\n" +
                        "Tuz\n" +
                        "Karabiber\n" +
                        "           Yapılışı\n" +
                        "Evde hazırlanmış tavuk suyunuz, yoksa bunun yerine et suyu tabletlerini de kullanabilirsiniz." +
                        "Tabletleri paketin üzerindeki tarife göre 1 lt tavuk suyu elde edebilecek biçimde hazırlayın." +
                        " Soğanı soyup küçük küpler halinde doğrayın. Zencefili rendenin ince tarafı ile rendeleyin." +
                        " Bir tencerede 1 tatlı kaşığı soya yağını kızdırıp soğan ve zencefili kavurun." +
                        "Tavuk göğsünü çok küçük küpler halinde doğrayın. Maydanozu yıkayıp ayıkladıktan sonra ince ince kıyın. " +
                        "Bir kasede maydanoz, et ve 1-2 çorba kaşığı soya yağını karıştırıp soğanlı karışıma ilave edin." +
                        "Tenceredeki karışımı soya sosu, tuz ve karabiberle tatlandırın." +
                        "Yufkaları kareler halinde sekize bölün. Her bir kareye hazırladığınız soğanlı karışımdan doldurun." +
                        " Karelerin kenarlarını su ile nemlendirin ve iç malzemeyi kapatacak şekilde birleştirip bükün." +
                        " Büyük tencerede tuzlu su kaynatıp yufka bohçalarını 2-3 dakika" +
                        " kadar haşayın. Haşlanmış yufkaların suyunu süzün." +
                        "Havucu soyup ince şeritler halinde doğrayın. Pırasayı ayıklayıp ince şeritler halinde doğrayın. " +
                        "Büyük bir tencerede kalan soya yağını kızdırıp havuç ve pırasayı kavurun." +
                        "Tavuk suyunu ekleyin. Soya sosu ve zeytinyağını ilave edin. Yufka bohçalarını ekleyip servis yapın.",


                "       Malzemeler\n" +
                        "50 gr dolmalık fıstık\n" +
                        "5-6 su bardağı et suyu\n" +
                        "2 çorba kaşığı tereyağı \n" +
                        "3 çorba kaşığı un\n" +
                        "Yeteri kadar tuz\n" +
                        "Terbiyesi için :\n" +
                        "1 adet yumurta sarısı\n" +
                        "Yarım limon\n" +
                        "          Üzeri için \n" +
                        "1 çorba kaşığı tereyağı\n" +
                        "Yeteri kadar kırmızı biber\n" +
                        "          Yapılışı\n" +
                        "Bir kapta 2 çorba tereyağını eritin. Dolmalık fıstıkları içerisine ilave ederek kavurun." +
                        " Fıstıkları yakmadan başka bir kaba alın. Aynı yağda unu" +
                        " kavurun. Yavaş yavaş karıştırarak içerisine et suyunu ilave edin. " +
                        "Üzerine tuz dökün. Fıstıkları robottan geçirerek içerisine ilave edin ve bir süre kaynatın." +
                        "Bir kapta yumurta sarısı ile limon suyunu çırpın. İçerisine çorbadan bir kepçe alıp" +
                        " ilave ederek ılındırın." +
                        "Tencereye koyarak bir taşım kaynatın. Bir kapta tereyağını kırmızı biberle yakın. " +
                        "Çorbanın üzerinde gezdirin. Limon dilimi ile sıcak olarak servise sunun.",

                "       Malzemeler\n" +
                        "7-8 Adet Mantar\n" +
                        "1/2 Soğan\n" +
                        "125 gr. Tereyağı\n" +
                        "2 Çorba Kaşığı Un\n" +
                        "1/2 Su Bardağı Süt\n" +
                        "1 Et Suyu Tableti\n" +
                        "3.5 Su Bardağı Su\n" +
                        "1/2 Paket Krema\n" +
                        "Tuz\n" +
                        "             Üzerine\n" +
                        "1 Çorba Kaşığı Tereyağı\n" +
                        "             Yapılışı\n" +
                        "Mantarları ve soğanı çok ince doğrayın. Teflon tavada sote edin." +
                        "Ayrı bir kapta tereyağını eritin. 2 Çorba kaşığı unu kavurun." +
                        " Yarım su bardağı süt ve et suyu tabletini ilave edin. 3.5 su bardağı suyu ekleyin." +
                        "Sote edilmiş mantarları da tencereye alın." +
                        " Kaynayınca kremayı ve tuzu ekleyin. tencereyi ocaktan alın." +
                        "Tereyağını eritin, çorbanın üzerine gezdirip, servis yapın.",

                "        Malzemeler\n" +
                        "500 gr kuşbaşı kuzu eti\n" +
                        "1 adet orta boy soğan\n" +
                        "1,5 yemek kaşığı un\n" +
                        "Yarım demet taze soğanın yeşili\n" +
                        "4-5 dal taze nane\n" +
                        "1 ufak kase yoğurt\n" +
                        "Yeteri kadar tuz, karabiber, pul biber\n" +
                        "1 yemek kaşığı margarin\n" +
                        "             Yapılışı\n" +
                        "Bir tencerenin içine margarini koyun. " +
                        "Ufak ufak doğradığınız soğanları pembeleşene kadar bu yağda kavurun. " +
                        "Etleri ilave edip biraz daha beraber kavurun. " +
                        "Sonra içine bol su ilave edip etler yumuşayana kadar pişirin." +
                        " Tuzunu ve karabiberini ekleyip ılınıncaya kadar bekleyin." +
                        "Unu ve yoğurdu karıştırıp iyice çırpın. Karıştıra karıştıra etlerin üzerine ekleyin." +
                        " Taze soğanın yeşilini ve nane yapraklarını doğrayıp içine karıştırın." +
                        " Servis tabaklarına alıp, üzerine pul biberi serperek servise sunun.",

                "        Malzemeler\n" +
                        "1 çay bardağından biraz (bir parmak) eksik pirinç\n" +
                        "6-7 bardak su (Koyu/Sıvı oranına göre ayarlayabilirsiniz)\n" +
                        "1 kase yoğurt\n" +
                        "1 adet yumurta\n" +
                        "1,5 yemek kaşığı un\n" +
                        "Sıvı yağ\n" +
                        "Nane\n" +
                        "Tuz\n" +
                        "             Yapılışı\n" +
                        "Tencereye ayıklanmış şekilde pirinci koyup" +
                        " su ilave ederek yumuşayıncaya kadar kaynamasını" +
                        " bekleyiniz. Pirinçler yumuşayana kadar sosunu hazırlayalım." +
                        " Yoğurdun içine 1 adet yumurtayı kırıp iyice çırpınız." +
                        " Unu ilave ederek çırpmaya devam ediniz. Kaynamakta " +
                        "olan çorbanın suyundan biraz ilave ederek sosu sulandırıp " +
                        "karıştırın. Pirinçler yumuşayıp piştikten sonra sosu ilave" +
                        " ederek karıştırmaya devam ediniz. Bir tavada yağı çok " +
                        "ısıtmadan naneyi ilave ederek çok karartmadan altını kapatın. " +
                        "Çorbaya naneli yağı dökerken çok dikkat edin, kızgın yağ " +
                        "çorbada sıçrama yapabilir. Naneyi çorbaya ilave ettikten " +
                        "sonra biraz karıştırın ve tuzunu ağız tadınıza göre koyun.",

                "       Malzemeler\n" +
                        "2 çorba kaşığı tereyağı\n" +
                        "1 tane yeşil biber\n" +
                        "1 tatlı kaşığı un\n" +
                        "1 su bardağı domates rendesi\n" +
                        "1.5 litre sıcak su\n" +
                        "1 su bardağı tel şehriye\n" +
                        "1 tane tavuk bulyon\n" +
                        "           Yapılışı\n" +
                        "Öncelikle tencereye tereyağını " +
                        " alıyoruz ve eritiyoruz. İçerisinde halka şeklinde" +
                        "yeşil biberi doğruyoruz. Sotelenince 1 tatlı kaşığı" +
                        "unu ekliyoruz ve karıştırıyoruz. İyice karışınca" +
                        " 1 su bardağı domates rendesini ekliyoruz." +
                        " Karışım kıvam alınca 1.5 litre sıcak suyu ilave" +
                        " ediyoruz. Sonrasında tel şehriyeyi ve tavuk bulyonu ekleyip" +
                        " biraz karıştırıyoruz. Şehriyeler pişince ocağı kapatabiliriz.",

                "       Malzemeler\n" +
                        "2/3 su bardağı kırmızı mercimek\n" +
                        "3 yemek kaşığı bulgur\n" +
                        "2 yemek kaşığı pirinç\n" +
                        "1 adet soğan\n" +
                        "5 – 6 yemek kaşığı zeytinyağı\n" +
                        "1 yemek kaşığı domates salçası\n" +
                        "1/2 yemek kaşığı biber salçası\n" +
                        "8-10 su bardağı su (kontrollü ekleyiniz)\n" +
                        "1 limonun suyu\n" +
                        "1,5 yemek kaşığı nar ekşisi\n" +
                        "Tuz\n" +
                        "Karabiber\n" +
                        "Nane\n" +
                        "Arzuya göre pul biber\n" +
                        "            Yapılışı\n" +
                        "Tencereye az sıvı yağ ile doğranmış" +
                        " soğanları alalım. Üzerine bulguru, pirinci ve" +
                        " mercimeği ilave edelim. 8 su bardağı suyu ilave edip " +
                        "kaynamaya bırakalım. Kıvamına göre sıcak su takviyesi yapabiliriz." +
                        "Bakliyatlar haşlandıktan sonra püre olmayacak şekilde" +
                        " blenderdan geçirelim. Ayrı bir tavada zeytinyağını hafif " +
                        "kızdırdıktan sonra domates ve biber salçasını ekleyip kavuralım. " +
                        "Tuzunu ve baharatlarını ekleyip biraz daha karıştırdıktan " +
                        " sonra ocaktan alıp çorbaya ekleyelim." +
                        "Limon suyunu ekledikten sonra karıştıralım." +
                        "15-20 dakika kadar kaynattıktan sonra ocaktan alalım " +
                        "ve nar ekşisi ekleyip karıştıralım. 5-10 dakika dinlendirdikten sonra sıcak olarak servis yapalım.",

                "       Malzemeler\n" +
                        "1 su bardağı buğday\n" +
                        "1 kase süzme yoğurt\n" +
                        "2 çorba kaşığı un\n" +
                        "yarım limon\n" +
                        "1 çorba kaşığı tereyağı\n" +
                        "nane\n" +
                        "pul biber\n" +
                        "tuz\n" +
                        "             Yapılışı\n" +
                        "Buğdayı sıcak suda bekletelim ve" +
                        " yıkayıp tencereye alalım. Suyunu ilave edelim. " +
                        "Haşlanıp suyunu tamamen çektikten sonra altını " +
                        "kapatalım ve terbiyesini yapmaya başlayalım." +
                        "Terbiyesi için, yoğurdu, unu ve limon suyunu bir " +
                        "kasede karıştırıyoruz. Soğuk su koyup çırpma teliyle " +
                        " karıştırarak kıvamını açıyoruz. Daha sonra sıcak su " +
                        "koyuyoruz ve bir yandan da çırpma teliyle hızlıca karıştırıyoruz. " +
                        "Terbiyeyi tencereye alıp kaynamaya bırakıyoruz. Sıcak su " +
                        " ekleyerek çorba kıvamına getiriyoruz. Buğdayı ilave ediyoruz. " +
                        "Tuzunu atıyoruz ve pişiriyoruz. Küçük bir tavaya tereyağı " +
                        "koyup eritiyoruz. İçine nane ve pul biber atıyoruz. Çorba " +
                        "kıvamına gelip pişince servis kasesine döküyoruz. Tereyağlı " +
                        "sosu üzerine gezdirerek servis ediyoruz."
        };
        if (detayPozisyon == -1) {
            Toast.makeText(corbaDetayActivity.this, "Hata", Toast.LENGTH_LONG).show();
        } else {
            detayText.setText(detayListe[detayPozisyon]);
        }
    }
}