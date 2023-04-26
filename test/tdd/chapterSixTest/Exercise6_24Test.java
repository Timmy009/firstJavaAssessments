package tdd.chapterSixTest;

import chapterSix.Exercise6_24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6_24Test {
    @Test
    public void perfectNumberTest () {
        assertEquals("6 is a perfect number. The prime are 1, 2, and 3", Exercise6_24.perfectNumber(6));
    }
}
