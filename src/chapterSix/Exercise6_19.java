package chapterSix;

import java.util.Scanner;

public class Exercise6_19 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number");
            int number = input.nextInt();
            System.out.println("Enter the filled");
            char filled = input.next().charAt(0);
            square(number, filled);

        }
        public static void square(int number, char filled) {
            int count = 1;
            while (count <= number) {
                int countTwo = 1;
                while (countTwo <= number) {
                    System.out.print(filled);
                    countTwo++;
                }
                System.out.println();
                count++;
            }
        }}
