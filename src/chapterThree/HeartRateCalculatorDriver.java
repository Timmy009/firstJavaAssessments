package chapterThree;

import java.util.Scanner;

public class HeartRateCalculatorDriver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = input.nextLine();
        System.out.println("Enter last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter date of birth");
        String dateOfBirth = input.nextLine();
        HeartRateCalculator heartRateCalculator = new HeartRateCalculator(firstName, lastName, dateOfBirth);

        System.out.println("Your first name is: " + heartRateCalculator.getFirstName());
        System.out.println("Your age is: "  + heartRateCalculator.getAge());
        System.out.println("Your last name is: " + heartRateCalculator.getLastName());
        System.out.println("Your targetted heart rate is: " + heartRateCalculator.calculateTargetHeartRate());
        System.out.println("Your date of birth is: " + heartRateCalculator.getDateOfBirth());
        System.out.println("Your maximum heart rate is: " + heartRateCalculator.calculateMaximumHeartRate());
        System.out.println("The lower and upper target heart rate is: " + heartRateCalculator.calculateTargetHeartRate());

        //after setting the value with set methods

        System.out.println();
        heartRateCalculator.setFirstName(firstName);
        heartRateCalculator.setDateOfBirth(dateOfBirth);
        heartRateCalculator.setLastName(lastName);

        System.out.println("Your first name is: " + heartRateCalculator.getFirstName());
        System.out.println("Your age is: "  + heartRateCalculator.getAge());
        System.out.println("Your last name is: " + heartRateCalculator.getLastName());
        System.out.println("Your targetted heart rate is: " + heartRateCalculator.calculateTargetHeartRate());
        System.out.println("Your date of birth is: " + heartRateCalculator.getDateOfBirth());
        System.out.println("Your maximum heart rate is: " + heartRateCalculator.calculateMaximumHeartRate());
        System.out.println("The lower and upper target heart rate is: " + heartRateCalculator.calculateTargetHeartRate());

    }
}
