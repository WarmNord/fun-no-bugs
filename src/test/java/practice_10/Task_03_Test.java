package practice_10;

import org.junit.jupiter.api.Test;
import practice01.practice_10.Task_03;

import static org.junit.jupiter.api.Assertions.*;


public class Task_03_Test {
    /*Тесты должны проверять:
Обычные строки
Пустую строку
null (должно возвращаться null)*/

    @Test
    public void checkUsualString() {
        assertEquals(Task_03.reverse("hi"), "ih");
        assertEquals(Task_03.reverse("BYE"), "EYB");
    }

    @Test
    public void checkZeroString() {
        assertEquals(Task_03.reverse(""), "");
    }

    @Test
    public void checkNullString() {
        assertEquals(Task_03.reverse(null), null);
    }
}
