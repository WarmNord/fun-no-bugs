package practice_12_02;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UserValidatorTest {
    private static UserValidator validator;
    static User user = new User("ny", 20, "sads@gmail.com");
    static User invalidName = new User("", 15, "sads@gmail.com");
    static User invalidAge = new User("Any", 150, "sads@gmail.com");
    static User invalidEmail = new User("Any", 15, "sadsgmail.com");

    @BeforeAll
    static void setUp() {
        validator = new UserValidator();
    }

    @Test
    void checkUserName() {
        assertThrows(InvalidUserException.class, () -> validator.validateUser(invalidName, true));
    }

    @Test
    void checkUserAge() {
        assertThrows(InvalidUserException.class, () -> validator.validateUser(invalidAge, true));
    }

    @Test
    void checkUserEmail() {
        assertThrows(InvalidUserException.class, () -> validator.validateUser(invalidEmail, true));
    }

    @Test
    void checkValidationDisabled() {
        assertDoesNotThrow(() -> validator.validateUser(invalidEmail, false));
    }
}
