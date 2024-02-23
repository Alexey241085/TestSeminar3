
import seminars.third.tdd.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import seminars.third.tdd.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MainUserTest {

    @Test
    void testAuthenticateTrue(){
        User user = new User("Alex", "Ivashin", true);

        boolean authenticateResult = user.authenticate("Alex", "Ivashin", user);

        assertThat(authenticateResult).isTrue();
    }

    @Test
    void testAuthenticateFalse(){
        User user = new User("Alex", "Ivashin", true);

        boolean authenticateResult = user.authenticate("Ivan", "Petrov", user);

        assertThat(authenticateResult).isFalse();
    }


    @Test
    void addUserResult(){
        User user = new User("Alex", "Ivashin", true);
        UserRepository userRepository = new UserRepository();
        List<User> data = new ArrayList<>();

        user.authenticate("Alex", "Ivashin", user);
        userRepository.addUser(user);

//        assertThat();
    }


}
