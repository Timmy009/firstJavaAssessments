package chapterSeven;

import java.util.Scanner;

public class AverageArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int [] array = new int[100];

        String post = "";
        int count = 1;
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (count > 10 && count < 15) {
                post="th";
            }
            if (count % 10 == 2) {post = "nd";}
            else if (count % 10 ==1) {post = "st";}
            else if (count % 10 == 3) {post = "rd";}
            else if (count % 10 == 3) {post = "rd";}


            System.out.println("Enter " + count + post+ " number: ");
            array[arrayIndex] = scanner.nextInt();
            total += array[arrayIndex];
            count++;
        }

        double average = (double) total / array.length;
        System.out.println("The average is " + average);
    }
}
