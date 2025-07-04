package practice01.practice_10;

public class Task_03 {
    /*
    * Напишите тесты для метода, который переворачивает строку:

Тесты должны проверять:
Обычные строки
Пустую строку
null (должно возвращаться null)
    * */

    public static String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}
