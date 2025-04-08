package practice_10;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_12_Test {
    /*
    *
    * Тесты:
[ "Java", "C", "Python" ] → [ "C", "Java", "Python" ]
Одинаковые длины ([ "aa", "bb", "cc" ])
Пустой список
    * */

    @Test
    public void listSort() {
        List<String> list = Arrays.asList("Java", "C", "Python");
        List<String> ecpextedResult = Arrays.asList("C", "Java", "Python");

        assertEquals(ecpextedResult, Task_12.sortByLength(list));
    }

    @Test
    public void equalsLength() {
        List<String> list = Arrays.asList("aa", "bb", "cc");
        List<String> ecpextedResult = Arrays.asList("aa", "bb", "cc");

        assertEquals(ecpextedResult, Task_12.sortByLength(list));
    }

    @Test
    public void emptyList() {
        List<String> list = Arrays.asList();
        List<String> ecpextedResult = Arrays.asList();

        assertEquals(ecpextedResult, Task_12.sortByLength(list));
    }
}
