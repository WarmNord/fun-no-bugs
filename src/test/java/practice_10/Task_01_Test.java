package practice_10;

import org.junit.jupiter.api.Test;
import practice01.practice_10.Task_01;

import static org.junit.jupiter.api.Assertions.*;


public class Task_01_Test {
    /*
    Тесты должны проверять:
   Чётные и нечётные числа
   Нулевое значение
   Отрицательные числа
*/

    @Test
    public void checkEvenPositiveNumber() {
        assertTrue(Task_01.isEven(6));
    }

    @Test
    public void checkEvenNegativeNumber() {
        assertTrue(Task_01.isEven(-10));
    }

    @Test
    public void checkZero() {
        assertTrue(Task_01.isEven(0));
    }

    @Test
    public void checkNotEvenPositiveNumber() {
        assertFalse(Task_01.isEven(1));
    }

    @Test
    public void checkNotEvenNegativeNumber() {
        assertFalse(Task_01.isEven(-7));
    }






}
