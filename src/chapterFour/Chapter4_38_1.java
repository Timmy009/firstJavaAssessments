package chapterFour;

import java.util.Scanner;

public class Chapter4_38_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        int factorial = 1;
        while (number < 0) {
            System.out.println("This is an invalid number. Enter a non negative integer");
             number = input.nextInt();
        }
        int count = number;
        while (count > 0) {
            factorial =  factorial * count;
            count--;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
