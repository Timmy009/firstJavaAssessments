package tdd.chapterSixTest;

import chapterSix.Exercise6_21;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6_21Test {

    @Test
    public void stringFullstopTest () {
        assertEquals("timmy.", Exercise6_21.addFullStop("timmy."));
    }

    @Test
    public void stringCapitalLetterstopTest () {
        assertEquals("Timmy.", Exercise6_21.addCapitalLetter("timmy."));
    }

}
