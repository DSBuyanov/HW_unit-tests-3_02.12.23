package seminars.third.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void authenticateSuccess() {
        User user = new User("Alina", "password123", false);
        assertTrue(user.authenticate("Alina", "password123"));
    }

    @Test
    void authenticateFailure() {
        User user = new User("Alina", "password123", false);
        assertFalse(user.authenticate("Roman", "password123"));
    }
}
