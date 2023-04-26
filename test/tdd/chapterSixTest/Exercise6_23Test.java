package tdd.chapterSixTest;

import chapterSix.Exercise6_23;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6_23Test {
    @Test
    public void pallindromeTest () {
        assertEquals("It is a pallindrome", Exercise6_23.pallindrome("12321"));
    }
}
