package tdd;

import org.junit.jupiter.api.Test;
import otherTask.ArranAdd;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArranAddTest {

    @Test
    public void arratTest() {
        int [] li = {2, 4, 3};
        int [] l2 = {5, 6, 4};

        assertEquals("[7, 0, 8]", Arrays.toString( ArranAdd.arrayAddition(li, l2)));
    }

    @Test
    public void arratTestTwo() {
        int [] li = {9, 9, 9, 9, 9, 9, 9};
        int [] l2 = {9, 9, 9, 9};

        assertEquals("[8, 9, 9, 9, 0, 0, 0, 1]", Arrays.toString( ArranAdd.arrayAddition(li, l2)));
    }
}
