package otherTask;

import java.util.Arrays;

public class ArrayPopulate {
    public static void main(String[] args) {
        int [] numbers = new int[100];


        Arrays.fill(numbers, 5);
//        int count = 0;
//        while (count < numbers.length) {
//
//            numbers[count] = 5;
//            count++;
//        }

        System.out.println(Arrays.toString(numbers));
    }
}
