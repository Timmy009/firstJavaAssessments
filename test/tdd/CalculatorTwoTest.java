package tdd;

import org.junit.jupiter.api.Test;
import tddProject.CalculatorTwo;


import static org.junit.jupiter.api.Assertions.assertEquals;

    public class CalculatorTwoTest {
        @Test
        public void additionTest() {
            CalculatorTwo calculator = new CalculatorTwo();
            assertEquals(5,  calculator.calculate(2, 3, '+'));
        }
        @Test
        public void subtractionTest() {
            CalculatorTwo calculator = new CalculatorTwo();
            assertEquals(1,  calculator.calculate(2, 3, '-'));
        }
        @Test
        public void multiplicationTest() {
            CalculatorTwo calculator = new CalculatorTwo();
            assertEquals(6,  calculator.calculate(2, 3, '*'));
        }
        @Test
        public void divisionTest() {
            CalculatorTwo calculator = new CalculatorTwo();
            assertEquals(3,  calculator.calculate(2, 6, '/'));
        }
    }


