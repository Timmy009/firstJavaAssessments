package chapterTwoAndFirstAss;

import java.util.Scanner;

public class Exercise2_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the world population");
       long worldPopulation = input.nextInt();
        System.out.println("Enter the percentage growth rate of the world population");
        int growthRate = input.nextInt();
        long firstYear = ((growthRate / 100) * worldPopulation) + worldPopulation;
        long secondYear = ((growthRate / 100) * firstYear) + firstYear;
        long thirdYear = ((growthRate / 100) * secondYear) + secondYear;
        long fourthYear = ((growthRate / 100) * thirdYear) + thirdYear;
        long fifthYear = ((growthRate / 100) * fourthYear) + fourthYear;

        System.out.println("The estimated population after one year is " + firstYear);
        System.out.println("The estimated population after two years is " + secondYear);
        System.out.println("The estimated population after three years is " + thirdYear);
        System.out.println("The estimated population after four years is " + fourthYear);
        System.out.println("The estimated population after five years is " + fifthYear);

    }
}
