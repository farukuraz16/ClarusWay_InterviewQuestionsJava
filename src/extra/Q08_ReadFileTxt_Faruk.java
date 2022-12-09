package extra;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q08_ReadFileTxt_Faruk {
       /*
    1)Create a text file inside this package
    2)Type the following text inside the text file
       Java is easy to learn.
       Learn Java, earn money?
       Java is easy if you study well.
       To learn Java, type codes.
    3)Type code to print every word is used how many times in the text.
   */

    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> wordCounter = new HashMap<>();

        List<String> lines = Files.readAllLines(Paths.get("src/extra/Q08_FileText"));

        for (String s : lines) {

            String[] kelime = s.split(" ");

            for (String r : kelime) {
                if (r.endsWith(".") || r.endsWith("!") || r.endsWith(",") || r.endsWith("?")) {
                    r = r.substring(0, r.length() - 1);
                }

                if (!wordCounter.containsKey(r)) {
                    wordCounter.put(r, 1);
                } else {
                    wordCounter.put(r, wordCounter.get(r) + 1);
                }
            }

        }

        System.out.println("worldCounter = " + wordCounter);
    }
}