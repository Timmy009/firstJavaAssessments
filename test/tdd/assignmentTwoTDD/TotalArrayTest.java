package tdd.assignmentTwoTDD;

import assignmentTwo.TotalArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalArrayTest {
    TotalArray totalArray;

    @BeforeEach
    public void setUp () {
        totalArray = new TotalArray();
    }
    @Test
    public void totalTest () {
        int [] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(45, totalArray.total(arrays));
    }
}
