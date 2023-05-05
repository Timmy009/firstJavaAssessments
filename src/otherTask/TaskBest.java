package otherTask;

import java.util.Arrays;
import java.util.Scanner;

public class TaskBest {
    public static void main(String[] args) {
        int[] arrays = new int[5];
        Scanner input = new Scanner(System.in);
        int number;
        int total = 0;
        for (int count = 0; count < arrays.length; count++) {
            System.out.println("Enter number: ");
            number = input.nextInt();
            arrays[count] = number;
            total += arrays[count];
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println("The total is " + total);
    }

}