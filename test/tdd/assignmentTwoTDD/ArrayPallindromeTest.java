package tdd.assignmentTwoTDD;

import assignmentTwo.PallindromeArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.PallindromesTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayPallindromeTest {
    PallindromeArray pallindromeArray;

    @BeforeEach
    public void setUp () {
        pallindromeArray = new PallindromeArray();
    }
    @Test
    public void pallindromeTest () {
        assertEquals("It is a pallindrome", pallindromeArray.paalindrome("madam"));
    }

    @Test
    public void notPallindromeTest () {
        assertEquals("It is not a pallindrome", pallindromeArray.paalindrome("timi"));
    }

}
