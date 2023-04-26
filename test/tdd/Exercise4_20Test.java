package tdd;

import chapterFour.TaxCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise4_20Test {
TaxCalculator taxCalculator;

@BeforeEach
    public void setUp () {
    taxCalculator = new TaxCalculator();
}
@Test
public void taxTest () {
    taxCalculator.setEarnings(50000);
    assertEquals(8500, taxCalculator.calculateTax());
}

    @Test
    public void taxTestNegative () {
        taxCalculator.setEarnings(-5);
        assertEquals(0, taxCalculator.calculateTax());
    }
}
