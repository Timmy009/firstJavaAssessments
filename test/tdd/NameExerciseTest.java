package tdd;

import org.junit.jupiter.api.Test;
import schoolExercises.NameExercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameExerciseTest {
    private NameExercise nameExercise = new NameExercise();
    @Test
    public void nameTest () {
        assertEquals ("Hello Timi", nameExercise.getName("Timi"));
    }
}
