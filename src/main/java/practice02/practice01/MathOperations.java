package practice02.practice01;

//1. Нарушение DRY (Don't Repeat Yourself) – дублирование кода

//Исходный код
public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int add(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        System.out.println(mathOperations.add(1,1,1,1,1,1));
    }

}
