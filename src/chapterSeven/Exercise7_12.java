package chapterSeven;

import java.util.Scanner;

public class Exercise7_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int element;
        int [] number =  {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int count = 0;
        while (count < number.length) {
            System.out.println("Enter number scores to be added to the array");
            element = input.nextInt();
            if (element % 10 ==0) {
            number[count] = element;
                count++;
            }
        }
        for (int countTwo = 0; countTwo < number.length; countTwo++) {
            for (int countThree = 1; countThree< number.length; countThree++) {
                if (number[countTwo] == number[countThree]) {
                    System.out.println("There is a duplicate value");
                    break;
                }
            }
        }
    }
}
