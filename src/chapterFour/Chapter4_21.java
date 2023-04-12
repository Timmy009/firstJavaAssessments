package chapterFour;

import java.util.Scanner;

public class Chapter4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number;
        int largestNumber = 0;
        int maxNumber = 10;
        while (counter < maxNumber) {
            System.out.println("Enter number");
            number = input.nextInt();
            if (number > largestNumber) {
                largestNumber = number;
            }

            counter++;
        }
        System.out.println("The largest number is " + largestNumber);
    }
}
