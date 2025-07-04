package practice_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import practice01.practice_10.Task_10;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_10_Test {
    /*Тесты должны проверять:
Корректные номера ("+1 1234567890")
Некорректные номера ("12345", "invalid")*/

    static Stream<Arguments> validNumber() {
        return Stream.of(
                Arguments.of("+1 1234567890", true),
                Arguments.of("+2 1234667890", true));
    }

    static Stream<Arguments> invalidNumber() {
        return Stream.of(
                Arguments.of("23", false),
                Arguments.of("uwawuawu", false));
    }

    @ParameterizedTest
    @MethodSource("validNumber")
    public void checkValidNumber(String number, boolean expectedResult) {
        assertEquals(expectedResult, Task_10.isValidPhoneNumber(number));
    }

    @ParameterizedTest
    @MethodSource("invalidNumber")
    public void checkInvalidNumber(String number, boolean expectedResult) {
        assertEquals(expectedResult, Task_10.isValidPhoneNumber(number));
    }
}
