package practice01.practice_06.task01;

import java.util.PriorityQueue;

public class Task09 {

    /*
    * PriorityQueue
Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
Реализуйте очередь задач с приоритетами. Добавьте несколько задач и извлеките их по приоритету.
Используйте PriorityQueue для сортировки объектов по приоритету.

    * */

    private int priority;
    static private PriorityQueue<Integer> taskPriority = new PriorityQueue<>();

    Task09(int priority) {
        this.priority = priority;
        taskPriority.add(priority);
    }

    int getPriority() {
        return priority;
    }

    static void showPriority() {
        while (!taskPriority.isEmpty()) {
            System.out.println("Приоритет :" + taskPriority.poll());
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Task09 task09 = new Task09(1);
        Task09 task02 = new Task09(10);
        Task09 task033 = new Task09(1100);
        Task09 task05 = new Task09(222);
        Task09 task07 = new Task09(14534);

        Task09.showPriority();

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(34);
        queue.add(44);
        queue.add(56);
        queue.add(12);


/*        queue.forEach(
                System.out::println
        );*/
 /*       System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
*/

        while (!queue.isEmpty()) {
            System.out.println("Приоритет:" + queue.poll());
        }

     }
}
