package practice_06.task01;

import java.util.LinkedHashSet;

public class Task04 {

    /*
    * LinkedHashSet
Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты. =D
Реализуйте кэш последних 5 уникальных страниц, которые посетил пользователь.
    * */

    static void addElemt(LinkedHashSet<String> stringLinkedHashSet, String string) {
        stringLinkedHashSet.add(string);
        stringLinkedHashSet.forEach(
                System.out::println
        );
    }

    public static void main(String[] args) {
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("a");
        stringLinkedHashSet.add("b");
        stringLinkedHashSet.add("c");
        stringLinkedHashSet.add("c");

        stringLinkedHashSet.forEach(
                System.out::println
        );
        System.out.println("_____");
        addElemt(stringLinkedHashSet, "f");
        System.out.println("_____");
        addElemt(stringLinkedHashSet, "f");

    }
}
