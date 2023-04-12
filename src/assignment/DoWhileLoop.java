package assignment;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int sum = 0;
        boolean toContinue = false;
        do {
           System.out.println("Enter first number");
           firstNumber = input.nextInt();
           System.out.println("Enter second number");
           secondNumber = input.nextInt();
           sum = firstNumber + secondNumber;
           System.out.println("The sum of the two numbers is " + sum);
           System.out.println("Do you want to continue: True or False");
           toContinue = input.nextBoolean();
        } while (toContinue);
        System.out.println("Thank You");
    }
}
