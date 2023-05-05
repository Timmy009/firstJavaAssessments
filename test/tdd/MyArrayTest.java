package tdd;

import org.junit.jupiter.api.Test;
import otherTask.ArrayMethod;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayTest {
    ArrayMethod arrayMethod = new ArrayMethod();

    @Test
    public void arrayTest () {
        int [] arr = new int[500];
        int [] actual = arrayMethod.intArray(arr);
        for (int index = 0; index < actual.length; index++) {
           assertEquals(index+1, actual[index]);
        }

    }
}
