package assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int factorial = 1;
        int count = number;
        while (count >= 1) {
           factorial = factorial *  count;
            count--;

        }
        System.out.println("The factorial is " + factorial);
    }
}
