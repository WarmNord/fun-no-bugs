package practice_10;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Task_16_Test {
    /*
    *     Тесты:
            "Java,Python,C++", "," → ["Java", "Python", "C++"]
            """, ", → [""]
            "word", "," → ["word"]
    * */

    @Test
    public void chekString() {
        String[] str = new String[] {"Java", "Python", "C++"};
        assertArrayEquals(str, Task_16.splitString("Java,Python,C++", ","));
    }

    @Test
    public void emptyString() {
        assertArrayEquals(new String[] {""}, Task_16.splitString(  "", "," ));
    }

    @Test
    public void oneString() {
        assertArrayEquals(new String[] {"word"}, Task_16.splitString(  "word", "," ));
    }
}
