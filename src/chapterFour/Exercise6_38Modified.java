package chapterFour;

import java.util.Scanner;
import java.util.Random;

public class Exercise6_38Modified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int difficulty = 1;
        int correctCount = 0;

        System.out.print("What type of problem would you like to study?\n"
                + "Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, or 5 for a random mixture: ");
        int operatorType = input.nextInt();
        while (operatorType < 1 || operatorType > 5) {
            System.out.print("Invalid input. Please enter 1, 2, 3, 4, or 5: ");
            operatorType = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int operator;
            if (operatorType == 5) {
                operator = rand.nextInt(4);
            } else {
                operator = operatorType - 1;
            }

            int num1 = rand.nextInt(difficulty * 10);
            int num2 = rand.nextInt(difficulty * 10);

            if (operator == 0) {
                // Addition
                System.out.printf("What is %d + %d? ", num1, num2);
                int answer = input.nextInt();

                if (answer == num1 + num2) {
                    System.out.println("Correct!");
                    correctCount++;
                } else {
                    System.out.println("Incorrect. The answer is " + (num1 + num2));
                }
            } else if (operator == 1) {
                // Subtraction
                System.out.printf("What is %d - %d? ", num1, num2);
                int answer = input.nextInt();

                if (answer == num1 - num2) {
                    System.out.println("Correct!");
                    correctCount++;
                } else {
                    System.out.println("Incorrect. The answer is " + (num1 - num2));
                }
            } else if (operator == 2) {
                // Multiplication
                System.out.printf("What is %d * %d? ", num1, num2);
                int answer = input.nextInt();

                if (answer == num1 * num2) {
                    System.out.println("Correct!");
                    correctCount++;
                } else {
                    System.out.println("Incorrect. The answer is " + (num1 * num2));
                }
            } else {
                // Division
                while (num2 == 0) {
                    num2 = rand.nextInt(difficulty * 10);
                }

                int dividend = num1 * num2;
                System.out.printf("What is %d / %d? ", dividend, num2);
                int answer = input.nextInt();

                if (answer == num1) {
                    System.out.println("Correct!");
                    correctCount++;
                } else {
                    System.out.println("Incorrect. The answer is " + num1);
                }
            }

            difficulty++;
        }

        double score = (double) correctCount / 10 * 100;
        System.out.printf("You scored %.2f%%.\n", score);

        if (score < 75) {
            System.out.println("Please ask your teacher for extra help.");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
    }
}
