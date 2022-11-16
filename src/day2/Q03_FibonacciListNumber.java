package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_FibonacciListNumber {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
            0-1-1-2-3-5-8-13-21-34....
            */

    public static void main(String[] args) {
        List<Integer> fibonacci = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi?= ");
        int sayi= sc.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);
        int i=1;
        if (sayi<=1){
            System.out.println("1'den büyük bir sayı giriniz");
        }else {
            while (fibonacci.get(i)<sayi){
                fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1));
                i++;

            }
        }
        if (fibonacci.get(fibonacci.size()-1)>sayi){
            fibonacci.remove(fibonacci.get(fibonacci.size()-1));
            System.out.println("girdiğiniz "+sayi+" sayısı fibonacci dizisinde bulunmamaktadır. \nGirdiğiniz sayiya kadar olan dizi: "+fibonacci)
            ;
        }else {System.out.println("girdiğiniz "+sayi+" sayısı fibonacci dizisindedir.\n"+fibonacci);}



    }
}
