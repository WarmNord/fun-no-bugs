package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import practice01.practice_10.Task_06;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_06_Test {
    /*
    * Тесты должны проверять:
Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
null
* */

    private static Stream<Arguments> correctEmails() {
        return Stream.of(
                Arguments.of("wiwiwi@gmail.com", true),
                Arguments.of("ertre5@gmail.com", true),
                Arguments.of("HOHO@outlook.com", true)
                );
    }

    private static Stream<Arguments> uncorrectEmails() {
        return Stream.of(
                Arguments.of("bad@.com", false),
                Arguments.of("asdasd", false),
                Arguments.of("HOHO@outlook@com", false)
        );
    }

    @ParameterizedTest
    @MethodSource("correctEmails")
    public void checkValidEmails(String email, boolean expectedResult) {
        assertEquals(expectedResult, Task_06.isValidEmail(email));
    }

    @ParameterizedTest
    @MethodSource("uncorrectEmails")
    public void checkUnvalidEmails(String email, boolean expectedResult) {
        assertEquals(expectedResult, Task_06.isValidEmail(email));
    }

    @Test
    public void checkNullEmail() {
        assertEquals(false, Task_06.isValidEmail(null));

    }
}
