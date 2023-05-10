package otherTask;

import java.util.Arrays;

public class ArrayMode {
    public static void main(String[] args) {
        int [] arrays = new int[] {1, 2, 2, 3, 2, 3, 2, 2, 3, 0};
        int [] mode = new int[4];
        for (int count = 1; count < arrays.length; count++) {
             ++mode[arrays[count]];
        }
        System.out.println(Arrays.toString(mode));
    }
}
