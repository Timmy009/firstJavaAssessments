package tdd.chapterSixTest;

import chapterSix.Exercise6_8;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest6_8 {
    Exercise6_8 exercise6_8;

    @BeforeEach
    public void setUp () {
        exercise6_8 = new Exercise6_8();

    }

    @Test
    public void calculateChargesTest () {
        exercise6_8.setHours(10);
        assertEquals(5.5, exercise6_8.calculateCharges());
    }
}
