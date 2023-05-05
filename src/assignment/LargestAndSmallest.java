package assignment;

import java.util.Objects;
import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        String toContinue;
        do {
            System.out.println("Enter number");
            number = input.nextInt();
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
            System.out.println("Press enter to continue");
            input.next();
            toContinue = input.nextLine();
            if (Objects.equals(toContinue, "quit")) {
                break;
            }
        }
        while (true);
      System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
    }
}
