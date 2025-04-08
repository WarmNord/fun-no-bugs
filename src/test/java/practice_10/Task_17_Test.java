package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_17_Test {

    /*
    *
    Тесты:
            "Password1" → true
            "pass" → false
            null → false*/
    @Test
    void isValidPassword() {
        assertTrue(Task_17.isValidPassword("Password1"));
    }

    @Test
    void isInvalidPassword() {
        assertFalse(Task_17.isValidPassword("pass"));
        assertFalse(Task_17.isValidPassword(null));

    }
}