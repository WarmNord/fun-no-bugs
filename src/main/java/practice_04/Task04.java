package practice_04;

import java.util.Scanner;

public class Task04 {
    /*Напишите программу, которая принимает с консоли число и выводит его факториал, используя while.

Реализуйте программу, которая выводит все чётные числа от 1 до введённого пользователем числа.

Создайте программу, которая принимает с консоли положительное число и выводит обратный отсчёт от этого числа до 1.
*/
    public static void main(String[] args) {

        //Task04.factorial();
        //Task04.evenNumbers();
        Task04.countDown();


    }

    static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = scanner.nextInt();
        int result = 1;

        while (true) {
            if (number == 0) {
                System.out.println("Факториал числа: " + 1);
                break;
            }
            for (int i =1; i <= number; i++) {
                result *= i;
            }
            System.out.println("Факториал числа: " + result);
            break;
        }

    }

    static void evenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = scanner.nextInt();
        int i = 1;

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    static void countDown() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число ");
        int number = scanner.nextInt();

        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
