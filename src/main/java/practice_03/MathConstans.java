package practice_03;

public class MathConstans {

/*    Поля:
    final double PI = 3.14159 — значение числа Пи.
    final double E = 2.71828 — значение числа Эйлера.

            Реализуйте:
    Статические методы для вычисления:
    Площади круга (πr ^ 2).
    Длины окружности (2πr).
    В main протестируйте методы с разными значениями радиуса.*/

    static final double PI = 3.14159;
    static final double E = 2.71828;

    static double cirecleArea(double radius) {
        return PI * (radius * radius);
    }

    static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        System.out.println(MathConstans.cirecleArea(2));
        System.out.println(MathConstans.circumference(5));
        System.out.println(MathConstans.cirecleArea(-33.5));
        System.out.println(MathConstans.circumference(-0.12));

    }

}
