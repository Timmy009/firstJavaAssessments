package schoolExercises;

import java.util.Scanner;

    public class NumberSix {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int sum = 0;
            int scores = 0;
            int maxNumber = 10;
            int count = 1;
            while (count <= maxNumber) {
                System.out.println("Enter Score");
                scores = input.nextInt();
                if (scores >= 0 && scores <= 100) {

                    if ( count % 2 == 0 && count < 10) {
                        sum = sum + scores;

                    }
                    count++;

            }


            System.out.println("The sum is " + sum);
        }
    }


}
