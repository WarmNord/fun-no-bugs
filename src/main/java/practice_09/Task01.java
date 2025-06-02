package practice_09;

import java.util.Arrays;
import java.util.List;

public class Task01 {
    /*
    1. Задача: создание одного потока
Условие задачи: Напишите программу, в которой создается отдельный поток, выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.

    * */

    public static void main(String[] args) {
        Thread t = new Thread(
                () -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Привет из потока!");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        t.start();


        List<String> names = Arrays.asList("Анна", "Борис", "Владимир");
        names.stream()
                .map(String::toUpperCase)
                .filter(name -> name.length() >= 5)
                .forEach(System.out::println);
    }
}
