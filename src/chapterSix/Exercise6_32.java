package chapterSix;

import java.util.Scanner;

public class Exercise6_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X1: ");
        double x1  = input.nextDouble();
        System.out.println("Enter Y1: ");
        double y1  = input.nextDouble();
        System.out.println("Enter x2: ");
        double x2  = input.nextDouble();
        System.out.println("Enter y2: ");
        double y2  = input.nextDouble();
        System.out.println(distance(x1, x2, y1, y2));
    }
    public static double distance (double x1, double x2, double y1, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy + dx);
    }
}
