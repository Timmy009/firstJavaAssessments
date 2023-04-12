package assignment;

import java.util.Scanner;

public class PowerOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = input.nextInt();
        int power = 1;
        int count = 1;
        while (count <= secondNumber) {
            power = power * firstNumber;
            count++;
        }
        System.out.println("The power is " + power);
    }
}
