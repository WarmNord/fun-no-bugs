package practice01.practice_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task_11 {
    /*Задача 1: Поиск максимального элемента
Подсказка:
Нужно найти самое большое число в списке. Сначала превращаем список в поток. Затем используем метод max, который сравнивает элементы. Он возвращает Optional, так как список может быть пустым. Чтобы получить само число, нужно вызвать get() или orElse().
Методы:
stream()
max(Comparator.naturalOrder())
get() или orElse(...)*/

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(0,1,15);
        System.out.println(integers.stream().max(Comparator.naturalOrder()).get());
    }
}
