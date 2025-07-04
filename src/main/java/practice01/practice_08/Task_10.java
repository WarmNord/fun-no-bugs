package practice01.practice_08;

import com.sun.jdi.IntegerType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_10 {
    /*
    *  Удаление дубликатов из списка
Подсказка:
Нужно оставить только уникальные элементы. После создания потока применяем метод distinct, который удаляет повторы. Затем собираем результат в список.
Методы:
stream()
distinct()
collect(Collectors.toList())*/
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(0, 4, 5, 15, 25, 5, 25);
        List<Integer> setIntegers = integers.stream().distinct().collect(Collectors.toList());
        System.out.println(setIntegers);

    }
}
