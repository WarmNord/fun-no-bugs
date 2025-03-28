package practice_08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_09 {
    /*Создание списка квадратов чисел
Подсказка:
Нужно получить новый список, где каждый элемент — это квадрат исходного числа. Получаем поток, применяем map, чтобы возвести число в квадрат, и собираем результат в список.
Методы:
stream()
map(n -> n * n)
collect(Collectors.toList())
*/
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(0, 4, 5, 15, 25);
        List<Integer> squareIntegers = integers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(squareIntegers);

    }
}
