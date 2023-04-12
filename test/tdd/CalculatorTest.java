package tdd;

import org.junit.jupiter.api.Test;
import tddProject.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class CalculatorTest {

        @Test
        public void addNumberTest () {
            Calculator calculator = new Calculator();
            assertEquals (11, calculator.addMethod(3, 8));
        }

        @Test
        public void subtractNumberTest () {
            Calculator calculator = new Calculator();
            assertEquals (2, calculator.subtractMethod(10, 8));
        }
        @Test
        public void subtractNumberTestNegative () {
            Calculator calculator = new Calculator();
            assertEquals (5, calculator.subtractMethod(3, 8));
        }
        @Test
        public void multiplicationTest () {
            Calculator calculator = new Calculator();
            assertEquals(12, calculator.multiplicationMethod(4, 3));
        }
        @Test
        public void divisionTest () {
            Calculator calculator = new Calculator();
            assertEquals(5, calculator.divisionMethod(10, 2));
        }



    }

