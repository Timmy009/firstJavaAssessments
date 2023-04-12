package chapterFour;

import java.util.Scanner;

public class Chapter4_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digits integers");
        int number = input.nextInt();
        while (number < 10000 || number > 99999) {
            System.out.println("The number is invalud. Enter a five digits integers");
            number = input.nextInt();
        }
        int originalValue = number;
        int reverseNumber = 0;
        int digit = 0;
        while (number > 0) {
         digit = number % 10;
         reverseNumber = (reverseNumber * 10) + digit;
         number = number / 10;
        }
        if (originalValue == reverseNumber) {
            System.out.println( originalValue + " is a polindrome");
        }
        else { System.out.println( originalValue + " is a not polindrome");}
    }
}
