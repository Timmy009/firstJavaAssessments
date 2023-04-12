package chapterFour;

import java.util.Scanner;

public class ChapterDemo {
    // Function to display bar chart with asterisks
    public static void displayBarChart(int num) {
        System.out.print(num + ": ");
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read five numbers
        int num1 = getValidNumber(input, 1);
        int num2 = getValidNumber(input, 2);
        int num3 = getValidNumber(input, 3);
        int num4 = getValidNumber(input, 4);
        int num5 = getValidNumber(input, 5);

        input.close();

        // Display bar charts
        System.out.println("\nBar Charts:");
        displayBarChart(num1);
        displayBarChart(num2);
        displayBarChart(num3);
        displayBarChart(num4);
        displayBarChart(num5);
    }

    // Helper function to get a valid number from user
    public static int getValidNumber(Scanner input, int count) {
        int num = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            System.out.print("Enter number " + count + " (between 1 and 30): ");
            if (input.hasNextInt()) {
                num = input.nextInt();
                if (num >= 1 && num <= 30) {
                    isValidInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 30.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 30.");
                input.next(); // Clear input buffer
            }
        }
        return num;
    }
}



