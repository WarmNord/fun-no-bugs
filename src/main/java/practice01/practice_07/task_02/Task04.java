package practice01.practice_07.task_02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Task04 {
    /*
    * 4 Ограничение сверху: Напишите обобщённый метод, который принимает List<? extends Number> и вычисляет сумму элементов.
    * */

    static <T> void sumNumbers(List<? extends Number> list) {
        AtomicInteger sum = new AtomicInteger();
        list.forEach(
                n -> {
                    sum.addAndGet((Integer) n);
                }
        );
        System.out.println("Сумма чисел: " + sum);
    }

    /*
    5 Ограничение снизу: Реализуйте метод, который принимает List<? super Integer> и добавляет в него несколько чисел.
    * */

    static <T> void addSomeNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(6);
        list.add(15);
    }

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(2);
        integerArrayList.add(98);
        Task04.sumNumbers(integerArrayList);

        Task04.addSomeNumbers(integerArrayList);
        System.out.println(integerArrayList);

    }
}
