package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise6_35 {
    public static void main(String[] args) {
        studentQuestion();

    }
    public static void studentQuestion () {
        SecureRandom rand = new SecureRandom();
        int num1 = 1 + rand.nextInt(9);
        int num2 = 1 + rand.nextInt(9);
        int correctAnswer = num1 * num2;
        Scanner input = new Scanner(System.in);
        System.out.println("How much is " + num1 + " * " + num2);
        int studentAnswer = input.nextInt();
        while (studentAnswer != correctAnswer) {
            System.out.println("No, please try again");
            studentAnswer = input.nextInt();
        }
        System.out.println("Very good");
        studentQuestion();

    }

}
