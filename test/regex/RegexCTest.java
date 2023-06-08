package regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexCTest {
    @Test
    public void matchOne () {
//        String pattern = "\\d";

//        String pattern = "\\d\\d";
//        String pattern = "\\d*";
        String pattern = "\\d{2}";
        String text = "99";
        boolean result = RegexC.findMatch(text, pattern);
        assertTrue(result);

    }
    @Test public void validatePhoneNumber () {
        String phoneNumber = "+2348035256765";

        boolean result = RegexC.validatePhoneNumber(phoneNumber);
        assertTrue(result);
    }

}