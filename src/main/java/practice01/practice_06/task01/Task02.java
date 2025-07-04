package practice01.practice_06.task01;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;

public class Task02 {

    /*\
    * LinkedList
Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
Создайте LinkedList содержащий несколько строк. Напишите программу, которая удаляет первый и последний элементы списка, а затем выводит обновленный список.
Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
Используйте ListIterator для прохода по LinkedList в обоих направлениях.
    * */

    static void printSum(LinkedList<Integer> linkedList) {
        AtomicInteger sum = new AtomicInteger();

        linkedList.forEach(
                sum::addAndGet
        );
        System.out.println("Сумма чисел " + sum);


    }

    public static void main(String[] args) {

        //Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("wqeeq");
        stringLinkedList.add("asdasd");
        stringLinkedList.add("asd");
        stringLinkedList.add("wqefggfgfeq");
        stringLinkedList.add("xvcxvc");

        stringLinkedList.forEach(
                System.out::println
        );

        //Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
        LinkedList<String> taskQueue = new LinkedList<>();
        taskQueue.add("Задача 1");
        taskQueue.add("Задача 2");
        taskQueue.add("Задача 3");

        while (!taskQueue.isEmpty()) {
            System.out.println("Выполнена " + taskQueue.poll());
        }

        //Создайте LinkedList содержащий несколько строк. Напишите программу, которая удаляет первый и последний элементы списка, а затем выводит обновленный список.
        stringLinkedList.pop();
        stringLinkedList.pollLast();
        System.out.println(" ");
        stringLinkedList.forEach(
                System.out::println
        );


        // Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
        LinkedList<Integer> ints = new LinkedList<>();
        ints.add(2);
        ints.add(10);
        Task02.printSum(ints);

        //Используйте ListIterator для прохода по LinkedList в обоих направлениях.
        taskQueue.add("Задача 1");
        taskQueue.add("Задача 2");
        taskQueue.add("Задача 3");
        ListIterator<String> list = taskQueue.listIterator();

        while (list.hasNext()) {
            System.out.println(list.next());

        }

        while (list.hasPrevious()) {
            System.out.println(list.previous());

        }

    }
}
