package tdd.OOPtest;

import OOP.Multiplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    Multiplication multiplication;

    @BeforeEach
    public void setUp() {
        multiplication = new Multiplication();
    }
    @Test
    public void multiplyTest() {
        int multiple = multiplication.multiply(5, 2);
        assertEquals(10, multiple);

    }

    @Test
    public void multiplyTwoTest() {
        int multiple = multiplication.multiply(-5, -10);
        assertEquals(50, multiple);

    }

    @Test
    public void multiplyThreeTest() {
        int multiple = multiplication.multiply(5, -10);
        assertEquals(50, multiple);

    }
}
