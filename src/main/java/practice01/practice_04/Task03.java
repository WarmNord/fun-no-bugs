package practice01.practice_04;

import java.util.Scanner;

public class Task03 {

    /*for
    Напишите программу, которая выводит все числа от 1 до 100, которые делятся на 3.

Реализуйте программу, которая принимает с консоли число n и вычисляет сумму всех чисел от 1 до n (включительно).

Создайте программу, которая выводит таблицу умножения для числа, введённого пользователем.*/

    public static void main(String[] args) {
       // Task03.divisionByThree();
       // Task03.sumNumbers();
        Task03.tableMultiply();
    }

    static void divisionByThree() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= number; i++) {
            result += i;
        }

        System.out.println("Cумма всех чисел от 1 до " + number + " = " + result);
    }

    static void tableMultiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultMylpiply = number * i;
            System.out.println(number + " x " + i + " = " + resultMylpiply);
        }
    }
}
