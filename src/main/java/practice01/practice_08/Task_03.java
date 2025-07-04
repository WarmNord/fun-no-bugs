package practice01.practice_08;

import java.util.function.Predicate;

public class Task_03 {
    /* Лямбда-выражение с Predicate
Задача: Напишите лямбду, которая проверяет, является ли число чётным.
Подсказка:
Используйте интерфейс Predicate<Integer>
Лямбда будет выглядеть так: x -> x % 2 == 0
Вызовите test(число) и проверьте результат (true или false)*/

    public static void main(String[] args) {
        Predicate<Integer> isDivisionByTwo = x -> x % 2 == 0;
        System.out.println(isDivisionByTwo.test(4));
    }
}
