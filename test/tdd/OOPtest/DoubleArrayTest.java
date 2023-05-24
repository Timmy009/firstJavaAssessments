package tdd.OOPtest;

import OOP.DoubleArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleArrayTest {
    DoubleArray doubleArray;

    @BeforeEach
    public void setUp() {
       doubleArray = new DoubleArray();
    }
    @Test
    public void doubledArrayTest() {
        int [] arrays = {2, 5, 1};
        int [] arrayTwo = doubleArray.doubledArray(arrays);
       assertEquals("[2, 5, 1, 0, 0, 0]", Arrays.toString(arrayTwo));
    }


    @Test
    public void doubledArrayDuplicationTest() {
        int [] arrays = {2, 5, 1, 1, 5};
        int [] arrayTwo = doubleArray.doubledArrayDuplicateRemoval(arrays);
        assertEquals("[2, 5, 1, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(arrayTwo));
    }

}
