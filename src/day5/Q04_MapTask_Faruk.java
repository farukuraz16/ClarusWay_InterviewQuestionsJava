package day5;

import java.sql.Array;
import java.util.*;

public class Q04_MapTask_Faruk {
    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> grpVuyeler = new HashMap<>();
        //    Key:team ismi, Value: teamdeki kişiler.
        ArrayList<String> team1 = new ArrayList<>(Arrays.asList("Enes","Bera","Faruk"));
        ArrayList<String> team2 = new ArrayList<>(Arrays.asList("Zekiye","Rümeysa"));
         grpVuyeler.put("Team A",team1);
         grpVuyeler.put("Team B",team2);
        System.out.println("grpVuyeler = " + grpVuyeler);

        //hashmapdeki teamlerin size'ını bulmak için-->>
        Collection<ArrayList<String>> val = grpVuyeler.values(); //hashmap'deki valueları call edip assign ediyoruz
        System.out.println("val = " + val);

        for (ArrayList<String> each:val   //for döngüsüyle her bir listin eleman sayısını bulduk.
             ) {                     //each ler teamleri temsil eder
            System.out.println("grup üyelerinin sayısı: "+each.size());

        }

        //aynı işlemi SET ile yapalım-->>
        Set<String> keys = grpVuyeler.keySet();

        System.out.println("keys = " + keys);

        for (String each:keys      //each ler teamleri temsil eder
             ) {ArrayList<String> uyeListesi = grpVuyeler.get(each);
            System.out.println("grup üyelerinin sayısı: "+each+" "+uyeListesi.size());
        }



    }//main
}
