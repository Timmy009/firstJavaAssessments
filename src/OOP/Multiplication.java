package OOP;

public class Multiplication {
    public int multiply(int firstNumber, int secondNumber) {
        int mult = 0;
        if (secondNumber < 1 || firstNumber < 1 ){
            secondNumber = secondNumber - secondNumber -secondNumber;
            firstNumber = firstNumber  - firstNumber -firstNumber;

        }
        for (int count = 0; count < secondNumber; count++) {
            mult += firstNumber;
        }



        return mult;
    }
}
