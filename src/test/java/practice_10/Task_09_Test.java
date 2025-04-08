package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task_09_Test {
    /*
    * Тесты должны проверять:
Пустую строку
null
Строку с несколькими пробелами*/

    @Test
    public void emptyString() {
        assertEquals(0, Task_09.countWords(""));
    }

    @Test
    public void nullString() {
        assertThrows(NullPointerException.class,
                () -> Task_09.countWords(null));
    }

    @Test
    public void spaceString() {
        assertEquals(3, Task_09.countWords("hi Leya hi"));
    }
}
