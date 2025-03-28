package practice_08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_08 {
    /*Преобразование строк в их длины
Подсказка:
Нужно заменить каждую строку на её длину. Сначала получаем поток, затем используем map, чтобы каждую строку преобразовать в число (length()). После этого собираем результат в список чисел.
Методы:
stream()
map(s -> s.length())
collect(Collectors.toList())
*/
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hi", "helloH", "two");
        List<Integer> result = strings.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(result);
    }
}
