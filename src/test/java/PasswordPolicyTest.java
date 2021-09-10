import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PasswordPolicyTest {


    @Test
    @DisplayName("checkPasswordLengthTest")
    public static void checkPasswordLengthTest(){

        // GIVEN
        String passwordLongEnough = "Test123!";    // happy path: has to be longer than 6 chars
        String passwordTooShort = "hallo";         // negative path: less than 6 chars

        // WHEN
        boolean passwordLengthChecktresult = PasswordPolicy.checkPasswordLength(passwordLongEnough);

        // THEN
        Assertions.assertTrue(passwordLengthChecktresult);
    }

}
