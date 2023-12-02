package seminars.third.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void addUserAuthenticated() {
        UserRepository repository = new UserRepository();
        User user = new User("Alina", "password123", false);
        user.authenticate("Alina", "password123");
        repository.addUser(user);
        assertTrue(repository.findByName("Alina"));
    }

    @Test
    void addUserNotAuthenticated() {
        UserRepository repository = new UserRepository();
        User user = new User("Alina", "password123", false);
        repository.addUser(user);
        assertFalse(repository.findByName("Alina"));
    }
}
