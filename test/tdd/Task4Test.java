package tdd;

import org.junit.jupiter.api.Test;

import otherTask.Task4;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {

        int [] number = {5, 3, 2, 1, 6, -1};
        @Test
        public void minTest() {
            String minimumAndMaximumNumber = Task4.arrayMaxAndMin(number);
            assertEquals("The minimum and the maximum values are -1 and 6 respectively", minimumAndMaximumNumber);
        }

}
