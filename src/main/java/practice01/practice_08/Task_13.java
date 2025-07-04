package practice01.practice_08;

import java.util.Arrays;
import java.util.List;

public class Task_13 {
    /*
    * Задача 3: Сумма всех элементов списка
Подсказка:
Чтобы посчитать сумму всех чисел в списке, сначала превращаем его в поток. Затем преобразуем его в числовой поток (целые числа). После этого используем метод sum, который возвращает сумму всех элементов.
Методы:
stream()
mapToInt(n -> n)
sum()
*/

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(0,1,15);
        System.out.println(integers.stream().mapToInt(i -> i).sum());
    }
}
