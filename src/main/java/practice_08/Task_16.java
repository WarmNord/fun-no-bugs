package practice_08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_16 {
    /*Группировка строк по первой букве
Подсказка:
Нужно сгруппировать слова по первой букве. Сначала превращаем список строк в поток. Затем используем метод collect, который собирает элементы в коллекцию. С помощью Collectors.groupingBy(...) мы можем указать ключ для группировки — в данном случае, первую букву каждого слова. Это может быть word.charAt(0) или word.substring(0, 1).
Методы:
stream()
collect(...)
Collectors.groupingBy(...)
s -> s.charAt(0) или s -> s.substring(0, 1)*/

    public static void main(String[] args) {
        List<String> s = Arrays.asList("Бровь", "Бобер", "Весна");

        Map<Character, List<String>> ert = s.stream().collect(Collectors.groupingBy(q -> q.charAt(0)));
        System.out.println(s.stream().collect(Collectors.groupingBy(q -> q.charAt(0))));
    }
}
