package tdd.assignmentTwoTDD;

import assignmentTwo.ArrayConcantenation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayConcantenationTest {
    ArrayConcantenation arrayConcantenation;

    @BeforeEach
    public void setUp () {
        arrayConcantenation = new ArrayConcantenation();
    }
    @Test
    public void listConcant() {
        int [] arrayOne = {1, 2, 3, 4, 5};
        int [] arrayTwo = {6, 7, 8, 9, 10};
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", Arrays.toString( arrayConcantenation.arrayCon(arrayOne, arrayTwo)));
    }
}
