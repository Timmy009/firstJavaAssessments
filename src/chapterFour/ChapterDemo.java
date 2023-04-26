package chapterFour;

import java.util.Scanner;

public class ChapterDemo {
    public static boolean isLeapYear(int year) {
        /*
         * Check if a given year is a leap year or not.
         */
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the year from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Call the isLeapYear method to check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
