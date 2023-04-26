package tdd.chapterSixTest;

import chapterSix.Exercise6_14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise4_14Test {
    Exercise6_14 exercise6_14 = new Exercise6_14();

    @Test
    public void mathFloorTest () {
            assertEquals(4, exercise6_14.mathFloor(4.7));
    }
    @Test
    public void mathFloorTestSameWhole () {
        assertEquals(-4, exercise6_14.mathFloor(-4));
    }
    @Test
    public void mathFloorTestNormal () {
        assertEquals(4, exercise6_14.mathFloor(4.0));
    }
    @Test
    public void mathFloorTestZero () {
        assertEquals(0, exercise6_14.mathFloor(0));
    }
    @Test
    public void mathFloorTestNegative () {
        assertEquals(-3, exercise6_14.mathFloor(-2.4));
    }
    @Test
    public void mathCellingTest () {
        assertEquals(3, exercise6_14.mathCelling(2.4));
    }
    @Test
    public void mathCellingTestZero () {
        assertEquals(0, exercise6_14.mathCelling(0.0));
    }
    @Test
    public void mathCellingTestNegative () {
        assertEquals(-2, exercise6_14.mathCelling(-2.4));
    }
    @Test
    public void mathCellingTestWholeNumber () {
        assertEquals(2, exercise6_14.mathCelling(2));
    }
}
