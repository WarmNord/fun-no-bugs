package practice_04;

import java.util.Scanner;

public class Task05 {
    /*Напишите программу, которая запрашивает у пользователя число и продолжает запрашивать, пока введённое число не станет положительным.

Реализуйте программу, которая запрашивает у пользователя пароль, пока он не введёт верный (заданный заранее).

Создайте программу, которая выводит числа от 1 до 10, но использует цикл do-while.*/

    public static void main(String[] args) {
        //Task05.plusNumber();
        //Task05.checkPassword();
        Task05.fromOneToTen();
    }

    static void plusNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
        } while (number <= 0);
    }

    static void checkPassword() {
        String password = "qwerty";
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Введите пароль: ");
            input = scanner.nextLine();
        } while (!input.equals(password));
    }

    static void fromOneToTen() {
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <=10);
    }

}
