package day2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
public class Q05_DifferenceBetweenArray_LargestAndSmallestElements {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("array için uzunluk giriniz= ");
        int uzunluk=dat.nextInt();
        int [] arr = new int[uzunluk];

        for (int i =0; i < arr.length ; i++) {
            System.out.println("Arrayin "+(i+1)+". elemanını giriniz= ");
            arr [i] = dat.nextInt();

            }
        Arrays.sort(arr);
        System.out.println("Array elemanları = " + Arrays.toString(arr));
        System.out.println("En büyük ve en küçük elemanın farkı = " + ((arr.length-1)-arr[0]));



    }

}
