package day2;

import java.util.Scanner;

public class Q01_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
      gösteren program yazınız */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number?");
        int num = sc.nextInt();
        amstrong(num);
        girilenSayıyakadarAmstrong(num);

    }

    private static void girilenSayıyakadarAmstrong(int num) {
        for (int i = 0; i <= num; i++) {
            amstrong(i);

        }

    }

    private static void amstrong(int num) {
        int kupleriToplamı = 0;
        int basamaktakiSayi = 0;
        int girilenSayi = num;

        while (num > 0) {
            basamaktakiSayi = num % 10;
            kupleriToplamı += (basamaktakiSayi * basamaktakiSayi * basamaktakiSayi);
            num = num / 10;
        }
        if (girilenSayi == kupleriToplamı) {
            System.out.println(girilenSayi+" amstrong sayıdır.");
        }else System.out.println(girilenSayi+" amstrong sayı değildir.");
    }
}
