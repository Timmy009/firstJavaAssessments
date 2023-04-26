package tdd.chapterSixTest;

import chapterSix.Exercise6_9;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise6_9test {
    Exercise6_9 exercise6_9;


   @Test
    public void objectTest() {
        exercise6_9 = new Exercise6_9();
        assertNotNull(exercise6_9);
    }
    @BeforeEach
    public void setUpTest() {
        exercise6_9 = new Exercise6_9();}

    @Test
    public void roundOffTest() {
       exercise6_9.setXValue(6.3);
       double y = exercise6_9.roundOff();
       assertEquals(6.0, y);
    }
}