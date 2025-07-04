package practice01.practice_04;

import java.util.Scanner;

public class Task02 {
    /*Задачи на switch
Реализуйте программу, которая принимает с консоли день недели (число от 1 до 7) и выводит название дня (например, 1 — "Понедельник").

Используя enum, создайте перечисление для планет Солнечной системы (Planet) с восемью значениями: MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE.

Напишите программу, которая:
Принимает с консоли название планеты (значение из перечисления).

Выводит порядковый номер планеты от Солнца и примерное значение её массы относительно Земли.

Пример вывода:
Введите планету: EARTH
Порядковый номер: 3
Масса относительно Земли: 1.0


Напишите калькулятор с использованием switch.

Программа должна:
Принимать два числа и оператор (+, -, *, /) с консоли.
Выводить результат выполнения операции.
*/

    public static void main(String[] args) {

        //Task02.checkDay();

        //Task02.checkPlanet();
    Task02.calculator();
    }

    static void checkDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели от 1 до 7: ");
        int dayOfWeek = scanner.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня недели не существует");
                break;
        }
    }

    static void checkPlanet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название планеты: ");
        String planet = scanner.nextLine();

        switch (Planet.valueOf(planet)) {
            case MERCURY -> System.out.println("Порядковый номер: 1 \nМасса относительно Земли: 1.0");
            case VENUS -> System.out.println("Порядковый номер: 2 \nМасса относительно Земли: 1.0");
            case EARTH -> System.out.println("Порядковый номер: 3 \nМасса относительно Земли: 1.0");
            case MARS -> System.out.println("Порядковый номер: 4 \nМасса относительно Земли: 1.0");
            case JUPITER -> System.out.println("Порядковый номер: 5 \nМасса относительно Земли: 1.0");
            case SATURN -> System.out.println("Порядковый номер: 6 \nМасса относительно Земли: 1.0");
            case URANUS -> System.out.println("Порядковый номер: 7 \nМасса относительно Земли: 1.0");
            case NEPTUNE -> System.out.println("Порядковый номер: 8 \nМасса относительно Земли: 1.0");
        }
    }

    static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите число: ");
        int number2 = scanner.nextInt();
        System.out.println("Введите оператор: ");
        scanner.nextLine();
        String operator = scanner.nextLine();

        int result;

        switch (operator){
            case "+":
                result = number1 + number2;
                System.out.println("Результат сложения : " + result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println("Результат вычитания : " + result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println("Результат умножения : " + result);
                break;
            case "/":
                result = number1 / number2;
                System.out.println("Результат деления : " + result);
                break;
        }
    }
}