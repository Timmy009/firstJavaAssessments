package tdd;

import org.junit.jupiter.api.Test;
import schoolExercises.FactorialExercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTdd {
    FactorialExercise factorialExercise = new FactorialExercise();
    @Test
    public void factorialTest () {
        assertEquals (120, factorialExercise.calculateFactorial(5));
    }
}
