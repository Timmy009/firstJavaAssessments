package tdd;

import chapterThree.Clock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {

        Clock clock = new Clock(43, 43, 43);



       @Test
        public void displayTimeTest () {
            assertEquals("43:43:43", clock.displayTime());
        }
}
