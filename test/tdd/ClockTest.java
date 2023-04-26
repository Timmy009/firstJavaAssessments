package tdd;

import chapterThree.Clock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ClockTest {


        Clock clock;

        @BeforeEach
        public void setUp () {
            clock = new Clock(22, 30, 20);
        }

        @Test
        public void testThatArgsConstructorExist() {
            assertNotNull(clock);
        }
        @Test
        public void setHourTest() {
            clock.setHour(2);
            assertEquals(2, clock.getHour());
        }
        @Test
        public void setSecTest () {
            clock.setSecond(30);
            assertEquals(30, clock.getSecond());
        }
        @Test
        public void setMinTest () {
            clock.setMinute(40);
            assertEquals(40, clock.getMinute());
        }

        @Test
        public void getHourTest () {
            assertEquals(22, clock.getHour());
        }
        @Test
        public void getMinuteTest () {
            assertEquals(30, clock.getMinute());
        }
        @Test
        public void getSecondTest () {
            assertEquals(20, clock.getSecond());
        }


       @Test
        public void displayTimeTest () {
            clock.setHour(30);
            clock.setMinute(9);
            clock.setSecond(40);
            assertEquals("00:09:40", clock.displayTime());
        }
    @Test
    public void displayTimeTestTwo () {
        clock.setHour(20);
        clock.setMinute(9);
        clock.setSecond(40);
        assertEquals("20:09:40", clock.displayTime());
    }
        @Test
    public void setForMOreThan23Hours () {
            clock.setHour(25);
            assertEquals(0, clock.getHour());
        }
    @Test
    public void setForMOreThan59Minutes () {
        clock.setMinute(70);
        assertEquals(0, clock.getMinute());
    }
    @Test
    public void setForMOreThan59Seconds () {
        clock.setSecond(-2);
        assertEquals(0, clock.getSecond());
    }
}
