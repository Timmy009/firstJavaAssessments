package tdd.chapterSixTest;

import chapterSix.Exercise6_27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6_27Test {

@Test
    public void gcfTest () {
        assertEquals(2, Exercise6_27.gcf(10, 12));
    }
}
