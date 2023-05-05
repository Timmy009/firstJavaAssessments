package chapterSeven;

import java.security.SecureRandom;

public class Exercise7_17 {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int firstDie;
        int secondDie;

        int count = 1;
        while (count <+ 36_000_000) {
            firstDie = 1 + randomNumber.nextInt(6);
            secondDie = 1 + randomNumber.nextInt(6);
            System.out.println("The sum of the dies, when the first die is " + firstDie + " and the second die is " + secondDie + "     "+ (firstDie + secondDie));
            count++;
        }
    }
}
