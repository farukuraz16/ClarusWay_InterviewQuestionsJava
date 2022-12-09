package extra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q07_StoreMap_Faruk {
    /* 1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
       2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
       3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
       4- Tüm kullanicilarin isimlerini ekrana yazdıralım
    */

    public static void main(String[] args) {

        String secim="";
        String kisisec="";
        HashMap<Integer, HashMap<String, String>> personList = new HashMap<>();
        HashMap<String, String> personInfo = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        do {


            System.out.println("Ad Soyad?");
            personInfo.put("ad soyad", sc.nextLine());
            System.out.println("Adres?");
            personInfo.put("Adres", sc.nextLine());
            System.out.println("Telefon?");
            personInfo.put("Telefon", sc.nextLine());
            System.out.println("4 haneli kimlik no?");
            personList.put(sc.nextInt(), personInfo);

            System.out.println("personList = " + personList);
            System.out.println("personInfo = " + personInfo);

            System.out.println("Devam etmek istiyor musunuz? (E/H)");
            secim= sc.next();
        } while (secim.equalsIgnoreCase("e"));

        System.out.println("Hangi kişi? kimlik numarasını giriniz?= ");

        System.out.println(personList.get(sc.nextInt()));
    }
}
