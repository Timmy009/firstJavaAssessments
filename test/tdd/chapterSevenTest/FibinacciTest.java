package tdd.chapterSevenTest;

import chapterSeven.Fibonacci;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibinacciTest {

   private Fibonacci fibonacci;
    @BeforeEach
    public void setUp() {
        fibonacci = new Fibonacci();
    }
    @Test
    public void FibonacciTest() {
        String fibonacciNumber = fibonacci.getFibonaci(9);
        assertEquals("[0, 1, 1, 2, 3, 5, 8, 13, 21]", fibonacciNumber);

    }
}
