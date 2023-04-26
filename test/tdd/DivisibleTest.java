package tdd;

import chapterFour.Divible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleTest {
    Divible divible = new Divible();
    @Test
    public void threeDiovisibleTest () {
        divible.setNumber(30);
        assertEquals("The sum of the integers between 1 and 30, which are divisible by 3 is 165", divible.calculateDivible());
    }
}
