package practice_01;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();

        System.out.println("возвращает сумму двух чисел " + mathOperations.add(2, 3));
        System.out.println("возвращает разность двух чисел " + mathOperations.subtract(5, 7));
        System.out.println("возвращает произведение двух чисел " + mathOperations.multiply(2, 0));
        System.out.println("возвращает результат деления " + mathOperations.divide(21.05d, 12.44));

        System.out.println("метод для нахождения максимума двух чисел " + mathOperations.findMax(10, 400));

        System.out.println("метод для нахождения разницы между двумя числами " + mathOperations.difference(-150, -100));

        System.out.println("возвращает площадь квадрата " + mathOperations.squareArea(4));
        System.out.println("возвращает периметр квадрата " + mathOperations.squarePerimeter(4));

        System.out.println("метод для перевода секунд в минуты " + mathOperations.convertSecondsToMinutes(360));

        System.out.println("метод для вычисления средней скорости " + mathOperations.averageSpeed(10_000, 13));

        System.out.println("метод для нахождения гипотенузы " + mathOperations.findHypotenuse(12.0, 16.0));

        System.out.println("метод для вычисления длины окружности " + mathOperations.circleCircumference(3.5));

        System.out.println("метод для вычисления процентов " + mathOperations.calculatePercentage(300.0, 25.0));

        System.out.println("переводит температуру из градусов Цельсия в Фаренгейты " + mathOperations.celsiusToFahrenheit(-40.0));
        System.out.println("переводит температуру из Фаренгейтов в Цельсии " + mathOperations.fahrenheitToCelsius(50.0));


    }

    int add(int x, int y) {
        return x + y;
    }

    int subtract(int x, int y) {
        return x - y;
    }

    int multiply(int x, int y) {
        return x * y;
    }

    double divide(double x, double y) {
        return x / y;
    }

    int findMax(int a, int b) {
        return Math.max(a, b);
    }

    int difference(int x, int y) {
         if (x > y) {
             return Math.abs(x - y);
         } else return Math.abs(y - x);
    }

    int squareArea(int side) {
        return side * side;
    }

    int squarePerimeter(int side) {
        return 4 * side;
    }

    int convertSecondsToMinutes(int seconds) {
        return seconds / 60;
    }

    double averageSpeed(double distance, double time) {
        return distance / time;
    }

    double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    double calculatePercentage(double total, double part) {
        return part / total * 100;
    }

    double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
