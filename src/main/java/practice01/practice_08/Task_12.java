package practice01.practice_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task_12 {
    /*Задача 2: Поиск минимального элемента
Подсказка:
Нужно найти наименьшее значение в списке чисел. После создания потока применяем метод min, который возвращает Optional. Если список не пуст, можно получить значение через get() или orElse(...).
Методы:
stream()
min(Comparator.naturalOrder())
get() или orElse(...)*/

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(0,1,15);
        System.out.println(integers.stream().min(Comparator.naturalOrder()).get());

    }
}
