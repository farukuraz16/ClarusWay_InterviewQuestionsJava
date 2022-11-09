package day1;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /*
    * Kullanicidan bir cumle ve bir harf alin,
    * Cumlede harfin kac kere
    * kullanildigini bulup, yazdirin
    * ORNEK:
    * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
    *
    * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
    */

    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("cümlenizi giriniz: ");
        String cumle = dat.nextLine();
        System.out.println("harf giriniz: ");
        char harf = dat.next().charAt(0);
        int count=0;

        for (int i = 0; i < cumle.length(); i++) {
            if (harf==cumle.charAt(i)){
                count++;
            }

        }
        System.out.println(harf+" karakterinden "+count+" adet vardır.");



    }

}
