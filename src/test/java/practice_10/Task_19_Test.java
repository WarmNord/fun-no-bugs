package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import practice01.practice_10.Task_19;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task_19_Test {
    /*
    * Тесты:
    "{"key":"value"}" → true
    "invalid json" → false
    null → false
    */
    static Stream<Arguments> jsons() {
        return Stream.of(
                Arguments.of("invalid json"),
                Arguments.of((Object) null));
    }

    @ParameterizedTest
    @MethodSource("jsons")
    void isNotValidJson(String json) {
        assertFalse(Task_19.isValidJson(json));
    }

    @Test
    public void isValidJson() {
        assertTrue(Task_19.isValidJson("{\"key\":\"value\"}"));
    }
}