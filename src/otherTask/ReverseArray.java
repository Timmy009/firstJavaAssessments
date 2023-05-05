package otherTask;


import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arrays = new int[5];
        Scanner scanner = new Scanner(System.in);

        int number;
       for (int count = arrays.length -1; count >= 0; count--) {
           System.out.println("Enter number: ");
           number = scanner.nextInt();
           arrays[count] = number;
       }

        System.out.println(Arrays.toString(arrays));



    }
}