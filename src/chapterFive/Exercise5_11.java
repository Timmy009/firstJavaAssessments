package chapterFive;

import java.util.Scanner;

    public class Exercise5_11 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter how many numbers you want to input");
            int numberOfValues = input.nextInt();
            int minValue = Integer.MAX_VALUE;
            int maxValue = Integer.MIN_VALUE;
            int count = 1;
            while (count <= numberOfValues) {
                System.out.println("Enter Number");
                int number = input.nextInt();
                if (number < minValue) {minValue = number;}
                if (number > maxValue) {maxValue = number;}

                count++;
            }

            System.out.println("The minimum value of the " + numberOfValues + " numbers is " + minValue);
            System.out.println("The maximum value of the " + numberOfValues + " numbers is " + maxValue);
            System.out.println("The sum of the two extremes is " + (maxValue + minValue));

        }
    }
