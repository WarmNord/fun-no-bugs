package practice_06.task01;

import java.util.*;

public class Task03 {

    /*
    * HashSet
Создайте HashSet из 5 чисел и выведите его содержимое.
Добавьте в HashSet 10 случайных чисел. Проверьте, содержит ли он заданное число.
Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет, содержится ли ваше имя в множестве, и выводит соответствующее сообщение.
    * */

    static Set<String> filterList(List<String> stringList) {
        return Set.copyOf(stringList);
    }

    static void chekNameContains(String name) {
        HashSet<String> names = new HashSet<>();
        names.add("маша");
        names.add("коля");
        names.add("настя");
        names.add("катя");

        if (names.contains(name)) {
            System.out.println("Имя " + name + " есть в множестве");
        } else {
            System.out.println("Имени " + name + " нет в множестве");
        }

    }

    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(4);
        integerHashSet.add(5);

        integerHashSet.forEach(
                System.out::println
        );

        //Добавьте в HashSet 10 случайных чисел. Проверьте, содержит ли он заданное число.
        HashSet<Integer> tenRandomNumbers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            tenRandomNumbers.add(random.nextInt());
        }
        tenRandomNumbers.forEach(
                System.out::println
        );
        System.out.println("Содержит ли число " + tenRandomNumbers.contains(12));
        System.out.println();

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");

        Set<String> strings = filterList(list);
        strings.forEach(
                System.out::println
        );

        chekNameContains("катя");
    }
}
