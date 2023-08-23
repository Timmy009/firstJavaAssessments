package otherTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTaskTest {
  DateTask dateTask;

    @BeforeEach
    public void setUp () {
        dateTask = new DateTask();
    }

    @Test  public void testOne () {
    String actual = dateTask.dateConvert (1000000000);

   assertEquals("0 years 4 months 24 days ", actual);
    }


    @Test  public void testTwo () {
        String actual = dateTask.dateConvert (747848);

        assertEquals("0 years 0 months 0 days ", actual);
    }


}