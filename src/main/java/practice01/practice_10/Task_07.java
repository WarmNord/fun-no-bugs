package practice01.practice_10;

public class Task_07 {
    /*
    * Напишите тесты для метода, который вычисляет факториал числа:

public int factorial(int n) {
    if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
    return (n == 0) ? 1 : n * factorial(n - 1);
}
Тесты должны проверять:
0! = 1
Маленькие числа (1!, 5!, 7!)
1! =  1
2! =  1 * 2 = 2
3! =  1 * 2 * 3 = 6
4! =  1 * 2 * 3 * 4 = 24
5! =  1 * 2 * 3 * 4 * 5  = 120
Отрицательные числа (должно выбрасываться исключение)*/
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}
