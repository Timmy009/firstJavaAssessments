package chapterSix;

import java.util.Scanner;

public class Exercise6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        square(number);

    }
    public static void square(int number) {
    int count = 1;
        while (count <= number) {
        int countTwo = 1;
        while (countTwo <= number) {
            System.out.print("*");
            countTwo++;
        }
        System.out.println();
        count++;
    }
}}