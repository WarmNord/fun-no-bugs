package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task_18_Test {

    /*
    *   Тесты:
            24, 36 → 12
            101, 103 → 1
            0, 10 → 10
    * */

    static Stream<Arguments> validNumber() {
        return Stream.of(
                Arguments.of(24, 36, 12),
                Arguments.of(101, 103, 1),
                Arguments.of(0, 10, 10));
    }

    @ParameterizedTest
    @MethodSource("validNumber")
    public void findNode(int a, int b, int expectedResult) {
        assertEquals(expectedResult, Task_18.gcd(a, b));
    }

}