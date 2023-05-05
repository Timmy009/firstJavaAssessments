package otherTask;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        for (int index = 0; index < myArray.length; index++) {
            myArray [index] += index + 1;
        }
        System.out.println(Arrays.toString(myArray));
    }

}