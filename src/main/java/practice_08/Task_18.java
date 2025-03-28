package practice_08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_18 {
    /*3. Поиск среднего значения чисел
Подсказка:
Чтобы найти среднее значение, преобразуем список в поток. Затем применяем метод collect с Collectors.averagingInt(...). Внутри указываем функцию, возвращающую значение элемента. Если список содержит Integer, то достаточно использовать n -> n.
Методы:
stream()
collect(...)
Collectors.averagingInt(n -> n)
*/
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3);

        System.out.println(
                integers.stream().collect(Collectors.averagingInt(n -> n))
        );
    }
}
