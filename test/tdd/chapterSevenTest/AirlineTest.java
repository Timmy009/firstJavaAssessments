package tdd.chapterSevenTest;

import chapterSeven.Exercise7_19;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirlineTest {

    private Exercise7_19 airline;

    @BeforeEach
   public void setUp() {
        airline = new Exercise7_19();
    }
//    @Test
//    public void assignSeat () {
//        assertTrue(airline.assignFirstClasseats());
//    }

}
