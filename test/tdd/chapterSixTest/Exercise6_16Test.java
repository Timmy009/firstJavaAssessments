package tdd.chapterSixTest;

import chapterSix.Exercise6_16;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6_16Test {

    @Test
    public void multiplesTest () {

        assertEquals(false, Exercise6_16.getMultiples(13, 98));
    }
    @Test
    public void multiplesTest2 () {

        assertEquals(true, Exercise6_16.getMultiples(2, 4));
    }

}
