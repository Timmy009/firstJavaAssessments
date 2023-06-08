package regex;

public class RegexC {

    public static  boolean findMatch (String text, String pattern) {
        return text.matches(pattern);
    }

    public static boolean validatePhoneNumber (String phoneNumber) {
    String regex = "^[234]+\\d{10}";
        return phoneNumber.matches(regex);
    }
}
