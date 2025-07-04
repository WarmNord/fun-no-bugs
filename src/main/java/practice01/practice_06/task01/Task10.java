package practice01.practice_06.task01;

import java.util.ArrayDeque;

public class Task10 {

    /*
    * ArrayDeque
Создайте ArrayDeque, добавьте 5 элементов и выведите их.
Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
    * */

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque();
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);
        arrayDeque.add(4);
        arrayDeque.add(5);
        System.out.println(arrayDeque);


/*
        while (!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.pollLast());
        }
*/

        arrayDeque.addFirst(44);
        arrayDeque.forEach(
                integer -> {
                    System.out.println(integer);
                }
        );
        arrayDeque.addLast(55);
        while (!arrayDeque.isEmpty()) {
            System.out.println();
            System.out.println(arrayDeque.pollLast());
        }

    }
}
