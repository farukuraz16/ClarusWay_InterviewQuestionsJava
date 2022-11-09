package day1;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("word? =");
        String word = dat.nextLine();
        System.out.println("number? =");
        int sayi= dat.nextInt();
        System.out.println("word = " + word);
        System.out.println("sayi = " + sayi);

        String arr []= word.split("");

        ilkSon(word, sayi);


    }//main

    private static void ilkSon(String a, int b) {
        String n = a.substring(0,1)+a.substring(a.length()-1);
        for (int i = 0; i < b; i++) {
            System.out.print(n);

        }

    }

}
