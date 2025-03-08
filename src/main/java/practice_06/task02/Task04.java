package practice_06.task02;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Task04 {

    /*
    *  Поиск элементов по приоритету
Система обрабатывает задачи, причём приоритет задачи определяет, когда она будет выполнена.
    * */

    static private PriorityQueue<Integer> taskPriority = new PriorityQueue<>();

    static private HashMap<String, Integer> tasks = new HashMap<>();

    static void addTask(String name, Integer priority) {
        System.out.println("Добавлена задача " + name +", приоритет " + priority);
        tasks.put(name, priority);
        taskPriority.add(priority);
    }

    static void doTaskByPriority() {
        while (!taskPriority.isEmpty()) {
            Integer priority = taskPriority.poll();
            tasks.values().remove(priority);
            System.out.println("Выполнена задача c приоритетом " + priority);
        }
    }

    public static void main(String[] args) {
        Task04.addTask("Прогуляться", 5);
        Task04.addTask("Пообедать", 10);
        Task04.addTask("Поиграть", 1);

        Task04.doTaskByPriority();
    }
}
