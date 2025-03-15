package practice_07.task_02;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberBox <T extends Number> {

    private ArrayList<Number> numbers = new ArrayList<>();

    void setNumbers(Number number) {
        this.numbers.add(number);
    }
     void sumNumbers() {
        AtomicInteger sum = new AtomicInteger();
        numbers.forEach(
                number -> {
                    sum.addAndGet((Integer) number);
                }
        );
         System.out.println("Сумма чисел: " + sum);
    }

    /*
    * Работа с числами: Создайте класс NumberBox<T extends Number>, который хранит только числа и возвращает их сумму.
    * */

    public static void main(String[] args) {
        NumberBox<Integer> numberBox = new NumberBox();
        numberBox.setNumbers(10);
        numberBox.setNumbers(2);
        numberBox.sumNumbers();

    }
}
