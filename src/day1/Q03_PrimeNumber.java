package day1;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("a number? = ");
        int num = dat.nextInt();
        boolean flag = true;

        if (num>=2) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
                flag = true;

            }
            if (flag == true) System.out.println("prime!");
            else System.out.println("not prime!");
        }else System.out.println("not prime!");
    }


}
