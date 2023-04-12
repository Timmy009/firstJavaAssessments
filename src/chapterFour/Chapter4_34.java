package chapterFour;

import java.util.Scanner;

    public class Chapter4_34 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the First Number");
            int firstNumber = input.nextInt();
            int sum = 0;
            while (sum < firstNumber) {
                System.out.println("Enter a number");
                sum = sum + input.nextInt();
            }
            System.out.println("The sum of the number is " + sum + " and the First Number is " + firstNumber);
        }
    }


