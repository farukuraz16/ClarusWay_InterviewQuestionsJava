package day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q06_AddedOrNotTask_Faruk {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin

    public static void main(String[] args) {
        List<Integer> sayılar = new ArrayList<>();
        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(1);
        sayılar.add(2);
        sayılar.add(5);
        sayılar.add(4);
        sayılar.add(3);

    int tekrarEden=0;
    //tekrar eden sayıları bulmak için Set kullanacağız. çünkü her bir değeri 1 kere alır.
    //uniq değer alır.
    
        Set<Integer> uniqSayı= new HashSet<>();
    
        List<Integer> duplicSayı = new ArrayList<>();
        for (int i = 0; i < sayılar.size(); i++) {
            boolean eklimi = uniqSayı.add(sayılar.get(i));
            if (!eklimi){
                tekrarEden++;
                duplicSayı.add(sayılar.get(i));
            }}

        System.out.println("tekrarEden = " + tekrarEden);
        System.out.println("uniqSayı = " + uniqSayı);
        System.out.println("duplicSayı = " + duplicSayı);


    }//main
}
