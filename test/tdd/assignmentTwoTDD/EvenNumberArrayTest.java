package tdd.assignmentTwoTDD;

import assignmentTwo.EvenNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenNumberArrayTest {
    EvenNumber evenNumber;

    @BeforeEach
    public void setUp () {
        evenNumber = new EvenNumber();
    }
    @Test
    public void evenNumberTest() {
        int [] arrays = {1, 2, 3, 4, 5, 5, 7, 8, 9, 10};
        assertEquals("2 4 5 8 10 ", evenNumber.getEvenNumber(arrays));
    }
}
