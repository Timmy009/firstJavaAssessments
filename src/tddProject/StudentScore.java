package tddProject;

import java.util.Scanner;

    public class StudentScore {

        public static void myMethod() {
            System.out.println("My name is timi");
        }
        public double calculateAverage() {
            int count = 1;
            int total = 0;
            while (count <= 10) {
                String ve = "st";
                if (count == 2) {ve = "nd";}
                if (count == 3) {ve = "rd";}
                if (count >= 4) {ve = "th";}
                System.out.println("Enter  the " + count +  ve + " student score");
                Scanner input = new Scanner(System.in);
                int score = input.nextInt();
                total =  total + score;
                count++;
            }
            double avearge = total / 10;

            return avearge;
        }
    }


