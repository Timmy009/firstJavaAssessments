package chapterFour;

import java.util.Scanner;

public class Chapter4_38_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();

        double e = 1;
        while (number < 0) {
            System.out.println("This is an invalid number. Enter a non negative integer");
            number = input.nextInt();
        }
        int factorial = 1;
        int count = 1;
        while (count <= number) {
            factorial = factorial * count;
            e = e + 1.0 / factorial;
            count++;
        }

        System.out.println("The e of " + number + " is " + e);
    }
}
