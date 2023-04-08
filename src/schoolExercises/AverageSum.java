package schoolExercises;

import java.util.Scanner;

public class AverageSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int numberOfInput = 1;
        int average = 0;
        int maximumInput = 5;
        while (numberOfInput <= maximumInput) {
            System.out.println("Enter Score");
            int scores = input.nextInt();
            if (scores >= 0 && scores <= 100) {
                sum = sum + scores;
                average = sum / numberOfInput;
            }
            numberOfInput++;
        }

        System.out.println("The average is " + average);
        System.out.println("The sum is " + sum);
    }
}
