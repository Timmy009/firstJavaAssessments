package ChapterEight;

import java.security.SecureRandom;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of random number to generate");
        int num = scanner.nextInt();
        for (int count = 0; count < num; count++){
        int number = 10 + random.nextInt(91);
        System.out.println(number);}
    }
}
