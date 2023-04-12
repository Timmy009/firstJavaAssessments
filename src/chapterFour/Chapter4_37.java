package chapterFour;

import java.util.Scanner;

public class Chapter4_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X1 coordinate");
        double X1 = input.nextDouble();

        System.out.println("Enter X2 coordinate");
        double X2 = input.nextDouble();

        System.out.println("Enter y1 coordinate");
        double y1 = input.nextDouble();

        System.out.println("Enter y2 coordinate");
        double y2 = input.nextDouble();

        if (X1 == X2) {
            System.out.println("The points are located on a line perpendicular to the y-axis");
        } else if (y1 == y2) { System.out.println( "The points are located on a line perpendicular to the X-axis");

        }
        else {
            System.out.println("The points are not located on a line perpendicular to an axis");
        }
    }
}
