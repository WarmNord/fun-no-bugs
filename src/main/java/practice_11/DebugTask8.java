package practice_11;

//Код должен сравнить два числа, но почему-то результат не соответствует ожиданиям.

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;
        double epsilon = 0.000001;
        if (Math.abs(a - b) < epsilon) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
