package practice_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import practice01.practice_10.Task_05;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_05_Test {
    /*
    * Тесты должны проверять:
Обычные годы
Високосные (2020, 2000, 1600)
Года, которые делятся на 100, но не на 400 (1900, 2100)
    * */

    private static Stream<Arguments> usualYears() {
        return Stream.of(
                Arguments.of(1995, false),
                Arguments.of(1846, false)
        );
    }

    private static Stream<Arguments> leapYears() {
        return Stream.of(
                Arguments.of(2020, true),
                Arguments.of(2000, true),
                Arguments.of(1600,true)
        );
    }

    private static Stream<Arguments> notLeapAndUsualYears() {
        return Stream.of(
                Arguments.of(1900, false),
                Arguments.of(2100, false)
        );
    }


    @ParameterizedTest
    @MethodSource("usualYears")
    public void checkusualYears(int year, boolean expectedResult) {
        assertEquals(Task_05.isLeapYear(year), expectedResult);
    }

    @ParameterizedTest
    @MethodSource("leapYears")
    public void checkLeapYears(int year, boolean expectedResult) {
        assertEquals(Task_05.isLeapYear(year), expectedResult);
    }

    @ParameterizedTest
    @MethodSource("notLeapAndUsualYears")
    public void checkNotLeapAndUsualYears(int year, boolean expectedResult) {
        assertEquals(Task_05.isLeapYear(year), expectedResult);
    }
}
