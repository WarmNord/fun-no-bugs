package practice_10;

import org.junit.jupiter.api.Test;
import practice01.practice_10.Task_15;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task_15_Test {
/*  Тесты:
            [ "Java", "C++", "Go" ] → [ 4, 3, 2 ]
    Пустой список*/
    @Test
    void mapToLengths() {
        assertEquals(Arrays.asList(4, 3, 2), Task_15.mapToLengths(Arrays.asList("Java", "C++", "Go")));
    }

    @Test
    void checkEmptyList() {
        assertEquals(Arrays.asList(), Task_15.mapToLengths(Arrays.asList()));
    }
}