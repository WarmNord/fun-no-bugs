package practice01.practice_06.task02;

import java.util.LinkedList;

public class Task15 {

    /*
    *
    * 15. Структура электронной очереди
В поликлинике пациенты записываются в очередь, и каждый должен быть вызван в порядке записи.
    * */

    private String name;

    static private LinkedList<Task15> queue = new LinkedList<>();

    Task15(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void addQueue() {
        queue.add(Task15.this);
        System.out.println("Пациент "+ this.getName() +" записался в очередь");
    }

    static void printQueue() {
        queue.forEach(
                patient ->
                {
                    System.out.println("Пациент : " + patient.getName() + " пошел в кабинет");
                }
        );
    }

    public static void main(String[] args) {
        Task15 patient = new Task15("Вася");
        patient.addQueue();
        Task15 patient2 = new Task15("Оля");
        patient2.addQueue();
        Task15 patient3 = new Task15("Коля");
        patient3.addQueue();
        Task15 patient4 = new Task15("Катя");
        patient4.addQueue();
        Task15 patient5 = new Task15("Костя");
        patient5.addQueue();

        Task15.printQueue();



    }
}
