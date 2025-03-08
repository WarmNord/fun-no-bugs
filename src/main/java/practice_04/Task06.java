package practice_04;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

    /*
    * Напишите программу, которая запрашивает числа у пользователя и выводит их сумму. Если пользователь вводит отрицательное число, программа завершает выполнение (break).

Создайте программу, которая выводит числа от 1 до 20, пропуская те, которые делятся на 3 (continue).

Реализуйте программу, которая выводит первые 10 чисел, которые одновременно делятся на 2 и 5. Используйте break для завершения цикла, когда будет найдено 10 чисел.*/

    public static void main(String[] args) {

        //Task06.sumNumbers();
        //Task06.showNumbers();
        Task06.randomTenNumbers();

    }

    static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        int sum = 0;

        while (true) {
            System.out.println("Введите число:");
            inputNumber = scanner.nextInt();
            if (inputNumber < 0) {
                break;
            } else {
                sum += inputNumber;
            }
            System.out.println(sum);
        }
    }

    static void showNumbers() {
        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    static void randomTenNumbers() {
        Random rand = new Random();
        int number;
        int i = 1;

        while (true) {
            number = rand.nextInt();
            if (i > 10) {
                break;
            } else if (number % 10 == 0) {
                System.out.println(number);
                i++;
            }
        }
    }

}
