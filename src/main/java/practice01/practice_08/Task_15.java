package practice01.practice_08;

import java.util.Arrays;
import java.util.List;

public class Task_15 {
    /* Проверка наличия хотя бы одного элемента по условию
Подсказка:
Нужно проверить, есть ли хотя бы один элемент, удовлетворяющий условию (например, чётное число). После создания потока используем метод anyMatch, который вернёт true, если хотя бы один элемент проходит проверку.
Методы:
stream()
anyMatch(n -> условие)*/
    public static void main(String[] args) {
        List<String> s = Arrays.asList("Бровь", "Бобер", "Весна");
        System.out.println(s.stream().anyMatch(n -> !n.startsWith("Б")));
        System.out.println(s.stream().filter(n -> !n.startsWith("Б")).toList());


    }
}
