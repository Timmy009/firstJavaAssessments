package chapterTwoAndFirstAss;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight in pounds");
        int weightInPounds = scanner.nextInt();

        System.out.println("Enter the height in inches");
        int heightInInches = scanner.nextInt();
        double BMI = (double) (weightInPounds * 703) / (heightInInches * heightInInches);
        System.out.println("The BMI is " + BMI);
    }
}
