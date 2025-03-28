package practice_08;

import java.util.function.Function;

public class Task_04 {
    /* Лямбда-выражение с Function
Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
Подсказка:
Используйте интерфейс Function<String, Integer>
Лямбда: s -> s.length()
Вызовите метод apply("текст"), чтобы получить длину строки
*/
    public static void main(String[] args) {
        Function<String, Integer> lengthStr = string -> string.length();
        System.out.println(lengthStr.apply("hello"));
    }
}
