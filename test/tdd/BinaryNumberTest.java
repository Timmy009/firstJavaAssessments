package tdd;

import chapterFour.BinaryNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryNumberTest {
    BinaryNumber binaryNumber = new BinaryNumber ();

    @Test
    public void calculateDecimalTest () {

        assertEquals(13, binaryNumber.calculateDecimal("1011"));
    }

}
