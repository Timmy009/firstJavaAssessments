package tdd.chapterSixTest;

import chapterSix.Exercise6_10;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise6_10Test {
    Exercise6_10 exercise6_10;

   @Test
    public void objectTest () {
        exercise6_10 = new Exercise6_10();
        assertNotNull(exercise6_10);
    }

    @BeforeEach
    public void setUp() {
        exercise6_10 = new Exercise6_10();
        exercise6_10.setNumber(1234.56789);
    }
    @Test
    public void roundToInteger () {

       int rountToInteger = exercise6_10.roundToInteger();
       assertEquals(1235, rountToInteger);

    }
    @Test
    public void roundToTenths () {

        double rountToTenth = exercise6_10.roundToInTenth();
        assertEquals(1234.6, rountToTenth);

    }
    @Test
    public void roundToHundred () {

        double rountToHundred = exercise6_10.roundToHundred();
        assertEquals(1234.57, rountToHundred);

    }
    @Test
    public void roundToThousands () {

        double rountToThousands = exercise6_10.roundToInThousands();
        assertEquals(1234.568, rountToThousands);

    }




}
