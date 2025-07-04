package practice01.practice_10;

public class Task_02 {
    /*
    * Напишите тесты для метода, который считает количество гласных букв в строке:

Тесты должны проверять:
Разные строки ("hello", "java", "AEIOU", "")
null (должно выбрасываться исключение)
Строки без гласных
    * */

    public static int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
