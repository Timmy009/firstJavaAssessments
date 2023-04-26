package chapterFour;

import java.util.Scanner;

public class Chapter4_38_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of times");
        int number = input.nextInt();
        System.out.println("Enter the value of X");
        int x = input.nextInt();
        double e = 1;
        while (number < 0 || x < 0) {
            System.out.println("This is an invalid number. Enter a non negative integer");
            number = input.nextInt();
            System.out.println("Enter the value of X");
             x = input.nextInt();
        }
        int factorial = 1;
        int count = 1;
        while (count <= number) {
            factorial = factorial * count;
            e = e + Math.pow(x, count) / factorial;
            count++;
        }

        System.out.println("The e of " + number + " is " + e);
    }
}
