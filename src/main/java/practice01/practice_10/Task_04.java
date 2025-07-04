package practice01.practice_10;

import java.util.Arrays;

public class Task_04 {
    /*
    * Напишите тесты для метода, который находит максимальное число в массиве:



Тесты должны проверять:
Обычный массив ([3, 5, 7, 2])
Один элемент в массиве
Отрицательные числа
Пустой массив (должно выбрасываться исключение)
    * */

    public static int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
