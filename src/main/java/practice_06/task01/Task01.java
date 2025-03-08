package practice_06.task01;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Task01 {

    /*ArrayList
Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
Напишите программу, которая удаляет все чётные числа из ArrayList.
Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.
*/

    static void print(ArrayList<Integer> arrayList) {
        System.out.println("Список чисел");
        arrayList.forEach(
                System.out::println
        );
    }

    static String findMax(ArrayList<String> arrayList) {
        AtomicReference<String> result = new AtomicReference<>("");
        arrayList.forEach(
                i -> {
                    if (i.length() > result.get().length()) {
                        result.set(i);
                    }
                });
        return result.get();
    }

    static void printSum(ArrayList<Integer> arrayList) {
        AtomicInteger result = new AtomicInteger();
        arrayList.forEach(
                result::addAndGet
        );
        System.out.println("Сумма чисел " + result);

    }

    static void printMaxInteger(ArrayList<Integer> arrayList) {
        AtomicInteger result = new AtomicInteger();
        arrayList.forEach(
                integer -> {
                    if (integer >= result.get()) {
                        result.set(integer);
                    }
                });
        System.out.println("Максимальное число " + result);

    }

    public static void main(String[] args) {
        //Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
        ArrayList<Integer> integerArrayList = new ArrayList<>(5);
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);

        Task01.print(integerArrayList);
        integerArrayList.add(6);
        Task01.print(integerArrayList);

        //Напишите программу, которая удаляет все чётные числа из ArrayList.
        integerArrayList.removeIf(integer -> (integer % 2 == 0));
        Task01.print(integerArrayList);


        //Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
        ArrayList<String> strings = new ArrayList<>();
        strings.add("qweqeqeqwe");
        strings.add("wiwiwi");
        strings.add("uawua");
        System.out.println(Task01.findMax(strings));


        //Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
        Task01.printSum(integerArrayList);

        //Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.
        integerArrayList.add(123454);
        Task01.printMaxInteger(integerArrayList);
    }
}
