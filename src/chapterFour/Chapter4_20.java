package chapterFour;

import java.util.Scanner;

public class Chapter4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCitizen = 1;
        String name;
        double earnings;
        double tax;
        int maxNumberOfCitizen = 3;
        while (numberOfCitizen <= maxNumberOfCitizen) {
            System.out.print("Enter name: ");
            name = input.nextLine();
            System.out.print("Enter earnings: ");
            earnings = input.nextDouble();
            if (earnings <= 30000) {
                tax = 0.15 * earnings;
            }
            else {
               tax = 0.15 * 30000 + (0.20 * (earnings - 30000));
            }
            System.out.println("The total tax for " + name + " is $" + tax);

            numberOfCitizen++;
        }
    }
}
