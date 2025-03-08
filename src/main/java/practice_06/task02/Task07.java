package practice_06.task02;

import java.util.TreeSet;

public class Task07 {
    /*
    *
    * 7. Упорядоченный список
Необходимо хранить список чисел в отсортированном виде, чтобы быстро находить минимальное и максимальное значения.
    * */
    static private TreeSet<Integer> listOfNumbers = new TreeSet<>();

    static void addNumber(Integer number) {
        listOfNumbers.add(number);
        System.out.println("Добавлено в список: " + number);
    }

    static void minValue() {
        System.out.println("Минимальное значение: " + listOfNumbers.getFirst());
    }

    static void maxValue() {
        System.out.println("Максимальное значение: " + listOfNumbers.getLast());
    }

    public static void main(String[] args) {
        Task07.addNumber(1);
        Task07.addNumber(100);
        Task07.addNumber(65);
        Task07.addNumber(250);
        Task07.addNumber(534);
        Task07.addNumber(9);

        System.out.println(listOfNumbers);

        Task07.maxValue();
        Task07.minValue();
    }
}
