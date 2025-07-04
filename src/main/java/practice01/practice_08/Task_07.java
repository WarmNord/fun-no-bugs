package practice01.practice_08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_07 {
    /*Фильтрация чисел, кратных 5
Подсказка:
Нужно отобрать только числа, которые делятся на 5. Начинаем с преобразования списка в поток, затем фильтруем с помощью условия n % 5 == 0 и сохраняем результат в новый список.
Методы:
stream()
filter(n -> n % 5 == 0)
collect(Collectors.toList())*/
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(0, 4, 5, 15, 25);
        List<Integer> result = integers.stream().filter(i -> i % 5 == 0 && i != 0).collect(Collectors.toList());
        System.out.println(result);
    }
}
