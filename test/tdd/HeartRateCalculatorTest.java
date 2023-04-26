package tdd;

import chapterThree.HeartRateCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeartRateCalculatorTest {
   private HeartRateCalculator heartRateCalculator;

    @BeforeEach
    private void testSetUp() {
        heartRateCalculator = new HeartRateCalculator("Timileyin", "Samson", "13-Dec-2001");
    }

    @Test
    public void testThatArgsConstructorExist () {
        assertNotNull(heartRateCalculator);
    }


    @Test
    public void calculateMaximumHeartRateTest () {
        heartRateCalculator.setDateOfBirth("19-Apr-2000");
        assertEquals(197, heartRateCalculator.calculateMaximumHeartRate());
    }
@Test
public void calculateTargetHeartRateTest () {
        heartRateCalculator.setDateOfBirth("19-Apr-2000");
        assertEquals("98.5-167.45", heartRateCalculator.calculateTargetHeartRate());
}



    @Test
    public void setFirstName () {
        heartRateCalculator.setFirstName("Timileyin");
        assertEquals("Timileyin", heartRateCalculator.getFirstName());
    }

    @Test
    public void setLastName () {
        heartRateCalculator.setLastName("samson");
        assertEquals("samson", heartRateCalculator.getLastName());
    }

    @Test
    public void getNameTest() {
        assertEquals("Timileyin", heartRateCalculator.getFirstName());
    }
    @Test
    public void getLastNameTest() {
        assertEquals("Samson", heartRateCalculator.getLastName());
    }
    @Test
    public void setDateOfBirth () {
        heartRateCalculator.setDateOfBirth("13-Dec-2001");
        assertEquals("13-Dec-2001", heartRateCalculator.getDateOfBirth());
    }
    @Test
    public void getDateOfBirth () {
       String dateOfBirth =  heartRateCalculator.getDateOfBirth();
        assertEquals("13-Dec-2001", heartRateCalculator.getDateOfBirth());
    }
    @Test
    public void getAgeTest () {
        heartRateCalculator.setDateOfBirth("13-03-2001");
        assertEquals(22, heartRateCalculator.getAge());
    }


}
