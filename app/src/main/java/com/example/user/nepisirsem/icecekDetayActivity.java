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

public class icecekDetayActivity extends AppCompatActivity {

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
                "https://www.youtube.com/watch?v=XTq7bLs_5Zw",
                "https://www.youtube.com/watch?v=Wj31pHeJolc",
                "https://www.youtube.com/watch?v=aiYn3HUaRNQ",
                "https://www.youtube.com/watch?v=xkSzfJ3nq3s",
                "https://www.youtube.com/watch?v=BTyE2imAASc",
                "https://www.youtube.com/watch?v=VT0VUawq7KI",
                "https://www.youtube.com/watch?v=RtS96RpDQn4",
                "https://www.youtube.com/watch?v=THdmfgUUYBA",
                "https://www.youtube.com/watch?v=c3IiEaHtEfY"
        };
        link = (TextView) findViewById(R.id.link);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (detayPozisyon == -1) {
                    Toast.makeText(icecekDetayActivity.this, "Hata", Toast.LENGTH_LONG).show();
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
                R.drawable.yogurtlumilkshake,
                R.drawable.muzlusut,
                R.drawable.cilekserbeti,
                R.drawable.serinletenyaz,
                R.drawable.cikolatalilatte,
                R.drawable.boza,
                R.drawable.sicakcikolata,
                R.drawable.cilekvecikolatali,
                R.drawable.ahududulukokteyl
        };
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (detayPozisyon == -1) {
                    Toast.makeText(icecekDetayActivity.this, "Hata", Toast.LENGTH_LONG).show();
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
                "       Malzemeler\n" +
                        "2 su bardağı soğuk süt\n" +
                        "1 su bardağı tatlı yoğurt\n" +
                        "1 yemek kaşığı Hindistan cevizi rendesi\n" +
                        "2 yemek kaşığı bal\n" +
                        "5-6 adet küp buz\n" +
                        "Üzerini süslemek için:\n" +
                        "2 yemek kaşığı çikolata rendesi yada çilek, kivi, elma, muz v.s\n" +
                        "           Yapılışı\n" +
                        "Blender yada mutfak robotu ile yoğurt, süt, " +
                        " bal ve hindistan cevizini 3-4 dakika, köpük köpük oluncaya " +
                        "kadar karıştırın. Bir sürahi içine buzları koyarak üzerine " +
                        " bu karışımı boşaltın ve buzdolabına koyun. Servis yapacağınız " +
                        "zaman dolaptan çıkarın ve bardaklara boşaltın. Üzerine çikolata " +
                        "rendesi veya çilek, kivi, muz, elma v.s gibi doğranmış meyve serpiştirin.",

                "       Malzemeleri\n" +
                        "2 adet muz\n" +
                        "1 su bardağı süt\n" +
                        "4 tatlı kaşığı bal\n" +
                        "          Yapılış\n" +
                        "Dilimlenmiş muzları, balı ve sütü blender " +
                        "sürahisine doldurun ve karışım pürüzsüz bir hale " +
                        " gelene kadar karıştırın. Bardağa koyduğunuz muzlu sütü sade " +
                        " olarak yada üstüne isteğe göre rendelenmiş çikolata veya tarçın " +
                        "koyup ister soğuk ister ılık servis yapın. Çocuklarınıza geceleri " +
                        " yatmadan önce içirecekseniz, muzlu süt şişkinlik yaptığı için " +
                        " en az bir saat önce içirmelisiniz.",

                "       Malzemeleri\n" +
                        "1 Kg. çilek\n" +
                        "3 su bardağı şeker\n" +
                        "2 su bardağı su\n" +
                        "Yarım limonun suyu\n" +
                        "          Yapılışı\n" +
                        "Çilekleri iyice yıkayıp ayıklayınız. Elinizle " +
                        "iyice sıkarak püre yapınız. Püreyi bir tencereye koyarak " +
                        " üzerine su ve şekeri koyunuz. Ateşe koyarak 3-4 dakika " +
                        " kaynatınız. Yarım limonun suyunu ilave edip 2 dakika " +
                        "daha kaynatın. Çilek şurubunuzu soğutup süzerek şişelere " +
                        "doldurunuz. Şişelerin ağzını iyice kapatarak buzdolabında " +
                        "muhafaza ediniz. Çilek konsantrenizi kullanacağınız " +
                        " zaman sevdiğiniz oranda soğuk suyla sulandırarak servis ediniz.",

                "       Malzemeler \n" +
                        " 3 su bardağı doğranmış karpuz\n" +
                        " 2 su bardağı ahududu\n" +
                        " 1/2 su bardağı soğuk su\n" +
                        "1/2 adet limon suyu\n" +
                        "Tatlandırıcı \n" +
                        "         Yapılışı\n" +
                        "Karpuzu dilimlere ayırıp kabuğunu çıkartın. " +
                        "3 su bardağı olacak kadar doğrayın. Diğer malzemelerle " +
                        "birlikte blender’dan geçirin.",

                "        Malzemeler\n" +
                        "Yağsız süt\n" +
                        "Kahve\n" +
                        "Çikolata\n" +
                        "           Yapılışı\n" +
                        "Sütü yarım lt bir bardağa alıp süt mikseriyle " +
                        " süt kabarıp bardağı üstüne çıkana kadar çırpıyoruz. " +
                        " (Sütün sıcak ve yağsız olması gerekiyor). Daha " +
                        "sonra kahveyi çok yavaş bir şekilde bardağın bir tarafından " +
                        " süte ekliyoruz. Çikolataları süt ile ekliyoruz. Çikolataları " +
                        "erittikten sonra latte'nin içine boşaltıyoruz.",

                "       Malzemeler\n" +
                        "2 bardak bulgur\n" +
                        "21 bardak su\n" +
                        "2 çorba kaşığı un\n" +
                        "½  bardak yoğurt\n" +
                        "1 bardak boza\n" +
                        "2,5 çorba kaşığı şeker\n" +
                        "½ çorba kaşığı vanilya\n" +
                        "2 çorba kaşığı tarçın\n" +
                        "            Yapılışı\n" +
                        " Bulguru büyük bir tencereye koyun ve 12 bardak su ilave ederek üzerini" +
                        " kapatıp oda sıcaklığında 1 gece bekletin. " +
                        " Kısık ateşte 2 saat pişirdikten sonra mutfak robotuna koyup çekin. " +
                        " Çektiğiniz karışımı birde süzgeçten geçirin ve buzdolabına koyun. " +
                        "Süzgecin üzerinde kalan bulgurları yeniden tencereye koyun. " +
                        "8 bardak su ilave edip kısık ateşte 1 saat daha pişirin. " +
                        "Süzgeçten geçirip buzdolabına koyun. " +
                        "Unu küçük bir tencereye koyup üzerine 2/3 bardak su ekleyin. " +
                        "Kısık bir ocakta sürekli karıştırarak koyulaşıncaya dek pişirin. " +
                        "Ateşten alın ve içine 2 çorba kaşığı şeker koyun. " +
                        "Eriyinceye dek karıştırıp, ılıyınca içine yoğurt katın. " +
                        "Mayalanması için 1 bardak bozayı yoğurt karışımına ekleyin. " +
                        "Oda sıcaklığında (Ilık ortamda)  30 dk. bekletin. " +
                        "Mayalı karışımı ezilmiş bulgura ekleyin ve oda sıcaklığında yaklaşık 1-2 gün bekletin. " +
                        "Beklerken ara ara karıştırın. Aynı zamanda vanilya ve kalan şekeri de ekleyip şeker " +
                        "iyice eriyinceye kadar da karıştırın. " +
                        "Daha sonra tarçınla servis yapın.",

                "       Malzemeler:\n"+
                        "6 su bardağı süt\n" +
                        "6 yemek kaşığı toz kakao\n" +
                        "6 tatlı kaşığı şeker\n" +
                        "1 çay kaşığı toz vanilya\n" +
                        "1 tutam tarçın \n"+
                        "        Yapılışı\n" +
                        "Derin bir kabın içine 1 su bardağı sütü ilave edin " +
                        "ve kakao, şeker ve vanilyayı ekleyip iyice karıştırın. " +
                        "Kalan sütü ısıtıp kakaolu karışımı ilave edip sürekli " +
                        " karıştırarak kaynatın. " +
                        "Servis bardaklarına paylaştırın. " +
                        "Son olarak arzuya göre tarçın ya da rendelenmiş " +
                        " beyaz çikolata serpin sıcak olarak servis yapın.",

                "       Malzemeler\n" +
                        "500 gr çilek\n" +
                        "250 ml süt\n" +
                        "2 paket vanilya şekeri\n" +
                        "5 portakal\n" +
                        "3 yemek kaşığı şeker\n" +
                        "150 gr çilekli yoğurt\n" +
                        "250 gr labne peyniri\n" +
                        "        Üzeri İçin\n" +
                        "Nane yaprakları\n" +
                        "         Yapılışı\n" +
                        "Çilekleri yıkayıp doğrayın. " +
                        "Portakalların kabuğunu soyup küp şeklinde doğrayın. " +
                        "Doğradığınız çilek ve portakalları, şeker, süt, yoğurt, " +
                        "labne peyniri ile birlikte mikserden geçirin. " +
                        "Buzdolabında soğutup bardaklara paylaştırın. " +
                        "Üzerini nane yaprakları ile süsleyerek servis edin.",

                "       Malzemeler\n" +
                        "500 gr ahududu\n" +
                        "250 ml üzüm suyu (~1 su bardağı + 1/4 su bardağı)\n" +
                        "500 ml portakal suyu (~2,5 su bardağı)\n" +
                        " yarım su bardağı su\n" +
                        "          Yapılışı\n" +
                        "Ahududuları robotta püre halinde ezin. " +
                        "2-3 buz parçası, ahududu ezmesi, üzüm ve portakal sularını shaker’a alıp çalkalayın. " +
                        "Kadehe doldurup suyu ilave edin ve servis edin. İşte hepsi bu kadar."
        };
        if (detayPozisyon == -1) {
            Toast.makeText(icecekDetayActivity.this, "Hata", Toast.LENGTH_LONG).show();
        } else {
            detayText.setText(detayListe[detayPozisyon]);
        }
    }
}
