package tddProject;

    public class Calculator {
        public int addMethod(int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }
        public int subtractMethod(int firstNumber, int secondNumber) {
            if (firstNumber > secondNumber) return firstNumber - secondNumber;
            if (secondNumber > firstNumber) return secondNumber - firstNumber;
            return 0;
        }

        public int multiplicationMethod(int firstNumber, int secondNumber) {
            return firstNumber * secondNumber;
        }
        public int divisionMethod(int firstNumber, int secondNumber) {
            return firstNumber / secondNumber;
        }
    }


