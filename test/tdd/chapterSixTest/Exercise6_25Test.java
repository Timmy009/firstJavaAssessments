package tdd.chapterSixTest;

import chapterSix.Exercise25;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6_25Test {

    @Test
    public void primeNumberTest () {
        assertEquals("11 is a prime number", Exercise25.getPrime(11));

    }

    @Test
    public void nonPrimeNumberTest () {
        assertEquals("12 is not a prime number", Exercise25.getPrime(12));

    }
}
