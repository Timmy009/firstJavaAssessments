package tdd;

import org.junit.jupiter.api.Test;
import otherTask.Task3;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    int [] number = {5, 3, 2, 1, 6};
    @Test
    public void minTest() {
       assertEquals(1, Task3.arrayMin(number));
    }
    @Test
    public void maxTest() {
        assertEquals(6, Task3.arrayMax(number));
    }
}
