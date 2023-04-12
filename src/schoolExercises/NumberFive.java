package schoolExercises;

import java.util.Scanner;

public class NumberFive {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum = 0;
            int scores = 0;
            int maxNumberOfScore = 5;
            int count = 1;
            while (count <= maxNumberOfScore) {
                System.out.println("Enter Score");
                scores = input.nextInt();
                if (scores >= 0 && scores <= 100) {

                    if (count == 2 || count == 4) {
                        sum = sum + scores;
                    }
                    count++;
                }

            }


            System.out.println("The sum is " + sum);
        }

}
