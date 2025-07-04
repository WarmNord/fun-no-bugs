package practice01.practice_06.task01;

import java.util.TreeSet;

public class Task05 {

    /*
    * TreeSet
Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты. =)
Найдите ближайшее большее и меньшее число к заданному в TreeSet.
    * */

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(34);
        treeSet.add(76);
        treeSet.add(211);
        treeSet.forEach(System.out::println);
        System.out.println(treeSet);
        System.out.println();

        System.out.println("ближайшее большее " + treeSet.higher(15 ) + ", ближайшее меньшее число " + treeSet.lower(15));
    }
}
