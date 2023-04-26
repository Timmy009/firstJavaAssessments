package tdd.chapterSixTest;

import chapterSix.Exercise6_26;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6_26Test {
    @Test
    public void sumTest () {

        assertEquals(17, Exercise6_26.sum("7631"));
    }
}
