package practice_10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_11_Test {
    /*
    * Тесты:
Обычный список ([1, 2, 3, 4, 5, 6] → [2, 4, 6])
Список без чётных чисел
Пустой список*/

    @Test
    public void usuallList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expectetedResult = Arrays.asList(2,4,6);
        assertEquals(expectetedResult, Task_11.filterEvenNumbers(list));
    }

    @Test
    public void notEvenList() {
        List<Integer> list = Arrays.asList(1,3,5);
        List<Integer> expectetedResult = Arrays.asList();
        assertEquals(expectetedResult, Task_11.filterEvenNumbers(list));
    }

    @Test
    public void emptyList() {
        List<Integer> list = Arrays.asList();
        List<Integer> expectetedResult = Arrays.asList();
        assertEquals(expectetedResult, Task_11.filterEvenNumbers(list));
    }
}
