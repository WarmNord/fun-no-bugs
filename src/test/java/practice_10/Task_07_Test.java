package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task_07_Test {
    /*
    * Тесты должны проверять:
0! = 1
Маленькие числа (1!, 5!, 7!)
1! =  1
2! =  1 * 2 = 2
3! =  1 * 2 * 3 = 6
4! =  1 * 2 * 3 * 4 = 24
5! =  1 * 2 * 3 * 4 * 5  = 120
* Отрицательные числа (должно выбрасываться исключение)*/

    private static Stream<Arguments> littleNumber() {
        return Stream.of(
                Arguments.of(1,1),
                Arguments.of(2,2),
                Arguments.of(3,6),
                Arguments.of(4,24),
                Arguments.of(5,120)
                );
    }

    @Test
    public void checkZero() {
        assertEquals(1, Task_07.factorial(0));
    }

    @ParameterizedTest
    @MethodSource("littleNumber")
    public void checkValidEmails(int number, int expectedResult) {
        assertEquals(expectedResult, Task_07.factorial(number));
    }

    @Test
    public void chekNegativeNumber() {
        assertThrows(IllegalArgumentException.class, ()-> { Task_07.factorial(-1);});
    }
}
