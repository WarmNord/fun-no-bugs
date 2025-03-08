package practice_06.task02;

import java.util.HashMap;
import java.util.Map;

public class Task18 {

    /*\
    * 18. Анализ частоты слов
Требуется определить, сколько раз каждое слово встречается в тексте.
    *
    * */
    static private HashMap<String, Integer> words = new HashMap<>();

   static void analyseText(String text) {
        String[] inputWords = text.split(" ");
        for (int i = 0; i < inputWords.length; i++) {
            if (!words.containsKey(inputWords[i])) {
                words.put(inputWords[i], 1);
            } else {
               int countWords = words.get(inputWords[i]) + 1;
               words.put(inputWords[i], countWords);
            }
        }
    }

    public static void main(String[] args) {

       Task18.analyseText("сколько раз каждое слово встречается сколько раз каждое слово встречается сколько раз каждое привет");
       words.forEach(
               (string, integer) -> {
                   System.out.println("Слово: " + string + ", количество повторений " + integer);
               }
       );

    }
}
