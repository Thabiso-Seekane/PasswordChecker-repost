import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordTester {
    @Test
    void passwordIsValid() {
        PasswordCheck check = new PasswordCheck();
        assertTrue(check.passwordIsValid("ThabisoSeekane001$#@"));
    }

    @Test
    void passwordIsOk() {
        PasswordCheck isOk = new PasswordCheck();
        assertTrue(isOk.passwordIsOk("ThabisoSeekane))!$#@"));
    }
}
