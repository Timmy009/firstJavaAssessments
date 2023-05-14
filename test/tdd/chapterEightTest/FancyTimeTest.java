package tdd.chapterEightTest;

import ChapterEight.FancyTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FancyTimeTest {
    FancyTime fancyTime;

    @BeforeEach
    public void setUp() {
        fancyTime = new FancyTime(24, 34);

    }

    @Test
    public void testThreeDisplay () {
        System.out.println(fancyTime.displayTIME(2));

        assertEquals(24 + ":" + 34, fancyTime.displayTIME(3));

    }
}
