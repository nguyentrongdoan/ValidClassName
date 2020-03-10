import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRoom {
    private static final String ACCOUNT_REGEX = "^[ACP]+\\d{4}+[G-M]$";

    public ClassRoom() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
