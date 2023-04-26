package tdd;

import chapterFour.Palindromes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PallindromesTest {

    Palindromes palindromes = new Palindromes();

    @Test
    public void pallindromesTestOne () {
        palindromes.setNumber(55555);
        assertEquals("55555 is a palindrome", palindromes.calculatePallindromes());
    }

    @Test
    public void notPallindromesTestOne () {
        palindromes.setNumber(45359);
        assertEquals("45359 is not palindrome", palindromes.calculatePallindromes());
    }
}
