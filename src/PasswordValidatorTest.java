import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void passwordLengthWithinRange() {
        assertTrue(validator.isValid("P@ssw0rd!"));
        assertFalse(validator.isValid("P@ss"));
        assertFalse(validator.isValid("P@ssw0rdsAreReallyCool!"));
    }

    @Test
    void passwordContainsSpecialCharacters() {
        assertTrue(validator.isValid("P@ssw0rd!"));
        assertFalse(validator.isValid("Password1"));
    }

    @Test
    void passwordContainsDigits() {
        assertTrue(validator.isValid("P@ssw0rd!"));
        assertFalse(validator.isValid("P@ssword!"));
    }

    @Test
    void passwordContainsNoCharacters() {
        assertFalse(validator.isValid("12345678"));
    }

    @Test
    void passwordContainsUpperCase() {
        assertTrue(validator.isValid("P@ssw0rd!"));
        assertFalse(validator.isValid("p@ssw0rd!"));
    }

    @Test
    void passwordContainsLowerCase() {
        assertTrue(validator.isValid("P@ssw0rd!"));
        assertFalse(validator.isValid("P@SSW0RD!"));
    }

    @Test
    void passwordContainsNumber() {
        assertTrue(validator.isValid("P@ssw0rd!"));
        assertFalse(validator.isValid("P@ssword!"));
    }

    @Test
    void passwordContainsSymbol() {
        assertTrue(validator.isValid("P@ssw0rd!"));
        assertFalse(validator.isValid("P@ssw0rd"));
    }
}
