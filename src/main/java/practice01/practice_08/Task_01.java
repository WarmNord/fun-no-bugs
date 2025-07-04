package practice01.practice_08;

public class Task_01 {
    /*
    *  Создайте свой функциональный интерфейс
Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции. Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.
Подсказка:
Объявите интерфейс с одним методом, например:
interface MathOperation { double operate(double a, double b); }
В main() создайте переменные типа MathOperation и реализуйте их с помощью лямбд:
(a, b) -> a + b
(a, b) -> a - b
(a, b) -> a * b
(a, b) -> a / b
Вызовите метод operate(a, b) для проверки
    * */

    public static void main(String[] args) {
        MathOperation sum = (a, b) -> a + b;
        System.out.println(sum.operate(2, 3));

        MathOperation minus = (a, b) -> a - b;
        System.out.println(minus.operate(10, 2));

        MathOperation multiply = (a, b) -> a * b;
        System.out.println(multiply.operate(2, 2));

        MathOperation division = (a, b) -> a / b;
        System.out.println(division.operate(30,3));


    }
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
