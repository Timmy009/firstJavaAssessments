package tdd;

import org.junit.jupiter.api.Test;
import tddProject.StudentScore;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

    public class StudentTest {

        @Test
        public void testThatObjectCanBeCreated() {
            StudentScore studentScore = new StudentScore();
            assertNotNull(studentScore);
        }
        @Test
        public void studentScoreTest () {
            StudentScore studentScore = new StudentScore();
            assertEquals(32.5, studentScore.calculateAverage());
        }

    }

