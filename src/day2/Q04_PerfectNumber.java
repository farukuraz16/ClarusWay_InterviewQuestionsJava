package day2;

import java.util.Scanner;

/* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
public class Q04_PerfectNumber {
    public static void main(String[] args) {
        Scanner dat= new Scanner(System.in);
        System.out.print("sayı?= ");
        int sayi=dat.nextInt();
        
        perfectNumber(sayi);

    }

    private static void perfectNumber(int sayi) {
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                toplam+=i;
                System.out.print(i+", ");
            }
                }
        System.out.println(toplam == sayi ? "\n"+sayi+" is perfect number" : sayi+ " is not perfect!");
    }
}
