package tdd.assignmentTwoTDD;

import assignmentTwo.CalculateSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateSumTest {
    CalculateSum calculateSum;

    @BeforeEach
    public void setUp () {
        calculateSum = new CalculateSum();
    }


    @Test
    public void sumTest () {
        int [] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals (45, calculateSum.cakcualteArraySumWithForLoop(arrays));
    }

    @Test
    public void sumTestWhileLoop () {
        int [] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals (45, calculateSum.cakcualteArraySumWithWhileLoop(arrays));
    }

    @Test
    public void sumTestDoWhile () {
        int [] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals (45, calculateSum.cakcualteArraySumWithDoWhileLoop(arrays));
    }
}
