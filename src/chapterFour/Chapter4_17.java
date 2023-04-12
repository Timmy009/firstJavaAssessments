package chapterFour;

import java.util.Scanner;


    public class Chapter4_17 {
        /*
        PSEUDO CODE
    Create a scanner object to collect input from the user
    Prompt the driver to enter the miles driven and the gallons used for each tankful
    collect and store the miles driven in a variable
    collect and store the gallons used in a variable
    use the while loop to continusly collect the input from the user
    calculate the miles per gallon for each trip
         */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int counter =1;

            int gallons;
            int milesDriven;
            int tripCounter = 1;
            int milesPerGallon;
            int totalAveragePerGallon = 0;
            System.out.println("Enter the miles driven for this trip");
            milesDriven = input.nextInt();
            System.out.println("Enter the gallons for this trip");
            gallons = input.nextInt();
            milesPerGallon = milesDriven / gallons;
            System.out.println("The miles per gallon is " + milesPerGallon);
            totalAveragePerGallon += milesPerGallon;
            while (tripCounter == 1)
            {   System.out.println();
                System.out.println("Enter 1 to enter gallons and the miles driven or press any other key to cancel");
                tripCounter = input.nextInt();
                if (tripCounter == 1) {
                    System.out.println("Enter the miles driven for this trip");
                    milesDriven = input.nextInt();
                    System.out.println("Enter the gallons for this trip");
                    gallons = input.nextInt();
                    milesPerGallon = milesDriven / gallons;
                    System.out.println("The miles per gallon is " + milesPerGallon);
                    totalAveragePerGallon += milesPerGallon;
                    counter++;
                }
            }
            String tripHolder;
            if (counter > 1)   tripHolder = "trips";
            else tripHolder = "trip";
            System.out.println("The total average per gallon for the " + counter + " " + tripHolder + " is " + totalAveragePerGallon);
        }
    }