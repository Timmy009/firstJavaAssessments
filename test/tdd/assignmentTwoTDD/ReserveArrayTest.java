package tdd.assignmentTwoTDD;

import assignmentTwo.ReverseArrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import otherTask.ReverseArray;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReserveArrayTest {
   ReverseArrays reverseArrays;

   @BeforeEach
    public void setUp () {

       reverseArrays = new ReverseArrays();
   }

   @Test
    public void reverseTest () {
       int [] arrays = {1, 2, 4, 7, 5};
       assertEquals("[5, 7, 4, 2, 1]", (Arrays.toString(reverseArrays.getReversedArray(arrays))));
   }

}
