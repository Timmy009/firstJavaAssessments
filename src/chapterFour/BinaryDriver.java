package chapterFour;

import java.util.Scanner;

public class BinaryDriver {
    public static void main(String[] args) {
        BinaryNumber binaryNumber = new BinaryNumber();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number");
        String binary = input.nextLine();

       while (!binary.matches("[01]+")) {
           System.out.println("Enter a valid binary number please");
           binary = input.nextLine();}

       int decimalNumber = binaryNumber.calculateDecimal(binary);
            System.out.println("The decimal equivalent of the binary number of " + binary + " is " + decimalNumber);

    }
}
