package chapterFour;

import java.util.Scanner;

public class Chapter4_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the triangle between 1 to 10");
        int baseOfTheTraingle = input.nextInt();
        int countTwo;
        int count = 1;
        while (baseOfTheTraingle < 1 || baseOfTheTraingle > 10) {
            System.out.println("Invalid Number. Enter a number between 1 to 10");
             baseOfTheTraingle = input.nextInt();
        }
        while (count <= baseOfTheTraingle) {
            countTwo = 1;
            while (countTwo <= count) {
                System.out.print("*");
                countTwo++;
            }
            System.out.println();
            count++;
        }
    }
}