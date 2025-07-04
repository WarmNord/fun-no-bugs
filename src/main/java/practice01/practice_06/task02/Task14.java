package practice01.practice_06.task02;

import java.util.HashSet;

public class Task14 {

    /*
    * 14. Уникальные слова в тексте
Дан текст, нужно сохранить все уникальные слова и определить их количество.
    * */

    private HashSet<String> words = new HashSet<>();

    void analyseText(String text) {
        String[] textWords = text.split(" ");
        for (int i = 0; i < textWords.length; i++) {
            words.add(textWords[i]);
        }

        System.out.println("Уникальные  слова: " + words.size());
        words.forEach(
                System.out::println
        );
    }

    public static void main(String[] args) {
        Task14 task = new Task14();

        task.analyseText("нужно сохранить все уникальные слова и определить их количество нужно сохранить все уникальные слова и определить их количество нужно сохранить все уникальные слова и определить их количество");
    }
}
