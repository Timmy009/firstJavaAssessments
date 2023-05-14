package tdd.chapterSevenTest;

import chapterSeven.DuplicateElimination;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateEliminationTest {
    private DuplicateElimination duplicateElimination;




    @BeforeEach
    public void setUp() {
        duplicateElimination = new DuplicateElimination();
    }

    @Test
    public void initialisedElementTest() {
        ArrayList<Integer> arrays = new ArrayList<>(10);
        duplicateElimination.setArrays(arrays);
        // asserts
        for (int count = 0; count < 10; count++) {
            assertEquals(-1, duplicateElimination.getArrays().get(count));
        }
    }

    @Test
    public void inputTenNumbersTest () {
        // given
        ArrayList<Integer> arrays = new ArrayList<>(List.of(10, 10, 14, 56, 45, 10, 20, 56, 67, 90));

        // when
        String element = duplicateElimination.removeDuplicate(arrays);
        assertEquals("There is a duplicate", element);
    }

}

