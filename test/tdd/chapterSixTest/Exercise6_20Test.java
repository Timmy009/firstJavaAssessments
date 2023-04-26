package tdd.chapterSixTest;

import chapterSix.Exercise6_20;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6_20Test {
    @Test
    public void leapYearTest () {
        assertEquals(true, Exercise6_20.leapYear(2024));
    }
}
