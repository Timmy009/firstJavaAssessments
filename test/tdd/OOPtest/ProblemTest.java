package tdd.OOPtest;

import OOP.Person;
import OOP.Problems;
import OOP.Type;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest {
    Problems problems;
    Person person;
    @BeforeEach
    public void setUp () {
        problems = new Problems("money", Type.BUSINESS);
        person = new Person();
    }
    @Test
    public void addProblemTest () {
       person.addProblem(Type.EDUCATION);
       assertEquals("[EDUCATION]", person.getProblem());
    }
    @Test
    public void removeProblemTest () {
        person.addProblem(Type.EDUCATION);
        person.addProblem(Type.BUSINESS);
        person.solveProblem(Type.EDUCATION);
        assertEquals("[BUSINESS]", person.getProblem());
    }
}
