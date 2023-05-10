package tdd.assignmentTwoTDD;

import assignmentTwo.Frequency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FrequencyTest {
    Frequency frequency;

    @BeforeEach
    public void setUp () {
        frequency = new Frequency();
    }
    @Test
    public void frequentNumberTest () {
        int [] arrays = {1, 2, 3, 5, 6, 7};
        int number = 5;
        assertTrue(frequency.frequentNumber(arrays, number));
    }

    @Test
    public void nonFrequentNumberTest () {
        int [] arrays = {1, 2, 3, 5, 6, 7};
        int number = 10;
        assertFalse(frequency.frequentNumber(arrays, number));
    }
}
