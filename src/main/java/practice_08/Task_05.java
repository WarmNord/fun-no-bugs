package practice_08;

import java.util.function.Consumer;

public class Task_05 {
    /*Использование Consumer
Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
Подсказка:
Используйте интерфейс Consumer<String>
Лямбда: s -> System.out.println(s)
Вызовите метод accept("Привет")*/


    public static void main(String[] args) {
        Consumer<String> printString = string -> {
            System.out.println(string);
        };

        printString.accept("Hi");
    }
}
