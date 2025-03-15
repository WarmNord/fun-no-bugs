package practice_07.task_01;

public class Task03 {

    /*
    * Безопасное деление: Реализуйте метод деления чисел с обработкой ArithmeticException, если происходит деление на ноль.
    * */

    static void division(int number, int number1) {
        if (number1 == 0) {
            throw new ArithmeticException("На 0 делить нельзя");
        } else {
            System.out.println(number / number1);
        }
    }

    public static void main(String[] args) {
        Task03.division(12,0);
    }
}
