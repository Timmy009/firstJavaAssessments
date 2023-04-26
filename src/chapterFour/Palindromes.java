package chapterFour;

import java.util.Scanner;

public class Palindromes {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public String calculatePallindromes() {
        int originalValue = number;
        int reverseNumber = 0;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            number = number / 10;
        }
        if (originalValue == reverseNumber) {
            return  (originalValue + " is a palindrome");
        } else {
           return  (originalValue + " is not palindrome");
        }
    }

}

