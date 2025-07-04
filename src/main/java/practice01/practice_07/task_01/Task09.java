package practice01.practice_07.task_01;

import java.util.Scanner;

public class Task09 {

    /*
    * Запрос ввода у пользователя:
    * Реализуйте метод, который запрашивает у пользователя число, но не принимает null или пустую строку, выбрасывая IllegalArgumentException.
    *
    * */

    static void checkInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        String input = scanner.nextLine();

        if (input.equals("")) {
            throw new IllegalArgumentException("Вы ввели пустую строку");
        }

    }

    public static void main(String[] args) {
        Task09.checkInput();
    }
}
