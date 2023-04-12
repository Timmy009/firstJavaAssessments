package schoolExercises;

import java.util.Scanner;


    public class SentinelValidScore {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int sum = 0;
            int maxInput = 5;
            int scores = 0;
            int numberOfInput = 1;
            while (numberOfInput <= maxInput) {
                System.out.println("Enter Score");
                scores = input.nextInt();
                if (scores >= 0 && scores <= 100) {
                    sum = sum + scores;
                    numberOfInput++;
                }

            }


            System.out.println("The sum is " + sum);
        }
    }
