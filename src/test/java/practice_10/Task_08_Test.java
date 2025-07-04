package practice_10;

import org.junit.jupiter.api.Test;
import practice01.practice_10.Task_08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task_08_Test {
    /*Тесты должны проверять:
Обычные массивы
Массив с одинаковыми числами
Один элемент в массиве (должно выбрасываться исключение)
    * */

    @Test
    public void checkUsualArray() {
        assertEquals(5, Task_08.findSecondMax(new int[] {10, 5, 1}));
    }

    @Test
    public void checkArrayWithDuplicateNumbers() {
        assertEquals(23, Task_08.findSecondMax(new int[] {23, 23}));
    }

    @Test
    public void chekOneElementArray() {
       assertThrows(IllegalArgumentException.class,
               () -> Task_08.findSecondMax(new int[] {23}));

    }
}
