package assignment;

import java.util.Scanner;

public class NumberTypeCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeros = 0;
        boolean cont;

        do {
            System.out.println("Enter number");
            int number = input.nextInt();
            if (number > 0)  {
                positiveNumber++;
            } else if (number < 0 ) {
                negativeNumber++;
            } else {
                zeros++;
            }
            System.out.println("Do you want to continue");
            cont = input.nextBoolean();
        }
        while (cont == true);

        System.out.println("The number of positive number entered is " + positiveNumber);
        System.out.println("The number of negative number entered is " + negativeNumber);
        System.out.println("The number of zero entered is " + zeros);
    }
}
