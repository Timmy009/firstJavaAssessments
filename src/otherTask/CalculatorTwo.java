package otherTask;

public class CalculatorTwo {
        private int result;

        public int calculate(int firstNumber, int secondNumber, char operator) {

            switch (operator) {
                case '+' -> performAddition(firstNumber, secondNumber);
                case '-' -> performSubtraction(firstNumber, secondNumber);
                case '*' -> performMultiplication(firstNumber, secondNumber);
                case '/' -> performDivision(firstNumber, secondNumber);
                default -> result = 0;
            }
            return result;
        }

        private void performAddition(int firstNumber, int secondNumber) {
            result = firstNumber + secondNumber;
        }

        private void performMultiplication(int firstNumber, int secondNumber) {
            result = firstNumber * secondNumber;
        }

        private void performSubtraction(int firstNumber, int secondNumber) {
            if (firstNumber > secondNumber) {
                result = firstNumber - secondNumber;
            }
            else{
                result = secondNumber - firstNumber;
            }
        }
        private void performDivision(int firstNumber, int secondNumber) {
            if (firstNumber > secondNumber) {
                result = firstNumber / secondNumber;
            } else {
                result = secondNumber / firstNumber;
            }
        }
    }
