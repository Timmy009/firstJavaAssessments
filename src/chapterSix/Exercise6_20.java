package chapterSix;

import java.util.Scanner;

public class Exercise6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year to check");
    int year = input.nextInt();
        if (leapYear(year)) System.out.println("This is a leap year");
        if (!leapYear(year)) System.out.println("This is not a leap year");

    }
    public static boolean leapYear (int year) {
        if (year % 4 == 0) return true;
        else return false;
    }
}
