package practice_10;

import org.junit.jupiter.api.Test;
import practice01.practice_10.Task_04;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;


public class Task_04_Test {
    /*
    * Тесты должны проверять:
Обычный массив ([3, 5, 7, 2])
Один элемент в массиве
Отрицательные числа
Пустой массив (должно выбрасываться исключение)*/

    @Test
    public void checkUsualArray() {
        assertEquals(Task_04.findMax(new int[] {3, 5, 7, 2}),7);
    }

    @Test
    public void checkOneElementArray() {
        assertEquals(Task_04.findMax(new int[] {30}),30);
    }

    @Test
    public void checkNegativeElementsArray() {
        assertEquals(Task_04.findMax(new int[] {-10, -222, -5}),-5);

    }

    @Test
    public void checkEmptyArray() {
        assertThrows(
                NoSuchElementException.class,
                () -> Task_04.findMax(new int [0])
        );
    }
}
