import java.util.regex.Pattern;

public class PasswordValidator {
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%=:?])[A-Za-z\\d@#$%=:?]{8,12}$"
    );

    public boolean isValid(String password) {
        return PASSWORD_PATTERN.matcher(password).matches();
    }
}
