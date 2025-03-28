package practice_08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_17 {
    /*Группировка чисел по чётности
Подсказка:
Нужно разделить числа на две группы: чётные и нечётные. Сначала получаем поток из списка. Затем используем collect с Collectors.groupingBy(...), передавая в качестве ключа булевое выражение n % 2 == 0. В результате получится отображение: true — список чётных чисел, false — нечётных.
Методы:
stream()
collect(...)
Collectors.groupingBy(...)
n -> n % 2 == 0*/

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(0,1,2,3,4,5,6);

        System.out.println(
                integers.stream().collect(Collectors.groupingBy(x -> x % 2 == 0))
        );
    }
}
