package assignment;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        int maxNumber = 10;
        while (number <= maxNumber) {
            System.out.print("Enter number: ");
            sum = sum + input.nextInt();
            number++;
        }
        System.out.println("The sum of the 10 number is " + sum);
    }
}
