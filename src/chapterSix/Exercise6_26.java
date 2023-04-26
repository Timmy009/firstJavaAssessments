package chapterSix;

import java.util.Scanner;

public class Exercise6_26 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        String number = scanner.nextLine();
        if (number.length() != 4) {System.out.println("Invalid number. Number must be equals to four");}
          else {  System.out.println(sum(number));}
    }

    public static int sum(String number) {
        int count = 1;
        int sum = 0;
        int digit;
        int numberDigit = Integer.parseInt(number);
        while (count <=4) {
            digit = numberDigit % 10;
            sum = sum + digit;
            count++;
            numberDigit = numberDigit / 10;
        }
        return sum;
    }
}
