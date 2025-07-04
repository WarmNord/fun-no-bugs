package practice_10;

import org.junit.jupiter.api.Test;
import practice01.practice_10.Task_02;

import static org.junit.jupiter.api.Assertions.*;


public class Task_02_Test {

     /*
    * Напишите тесты для метода, который считает количество гласных букв в строке:
Тесты должны проверять:
Разные строки ("hello", "java", "AEIOU", "")
null (должно выбрасываться исключение)
Строки без гласных
    * */

    @Test
    public void chekDifferentStrings() {
        assertEquals(Task_02.countVowels("hello"),2);
        assertEquals(Task_02.countVowels("java"),2);
        assertEquals(Task_02.countVowels("AEIOU"),5);
        assertEquals(Task_02.countVowels(""),0);
    }

    @Test
    public void checkStringWithoutVowels() {
        assertEquals(Task_02.countVowels("bbq"),0);
        assertEquals(Task_02.countVowels("TSSSS"),0);

    }

    @Test
    public void checkNull() {
        String n = null;
        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Task_02.countVowels(n);
                }
        );
    }

}
