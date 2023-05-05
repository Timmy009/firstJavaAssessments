package otherTask;

import java.util.Arrays;
import java.util.Scanner;

public class JohnTask {
    public static void main(String[] args) {
        int [] arrays = new int[10];
        Scanner input = new Scanner(System.in);
        int number;
        for (int count = 0; count < arrays.length; count++) {
            System.out.println("Enter number: ");
            number = input.nextInt();
            if (number  % 2 != 0) {
                System.out.println("This is an even number");
                arrays[count] = number;
            }
            if (number  % 2 == 0) {
                System.out.println("This is an odd number");
                arrays[count] = number;
            }

        }
        System.out.println(Arrays.toString(arrays));
    }
}
