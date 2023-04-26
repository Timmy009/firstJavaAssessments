package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise6_30 {
    public static void main(String[] args) {
     guess();
    }

    public static void guess() {
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 1000");
        int guessNumber = scanner.nextInt();
        int rand = 1 + random.nextInt(10);
        int count = 1;
        while (guessNumber != rand) {
            if (guessNumber > rand) {
                System.out.println("You guessed too high");
            }
            else {
                System.out.println("You gueesed too low");
            }
            guessNumber = scanner.nextInt();
            count++;
        }
            if (count < 10) {
                System.out.println("You got lucky");
            } else if (count == 10) {
                System.out.println("You know the secret");
            }
            else System.out.println("You should be able to do better. Why should it be more than 10 guesses");
        System.out.println("You guessed right. Welldone");

    }
}
