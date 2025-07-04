package practice01.practice_06.task02;

import java.util.LinkedList;

public class Task02 {

    /*
    * Очередь задач для обработки
Система должна обрабатывать запросы в порядке их поступления. Требуется поддерживать последовательность.
    * */

    static private LinkedList<String> queue = new LinkedList<>();

    static void addTask(String task) {
        queue.add(task);
        System.out.println("Задача добавлена в очередь: " + task);
    }

    static void doTask() {
        while (!queue.isEmpty()) {
            System.out.println("Задача " + queue.poll() + " обработана");     }
    }


    public static void main(String[] args) {
    Task02.addTask("Сделать дз");
    Task02.addTask("Посмотреть фильм");
    Task02.addTask("Подготовиться ко сну");

    Task02.doTask();
    }

}
