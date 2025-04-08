package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Task_13_Test {
    /*Тесты:
"listen", "silent" → true
"java", "python" → false
null → false*/

    static Stream<Arguments> valid() {
        return Stream.of(
                Arguments.of("listen", "silent", true));
    }

    static Stream<Arguments> invalid() {
        return Stream.of(
                Arguments.of("java", "python" , false));
    }

    @ParameterizedTest
    @MethodSource("valid")
    public void validAnagram(String str1, String str2, boolean expectedResult){
        assertEquals(expectedResult, Task_13.isAnagram(str1, str2));

    }

    @ParameterizedTest
    @MethodSource("invalid")
    public void invalidAnagram(String str1, String str2, boolean expectedResult){
        assertEquals(expectedResult, Task_13.isAnagram(str1, str2));

    }

    @Test
    public void checkNull() {
        assertFalse(Task_13.isAnagram(null, "hi"));
        assertFalse(Task_13.isAnagram("hi", null));

    }
}
