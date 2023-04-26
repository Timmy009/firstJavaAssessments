package tdd.chapterSixTest;

import chapterSix.Exercise6_17;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6_17Test {
    @Test
    public void isDivisibleTest () {
        assertEquals(true, Exercise6_17.isDivisible(20));
    }
    @Test
    public void isDivisibleTest2 () {
        assertEquals(false, Exercise6_17.isDivisible(23));
    }
}
