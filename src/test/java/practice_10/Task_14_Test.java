package practice_10;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task_14_Test {

/*    Тесты:
            [1, 2, 3, 4, 5] → 3.0
            [10] → 10.0
    Пустой массив (должно выбрасываться исключение)*/

    @Test
    public void findAverage() {
        assertEquals(3.0, Task_14.findAverage(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void findAverageOneElemet() {
        assertEquals(1.0, Task_14.findAverage(new int[] {1}));
    }

    @Test
    public void emptyArray() {
        assertEquals(3.0, Task_14.findAverage(new int[] {1, 2, 3, 4, 5}));
        assertThrows(NoSuchElementException.class,
                () -> {Task_14.findAverage(new int[] {}); }
        );
    }

}
