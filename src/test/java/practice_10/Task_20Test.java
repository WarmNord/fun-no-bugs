package practice_10;

import org.junit.jupiter.api.Test;
import practice01.practice_10.Task_20;

import static org.junit.jupiter.api.Assertions.*;

class Task_20Test {

  /*  [1, 2, 3, 4, 5] → false
            [1, 2, 2, 3] → true
    Пустой массив → false*/

    @Test
    void hasDuplicates() {
        assertTrue(Task_20.hasDuplicates(new int[] {1, 2, 2, 3}));
    }

    @Test
    public void checkInvalidArray() {
        assertFalse(Task_20.hasDuplicates(new int[] {1, 2, 3, 4, 5}));
        assertFalse(Task_20.hasDuplicates(new int[] {}));

    }
}