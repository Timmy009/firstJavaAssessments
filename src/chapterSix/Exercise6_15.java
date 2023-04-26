package chapterSix;

import java.util.Scanner;

public class Exercise6_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter number: ");
        double num2 = scanner.nextDouble();
        System.out.println("The hypotenuse is " + hypotenuseCalculation(num1, num2));

    }
    public static double hypotenuseCalculation (double num1, double num2) {
        return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));

    }
}
