package tdd.assignmentTwoTDD;

import assignmentTwo.ArrayOdd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayNumberInOddPosition {
    ArrayOdd arrayOdd;

    @BeforeEach
    public void setUp () {
        arrayOdd = new ArrayOdd();
    }
    @Test
    public void oddArrayTest () {
        int [] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 8, 10};
        assertEquals("1 3 5 7 8 ", (arrayOdd.getArrayInOddPosition(arrays)));
    }
}
