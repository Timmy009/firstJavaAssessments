package schoolExercises;

import java.util.Scanner;

    public class ValidExercise {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum = 0;
            int numberOfInput = 1;
            int maxNumber = 5;
            int scores;

            while (numberOfInput <= maxNumber) {
                System.out.println("Enter Score");
                scores = input.nextInt();
                if (scores >= 0 && scores <= 100) {
                    sum = sum + scores;
                }
                numberOfInput++;
            }
            System.out.println("The sum is " + sum);
        }
    }


