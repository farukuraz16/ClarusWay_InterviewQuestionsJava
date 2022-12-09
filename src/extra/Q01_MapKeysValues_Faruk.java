package extra;

import java.util.HashMap;
import java.util.Map;

public class Q01_MapKeysValues_Faruk {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?
    // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?

    public static void main(String[] args) {

    HashMap<String,Integer> ulke=new HashMap<>();
    ulke.put("Almanya",80);
    ulke.put("ABD",200);
    ulke.put("Türkiye",85);
    ulke.put("Irak",40);
        System.out.println("ulke = " + ulke);
        System.out.println("ülke isimleri"+ ulke.keySet());
        System.out.println("ülke nüfusları"+ ulke.values());

        int nüfusToplam=0;
        int ellidenBüyükUlkeSayısı=0;

        for (Integer each: ulke.values()
             ) {
            if (each>50) {ellidenBüyükUlkeSayısı++;}
nüfusToplam+=each;
        }
        System.out.println("ellidenBüyükUlkeler = " + ellidenBüyükUlkeSayısı);
        System.out.println("nüfusToplam = " + nüfusToplam);


        for (Map.Entry<String,Integer>siralama: ulke.entrySet()){  //hem key hem de value almak için entrySet ve Entry kullanıyoruz.
            System.out.println(siralama);

        }

        for (String ülkeadı: ulke.keySet()
             ) {
            System.out.println(ülkeadı);

        }

        for (Integer ülkenüfüs: ulke.values()
             ) {
            System.out.println(ülkenüfüs);

        }

    }}