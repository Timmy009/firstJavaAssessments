package chapterFive;

import java.util.Scanner;

    public class Exercise5_16 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number = 0;
            int maxNumber = 5;
            int count = 1;
            while (count <= maxNumber) {
                System.out.println("Enter a number between 1 and 30");
                number = input.nextInt();
                if (number >= 1 && number <= 30) {
                    System.out.print(count + ":" + "\t");
                    int countTwo = 1;
                    while (countTwo <= number) {
                        System.out.print("*");
                        countTwo++;
                    }
                } else {System.out.println("Make sure the number is between 1 and 30");
                    continue;
                }
                System.out.println();
                count++;
            }
        }
}
