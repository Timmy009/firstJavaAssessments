package tdd.assignmentTwoTDD;

import assignmentTwo.LargestNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {
    LargestNumber largestNumber;

    @BeforeEach
    public void setUp () {
        largestNumber = new LargestNumber();
    }
    @Test
    public void largestTest() {
        int [] arrays = {1, 3, 6, 8, 9, 4};
        assertEquals(9, largestNumber.getMaximumNumber(arrays));
    }
}
