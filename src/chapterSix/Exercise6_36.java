package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise6_36 {
        public static void main(String[] args) {
            studentQuestion();

        }
    private static SecureRandom rand = new SecureRandom();
    private static Scanner input = new Scanner(System.in);
    private static  int comment;
    private static  int count = 0;
    private static float correctAnswersPercentage = 0;
    private static int level = 10;
    private static int minNumberForEachLevel = 1;
    private static int levelCount = 1;
   private static  int correctAnswer;

        public static void studentQuestion () {
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Mixed");


            int num1 = minNumberForEachLevel + rand.nextInt(level);
            int num2 = minNumberForEachLevel + rand.nextInt(level);
            int operate = input.nextInt();

            switch (operate) {
                case 1:
                    System.out.println("How much is " + num1 + " + " + num2);
                    correctAnswer = num1 + num2;
                    int studentAnswer = input.nextInt();
                    while (count < 10) {
                    while (studentAnswer != correctAnswer) {
                        displayResponseForIncorrectAnswer();
                        studentAnswer = input.nextInt();
                        calculatePercentage();
                    }

                    displayResponseForCorrectResponse();
                    correctAnswersPercentage++;

                    calculatePercentage();
                    studentQuestion();
                        count++;}
                    break;
                case 2:
                    System.out.println("How much is " + num1 + " - " + num2);
                    correctAnswer = num1 - num2;
                    studentAnswer = input.nextInt();
                    while (count < 10) {
                    while (studentAnswer != correctAnswer) {
                        displayResponseForIncorrectAnswer();
                        studentAnswer = input.nextInt();
                        calculatePercentage();
                    }

                    displayResponseForCorrectResponse();
                    correctAnswersPercentage++;
                    calculatePercentage();
                    studentQuestion();
                        count++;
                    }
                    break;
                case 3:
                    System.out.println("How much is " + num1 + " * " + num2);
                    correctAnswer = num1 * num2;
                     studentAnswer = input.nextInt();
                     while (count < 10) {
                    while (studentAnswer != correctAnswer) {
                        displayResponseForIncorrectAnswer();
                        studentAnswer = input.nextInt();
                        calculatePercentage();
                    }

                    displayResponseForCorrectResponse();
                    correctAnswersPercentage++;
                    calculatePercentage();
                    studentQuestion();
                         count++;
                     }
                    break;
                case 4:
                    System.out.println("How much is " + num1 + " / " + num2);
                    correctAnswer = num1 / num2;
                    studentAnswer = input.nextInt();
                    while (count < 10) {
                    while (studentAnswer != correctAnswer) {
                        displayResponseForIncorrectAnswer();
                        studentAnswer = input.nextInt();
                        calculatePercentage();
                    }

                    displayResponseForCorrectResponse();
                    correctAnswersPercentage++;

                    calculatePercentage();
                    studentQuestion();
                        count++;
                    }
                    break;
                default:
                    operate = 1 + rand.nextInt(4);
                    studentAnswer = input.nextInt();
                    while (studentAnswer != correctAnswer) {
                        displayResponseForIncorrectAnswer();
                        studentAnswer = input.nextInt();
                        calculatePercentage();
                    }

                    displayResponseForCorrectResponse();
                    correctAnswersPercentage++;
                    calculatePercentage();
                    studentQuestion();
                    count++;
                    break;
            }
            }






        public static void displayResponseForIncorrectAnswer () {
            comment = 1 + rand.nextInt(4);
            switch (comment) {
                case 1:
                    System.out.println("No, please try again");
                    break;
                case 2:
                    System.out.println("Wrong. TRy once more");
                    break;
                case 3:
                    System.out.println("Dont give up");
                    break;
                default:
                    System.out.println("No. Keep trying");
                    break;
            }
        }

         public static void displayResponseForCorrectResponse () {
            comment = 1 + rand.nextInt(4);
            switch (comment) {
                case 1:
                    System.out.println("Excellent!");
                    break;
                case 2:
                    System.out.println("Nice Work!");
                    break;
                case 3:
                    System.out.println("Ver good!");
                    break;
                default:
                    System.out.println("Keep up the good work");
                    break;
            }

        }

        public static void calculatePercentage () {
        if (count == 10) {

            System.out.println("Your score is " + (correctAnswersPercentage / 10) * 100 + "%");
            if (correctAnswersPercentage < 7) {
                System.out.println("You should ask your teacher for help");

                level /= 10;
                minNumberForEachLevel /= 10;
                if (level < 10) {
                    level = 10;
                    minNumberForEachLevel = 1;
                    count = 0;
                    System.out.println("Another student should try");
                } else {
                    levelCount--;
                    System.out.println("You have to go back to level " + levelCount);
                    count = 0;
                }
            } else {
                levelCount++;
                System.out.println("Congratulations. Welcome to the level " + levelCount);
                while (count == 10) {
                    level *= 10;
                    minNumberForEachLevel *= 10;
                    count = 0;
                }
            }


            correctAnswersPercentage = 0;
            studentQuestion();

        }}
    }

