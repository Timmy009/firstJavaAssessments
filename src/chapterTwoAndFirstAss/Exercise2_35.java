package chapterTwoAndFirstAss;

import java.util.Scanner;

public class Exercise2_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the estimated number of stones");
       double numberOfStones = input.nextDouble();
        System.out.println("Enter the average weight of each stone");
        double averageWeight = input.nextDouble();
        System.out.println("Enter the number of years taken to build the pyramid (assuming a year comprises 365 days");
        double numberOfYears = input.nextDouble();



        double years = numberOfYears * 365;
        double weightBuiltEachYear = numberOfStones * averageWeight / years;
        double weightBuiltEachHour = numberOfStones * averageWeight / (years * 24);

        double weightBuiltEachMinute = numberOfStones * averageWeight / ( years * 60);

        System.out.println("The weight built each year is " + weightBuiltEachYear);

        System.out.println("The weight built each hour is " + weightBuiltEachHour);

        System.out.println("The weight built each hour is " + weightBuiltEachMinute);


    }
}
