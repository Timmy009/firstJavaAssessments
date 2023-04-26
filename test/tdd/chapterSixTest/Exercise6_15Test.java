package tdd.chapterSixTest;

import chapterSix.Exercise6_15;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6_15Test {


    @Test
    public void hypotenuseCalculationTest () {
        assertEquals(13, Exercise6_15.hypotenuseCalculation(5.0, 12.0));
    }
}
