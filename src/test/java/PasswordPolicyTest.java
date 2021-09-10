import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PasswordPolicyTest {


    @Test
    @DisplayName("checkPasswordLengthTest")
    public void checkPasswordLengthTest(){

        // GIVEN
        String passwordLongEnough = "Test123!";    // happy path: has to be longer than 6 chars
        String passwordTooShort = "hallo";         // negative path: less than 6 chars

        // WHEN
        boolean passwordLengthCheckResult = PasswordPolicy.checkPasswordLength(passwordLongEnough);

        // THEN
        Assertions.assertTrue(passwordLengthCheckResult);
    }

    @Test
    @DisplayName("checkPasswordContainsDigitsTest")
    public void checkPasswordContainsDigitsTest(){

        // GIVEN
        String passwordContainsDigits = "Test123!"; // happy path: it contains digits
        String passwordWithoutDigits = "Hallo";     // negative path

        // WHEN
        boolean passwordDigitCheckResult = PasswordPolicy.checkPasswordContainsDigits(passwordContainsDigits);

        // THEN
        Assertions.assertTrue(passwordDigitCheckResult);
    }

}
