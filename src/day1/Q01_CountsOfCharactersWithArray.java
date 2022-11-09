package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /*
      Kullanicidan bir String aliniz.
      String'de var olan her character'in sayisini ekrana yazdiriniz.
      Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa   ==> a=3  b=1
     */
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("write a word: ");
        String str = dat.nextLine();

        //split
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));

        //sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //count --- sayaç oluştura
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])) {
                count++;
            } else {
                System.out.println("\""+arr[i - 1] +"\""+" karakterinden " + (count + 1) + " adet vardır.");
                count = 0;
            }
            if (i==arr.length-1)System.out.println("\""+arr[i] +"\""+" karakterinden " + (count + 1) + " adet vardır.");
        }

    }


}
