package com.example.user.nepisirsem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class sebzeDetayActivity extends AppCompatActivity {

    private String pozisyonAnahtari = "pozisyonAnahtari";
    private int detayPozisyon;

    private TextView detayText;
    private String[] detayListe;

    private TextView link;
    private  String[] url;
    private WebView web;

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
                "https://www.youtube.com/watch?v=XBQ84bMNyJM",
                "https://www.youtube.com/watch?v=lK-wj0WNCf4",
                "https://www.youtube.com/watch?v=cun1_3G0Gzk",
                "https://www.izlesene.com/video/sebzeli-turlu-tarifi/7782466",
                "http://lezzetler.com/sebzeli-tavuk-yahni-gorsel-tarif-117323",
                "https://www.youtube.com/watch?v=UyOhDcEpcik",
                "https://www.youtube.com/watch?v=0H4SBhDx0ho",
                "https://www.youtube.com/watch?v=UhNlkDNm9lE",
                "https://www.youtube.com/watch?v=ux1XC_L1qvI"
        };
        link = (TextView) findViewById(R.id.link);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (detayPozisyon == -1) {
                    Toast.makeText(sebzeDetayActivity.this, "Hata", Toast.LENGTH_LONG).show();
                } else {
                    detayText.setText(url[detayPozisyon]);
                    Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse(url[detayPozisyon]));
                    startActivity(i);
                }
            }
        });
        //resim
        res = (TextView) findViewById(R.id.res);
        imajlist = new  int[]{
                R.drawable.bademlivekasarlisebze,
                R.drawable.ballisebze,
                R.drawable.buhardaturlu,
                R.drawable.etlisebze,
                R.drawable.feslegenlisebze,
                R.drawable.etlikabakdolmasi,
                R.drawable.pirasamucveri,
                R.drawable.beyazlahana,
                R.drawable.zeytinyagliyapraksarmasi
        };
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (detayPozisyon == -1) {
                    Toast.makeText(sebzeDetayActivity.this, "Hata", Toast.LENGTH_LONG).show();
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
        detayText = (TextView) findViewById(R.id.tarifler);
        detayText.setMovementMethod(new ScrollingMovementMethod());
        detayListe = new String[] {
                        "           Malzemeler\n" +
                        "800 gr Patates\n" +
                        "200 gr Bezelye\n" +
                        "1 Adet Soğan\n" +
                        "100 gr Jambon\n" +
                        "1 Adet Mozzarella ya da Dil Peyniri\n" +
                        "4 Adet Domates\n" +
                        "60 gr Badem\n" +
                        "Maydanoz\n" +
                        "Etsuyu\n" +
                        "Rendelenmiş Parmesan Peyniri Veya Eski Kaşar\n" +
                        "Tereyağı\n" +
                        "Tuz, Karabiber\n" +
                        "            Yapılışı\n" +
                        "Bir tavaya koyduğunuz 20 gr (1 Çorba kaşığından biraz fazla) " +
                        "tereyağında, doğranmış soğanı öldürün. Bezelyeleri tuzunu ve " +
                        " karabiberini ekleyip birkaç dakika karıştırarak pişirin Patatesleri " +
                        " yıkayıp soyduktan sonra ince ince dilimleyin. Yağladığınız bir " +
                        "fırın tepsisinin dibine ilk patates katını dizin " +
                        "Üstüne bezelyelerin yarısını, dilimlenmiş mozzarelle ya da dil " +
                        " peynirinin yarısını, küp şeklinde doğranmış domates ve jambonun " +
                        " yarısını döşeyin. " +
                        "Tuz, karabiber ilave ettikten sonra ikinci patates katını dizin. " +
                        " Diğer malzemelerin kalanını da aynı sırayla koyup işlemi bitirin. " +
                        "Tüm yüzeyini 2 çorba kaşığı kıyılmış maydanoz, ince dilimlenmiş " +
                        " badem ve 2 çorba kaşığı parmesan peyniri ya da eski kaşar rendesiyle kaplayın. " +
                        "Tüm malzemenin üstüne 4 kepçe etsuyu döktükten sonra kabı, " +
                        "önceden ısıttığınız 180 derecelik fırına verin. 45 dakika sonra çıkarıp aynı kapta servis yapın.",

                "        Malzemeler\n" +
                        "4 adet şalgam\n" +
                        "4 adet havuç\n" +
                        "1 adet soğan\n" +
                        "3 çorba kaşığı bal\n" +
                        "100 gr. tereyağı\n" +
                        "1 adet defne yaprağı\n" +
                        "Tuz, karabiber\n" +
                        "4 adet bonfile\n" +
                        "         Yapılışı\n" +
                        "Şalgam ve havucu ayıklayıp, küp şeklinde doğrayın. " +
                        "Soğanı ortadan ikiye kesin. Küçük bir tencereyi yarısına " +
                        "kadar su ile doldurun. 2 çorba kaşığı bal ve soğanı ekleyip kaynatın. " +
                        "Sebzeleri ilave edip 5 dakika haşlayın. " +
                        "Sebzeleri sudan çıkarıp süzün. 50 gr. tereyağında kavurun. " +
                        " Tuz, karabiber ve defne yaprağını ekleyin. Üzerine kalan 1 " +
                        "çorba kaşığı balı koyup karıştırın. " +
                        "Ballı sebzeleri tereyağında kızartılmış bonfilenin yanında garnitür olarak servis yapın.",

                "        Malzemeler\n" +
                        "2 adet kabak\n" +
                        "2 adet havuç\n" +
                        "15 adet taze fasulye\n" +
                        "10 adet mantar\n" +
                        "2 adet domates\n" +
                        "2 adet patates\n" +
                        "4 adet sivri biber\n" +
                        "1 adet soğan\n" +
                        "3 dişsarmısak\n" +
                        "2 çorba kaşığı zeytinyağı\n" +
                        "Tuz\n" +
                        "karabiber\n" +
                        "          Yapılışı\n" +
                        "Kabak, patates, fasulye, sivri biber, domates, soğan ve havuçları iri " +
                        "kuşbaşı şeklinde doğrayın. Mantarları limonlu suda bekletin. Sarımsakları soyup, bütün bırakın. " +
                        "Hazırladığınız sebzeleri tuz ve karabiberle karıştırdıktan sonra bambu buhar" +
                        " sepetlerine koyun. Sepetleri üst üste koyup, kapağını kapattıktan sonra " +
                        "yarısına kadar su dolu tencerenin üzerine yerleştirin. " +
                        "Orta ateşte fasulye yumuşayana kadar pişirin. (Buharda pişirmede, sebzelerin " +
                        "fazla yumuşamadan hafif kıtır kalarak pişirilmesine dikkat edin) " +
                        "Pişen sebzeleri,büyük bir kaseye alın üzerine zeytinyağı gezdirin ve sebzeleri" +
                        " ezmeden hafifçe karıştırın. Buharda türlüyü sıcak olarak servis yapın. Çiğ yağ " +
                        "tadını sevmiyorsanız, sebzeleri" +
                        " bir tavada kızdırdığınız zeytinyağında 1 dakika sote edebilirsiniz.",

                "        Malzemeler\n" +
                        "1.5 Çorba Kaşığı Tereyağı\n" +
                        "1/2 Kg Kuşbaşı Et\n" +
                        "1 Adet Soğan\n" +
                        "2 Adet Küçük Doğranmış Domates\n" +
                        "3 Adet Sivribiber\n" +
                        "1 Adet Patates\n" +
                        "1 Adet Patlıcan\n" +
                        "1 Adet Kabak\n" +
                        "6 Adet Brüksel Lahanası\n" +
                        "Tuz \n " +
                        "Karabiber\n " +
                        "Maydanoz\n" +
                        "           Yapılışı\n" +
                        "Ön hazırlık olarak brüksel lahanasını az suda haşlayın. " +
                        "Patlıcan, kabak, biber ve patatesi küçük doğrayın. Bir buçuk" +
                        " çorba kaşığı tereyağını tencereye alıp eritin. " +
                        "Etleri yağda kavurun. Etler suyunu çekince, yemeklik doğranmış soğan " +
                        "ve küp doğranmış domatesi ekleyin. 1-2 kez çevirin. " +
                        "Sonra doğranmış sebzeleri tencereye ekleyip, sote edin. En son brüksel" +
                        " lahanasını ilave edin. Tuz ve karabiberini katın. Sebzeler iyice pişince," +
                        " tencereyi ocaktan alın. İnce kıyılmış maydanozla süsleyip servis yapın.",

                "       Malzemeler\n" +
                        "1 tatlı kaşığı sıvı yağ\n" +
                        "1 adet dolmalık kırmızıbiber\n" +
                        "2 diş sarımsak\n" +
                        "2 su bardağı tavuk suyu\n" +
                        "3 adet patlıcan\n" +
                        "1 adet kabak\n" +
                        "10 adet bamya\n" +
                        "6 adet domates\n" +
                        "1 çorba kaşığı fesleğen\n" +
                        "350 gram balkabağı\n" +
                        "1 tatlı kaşığı hardal\n" +
                        "1 tatlı kaşığı kırmızı tozbiber\n" +
                        "Bir tutam karabiber\n" +
                        "Bir tutam kırmızı pulbiber\n" +
                        "1 çorba kaşığı sirke\n" +
                        "           Yapılışı\n" +
                        "Geniş bir tencereye 1 tatlı kaşığı sıvı yağı alın. Küp şeklinde" +
                        " kesilmiş dolmalık kırmızıbiberi ve kabuğu soyulmuş arpacık" +
                        " soğanlarını ilave edin. Kısık ateşte biberler yumuşayana " +
                        "ve arpacık soğanları sararana dek kavurun. Sonra ince kıyılmış" +
                        " sarımsakları ekleyin. Sarımsağın rengi değiştikten sonra tavuk" +
                        " suyunu ekleyin ve bir taşım kaynatın. " +
                        "Kaynadıktan sonra ateşi kısıp sebzeleri 10 dakika daha pişirin." +
                        " Bu arada ayrı bir tavayı ateşe oturtup, kızdırın. Küp şeklinde " +
                        "doğradığınız patlıcanları ve kabağı, bamyaları ekleyin. Yumuşamaya" +
                        " başlayana dek pişirin. " +
                        "Küp şeklinde doğranmış domatesleri, balkabağnı ve fesleğeni ilave edin. " +
                        "3 dakika daha pişirin. Sonra bu karışımı tencereye ekleyin. Hardalı, kırmızı" +
                        " toz biberi, kırmızı pulbiberi, karabiberi ve sirkeyi ilave edin. Tüm sebzeler" +
                        " iyice yumuşayana dek pişirin. Servis tabağına alarak, servis yapın.",

               "        Malzemeler\n" +
                       "1 kg kabak.\n" +
                       "İçi İçin:\n" +
                       "250 gr kıyma,\n" +
                       "1 kahve fincanı pirinç,\n" +
                       "1 adet soğan,\n" +
                       "1 adet domates,\n" +
                       "1 yemek kaşığı domates salçası\n" +
                       "1 tatlı kaşığı nane,\n" +
                       "Yarım çay kaşığı karabiber\n" +
                       "1 tutam dereotu\n" +
                       "1 tatlı kaşığı tuz,\n" +
                       "2 yemek kaşığı sıvı yağı\n" +
                       "         Sosu İçin:\n" +
                       "1 adet domates,\n" +
                       "1-2 diş sarımsak.\n" +
                       "        Üzeri İçin:\n" +
                       "2 su bardağı kaynar su\n" +
                       "Tuz\n" +
                       "        Yapılışı\n" +
                       "Kabakları yıkayıp tırtıklı bıçakla kazıyalım. " +
                       "Ortadan ikiye bölüp içlerini oyalım. " +
                       "Bir kaba ince ince doğradığımız soğanı, rendelediğimiz domatesi, yıkadığımız pirinci, " +
                       "kıymayı, salçayı, naneyi, ince ince doğradığımız dereotunu, rendelediğimiz sarımsağı, " +
                       "tuzu ve sıvı yağı koyup iyice karıştıralım. " +
                       "Oyduğumuz kabakların içini kıymalı harçla dolduralım ve tencereye dizelim. " +
                       "Sosu için; tavaya rendelediğimiz domatesi, sarımsağı ve sıvı yağı koyup pişirelim. " +
                       "Hazırladığımız domates sosunu kabakların üzerine gezdirerek dökelim. " +
                       "Sonra üzerine tuz serpip kaynar suyu dökelim ve kısık ateşte 1 saat kadar pişirelim. " +
                       "Pişen kabak dolmamızı dilimleyelim. " +
                       "Etli kabak dolmamızı yoğurt ile servis yapalım.",

                "       Malzemeler\n" +
                        "3 dal pırasa,\n" +
                        "Yarım demet maydanoz,\n" +
                        "2 dal taze soğan,\n" +
                        "3 adet yumurta,\n" +
                        "Yarım çay bardağı süt,\n" +
                        "4 yemek kaşığı un,\n" +
                        "Tuz,\n" +
                        "Pul biber,\n" +
                        "Karabiber,\n" +
                        "1 su bardağı sıvı yağ\n" +
                        "        Yapılışı\n" +
                        "Pırasayı, taze soğanı ve maydanozu ince ince doğrayıp bir kaba alalım. " +
                        "Üzerine yumurtayı, sütü, unu, baharatları ve tuzu ilave edip iyice karıştıralım. " +
                        "Sıvı yağı hafif kızdıralım. " +
                        "Harçtan 1 yemek kaşığı tavaya dökelim. " +
                        "Sonra arkalı önlü kızartalım. " +
                        "Fazla yağını çektirmek için havlu kağıt üzerine alalım." +
                        "Daha sonra servis tabağına yerleştirip servis yapalım.",

                "        Malzemeler\n" +
                        "1 adet orta boy beyaz lahana,\n" +
                        "1,5 su bardağı pirinç,\n" +
                        "1 adet büyük boy soğan,\n" +
                        "Yarım demet maydanoz,\n" +
                        "1 yemek kaşığı salça,\n" +
                        "Tuz,\n" +
                        "Kırmızı pul biber,\n" +
                        "Karabiber,\n" +
                        "Kuru Nane,\n" +
                        "1 çay bardağı sıvı yağ.\n" +
                        "           Yapılışı\n" +
                        "İçi için: bir kabın içinde pirinci güzelce yıkayalım. " +
                        "Soğanı ince ince küp şeklinde doğrayalım. " +
                        "Maydanozu ince ince doğrayalım. " +
                        "Tencereye sıvı yağı, soğanı koyalım ve soğanlar pembeleşene kadar kavuralım. " +
                        "İçine salçayı ilave edelim ve kavurmaya devam edelim. " +
                        "Daha sonra pirinci, maydanozu, karabiberi, kuru naneyi," +
                        " kırmızı pul biberi, tuzu ilave edelim ve kavuralım. " +
                        "Bir çay bardağı su ilave edelim ve pirinçler suyunu çekince, ocağı kapatalım. " +
                        "Beyaz lahanayı haşlamak için; beyaz lahananın yapraklarını ayıralım. " +
                        "Tencereye su koyalım ve kaynatıp, içine tuz ekleyelim. " +
                        "Beyaz lahana yapraklarını kaynar suyun içine atalım. " +
                        "(az yumuşaması yeterli çok tutarsanız hamur gibi olur yırtılır) " +
                        "Haşlanan beyaz lahanayı parçalara ayıralım ve hazırladığımız pirinçli " +
                        "içten, beyaz lahanaların üzerine koyalım ve saralım. " +
                        "Tencerenin altına birkaç beyaz lahana koyalım( dibi tutarsa önce onlar yansın ). " +
                        "Sardığımız lahanaları tencereye dizelim. " +
                        "Bir kabın içine yarım çay bardağı kadar sıvı yağı, " +
                        "bir kaşık salçayı, tuzu, bir miktar sıcak suyu koyalım ve karıştıralım. " +
                        "Hazırladığımız salçalı karışımı, beyaz lahana sarması üzerinde gezdirelim. " +
                        "Lahana sarmasına yeteri kadar sıcak su ilave edelim ve önce yüksek ateşte " +
                        "kaynatıp, daha sonra kısık ateşte pişirelim." +
                        " ( suyunu sarmaların üzerine çıkmayacak şekilde ayarlayalım).",

                "        Malzemeler\n" +
                        "1 adet orta boy beyaz lahana,\n" +
                        "1,5 su bardağı pirinç,\n" +
                        "1 adet büyük boy soğan,\n" +
                        "Yarım demet maydanoz,\n" +
                        "1 yemek kaşığı salça,\n" +
                        "Tuz,\n" +
                        "Kırmızı pul biber,\n" +
                        "Karabiber,\n" +
                        "Kuru Nane,\n" +
                        "1 çay bardağı sıvı yağ\n" +
                        "           Yapılışı\n" +
                        "İçi için: bir kabın içinde pirinci güzelce yıkayalım. " +
                        "Soğanı ince ince küp şeklinde doğrayalım. " +
                        "Maydanozu ince ince doğrayalım. " +
                        "Tencereye sıvı yağı, soğanı koyalım ve soğanlar pembeleşene kadar kavuralım. " +
                        "İçine salçayı ilave edelim ve kavurmaya devam edelim. " +
                        "Daha sonra pirinci, maydanozu, karabiberi, kuru naneyi," +
                        " kırmızı pul biberi, tuzu ilave edelim ve kavuralım. " +
                        "Bir çay bardağı su ilave edelim ve pirinçler suyunu çekince, ocağı kapatalım. " +
                        "Beyaz lahanayı haşlamak için; beyaz lahananın yapraklarını ayıralım. " +
                        "Tencereye su koyalım ve kaynatıp, içine tuz ekleyelim. " +
                        "Beyaz lahana yapraklarını kaynar suyun içine atalım. " +
                        "(az yumuşaması yeterli çok tutarsanız hamur gibi olur yırtılır) " +
                        "Haşlanan beyaz lahanayı parçalara ayıralım ve hazırladığımız " +
                        "pirinçli içten, beyaz lahanaların üzerine koyalım ve saralım. " +
                        "Tencerenin altına birkaç beyaz lahana koyalım( dibi tutarsa önce onlar yansın ). " +
                        "Sardığımız lahanaları tencereye dizelim. " +
                        "Bir kabın içine yarım çay bardağı kadar sıvı yağı, bir kaşık salçayı," +
                        " tuzu, bir miktar sıcak suyu koyalım ve karıştıralım. " +
                        "Hazırladığımız salçalı karışımı, beyaz lahana sarması üzerinde gezdirelim. ss" +
                        "Lahana sarmasına yeteri kadar sıcak su ilave edelim ve önce yüksek ateşte kaynatıp," +
                        " daha sonra kısık ateşte pişirelim. ( suyunu sarmaların üzerine çıkmayacak şekilde ayarlayalım)."

        };
        if (detayPozisyon == -1) {
            Toast.makeText(sebzeDetayActivity.this, "Hata", Toast.LENGTH_LONG).show();
        } else {
            detayText.setText(detayListe[detayPozisyon]);
        }
    }
}
