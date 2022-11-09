package day1;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        String realPIN = "open";
        Scanner dat = new Scanner(System.in);
        int time = 4;

        while (true) {
            System.out.println("please enter pin number: ");
            String pin = dat.nextLine();

            if (realPIN.equals(pin)) {
                System.out.println("correct!");
                break;
            } else {
                time--;
                System.out.println(pin + " is not correct. you have " + time + " times to try.");
            }
            if (time == 0) {
                System.out.println("locked!");
                break;
            }

        }

        //System.out.println("please insert pin number: ");
        //String pin = dat.nextLine();

        //if (realPIN.equals(pin)) System.out.println("correct!");
        //for (int i = 3; i >0 ; i--) {
        //    while (!realPIN.equals(pin)){
        //        System.out.println(pin+" is not correct. you have "+(i-1)+" times to try. please try again. insert pin number: ");
        //        pin = dat.nextLine();
        //        if (realPIN.equals(pin)) System.out.println("correct!");
        //        else System.out.println("not correct!");
        //        break;
        //    }
        //        }


    }

}
