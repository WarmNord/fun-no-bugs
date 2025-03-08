package practice_06.task02;

import java.util.Comparator;
import java.util.Date;
import java.util.TreeMap;

public class Task16 {

    /*
    *
    * 16. Список дел
Требуется сохранить список задач, который можно пополнять, удалять и сортировать по сроку выполнения.
    * */

    private TreeMap<Date, String> tasks = new TreeMap<>();

    void deletaTask(Date date) {
        tasks.remove(date);
    }

    void addTask(Date date, String task) {
        tasks.put(date, task);
    }

    void printTask() {
        System.out.println("Список дел:");
        tasks.forEach(
                (date, string) -> {
                    System.out.println("Срок выполнения " + date.getDate() + ", задача: " + string);
                }
        );
    }


    public static void main(String[] args) {
        Task16 user = new Task16();
        user.addTask(new Date(2025, 05, 15), "Сходить в поход");
        user.addTask(new Date(2025, 03, 8), "Доделать ДЗ");
        user.addTask(new Date(2025, 03, 16), "Прогуляться");
        user.addTask(new Date(2025, 06, 27), "Загорать");

        user.printTask();

    }
}