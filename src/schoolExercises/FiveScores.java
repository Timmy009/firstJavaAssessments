package schoolExercises;

import java.util.Scanner;

public class FiveScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfInput = 1;
        int sum = 0;
        int maxInput = 5;
        while (numberOfInput <= maxInput) {
            System.out.println("Enter score");
            sum = sum + input.nextInt();
            numberOfInput++;
        }
        System.out.println("The sum is " + sum);
    }
}
