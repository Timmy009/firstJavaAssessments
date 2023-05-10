package tdd.assignmentTwoTDD;

import assignmentTwo.ListConcatinationTwo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListConcatinationTwoTest {
    ListConcatinationTwo listConcatinationTwo;

    @BeforeEach
    public void setUp () {
        listConcatinationTwo = new ListConcatinationTwo();
    }
    @Test
    public void listConcant() {
        int [] arrayOne = {1, 2, 3, 4, 5};
        int [] arrayTwo = {6, 7, 8, 9, 10};
        assertEquals("[1, 6, 2, 7, 3, 8, 4, 9, 5, 10]", Arrays.toString( listConcatinationTwo.arrayCon(arrayOne, arrayTwo)));
    }

}
