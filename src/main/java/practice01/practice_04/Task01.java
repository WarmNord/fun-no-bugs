package practice01.practice_04;

import java.util.Scanner;

public class Task01 {

    /*1. Задачи на if-else
Напишите программу, которая принимает с консоли число и проверяет:
Если число больше 0, выведите "Число положительное".
Если число меньше 0, выведите "Число отрицательное".
Если равно 0, выведите "Число равно нулю".

Создайте программу, которая принимает два числа и выводит наибольшее из них.

Напишите программу, которая принимает с консоли оценку (1–5) и выводит:
5 — "Отлично",
4 — "Хорошо",
3 — "Удовлетворительно",
2 или 1 — "Неудовлетворительно".
*/

    public static void main(String[] args) {
        //Task01.checkNumber();
        //Task01.findMaxNumber();
        Task01.checkGrade();

    }

    static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    static void findMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Введите число: ");
        int number2 = scanner.nextInt();

        if (number > number2) {
            System.out.println("Наибольшее число: " + number);
        } else if (number2 > number) {
            System.out.println("Наибольшее число: " + number2);
        } else {
            System.out.println("Числа равны: " + number);
        }
    }


    static void checkGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку: ");
        int grade = scanner.nextInt();

        if (grade == 5) {
            System.out.println("Отлично");
        } else if (grade == 4) {
            System.out.println("Хорошо");
        } else if (grade == 3) {
            System.out.println("Удовлетворительно");
        } else if (grade < 3 && grade > 0) {
            System.out.println("Неудовлетворительно");
        }
    }
}
