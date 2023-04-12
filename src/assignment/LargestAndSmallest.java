package assignment;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        boolean toContinue = false;
        do {
            System.out.println("Enter number");
            number = input.nextInt();
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
            System.out.println("Do you want to continue");
            toContinue = input.nextBoolean();
        }
        while (toContinue);
        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
    }
}
