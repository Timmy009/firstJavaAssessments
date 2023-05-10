package tdd.assignmentTwoTDD;

import assignmentTwo.NumberArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberArrayTest {
    NumberArray numberArray;

    @BeforeEach
    public void setUp () {
        numberArray = new NumberArray();
    }

    @Test
    public void numberArrayTest () {
        assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(numberArray.numberArray(123456)));



    }
}

