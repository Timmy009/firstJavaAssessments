package chapterSeven;

import java.util.Arrays;

public class Exercise7_2 {
    public static void main(String[] args) {

        int[] b = {2, 3, 4, 6, 8};
        int[] a = new int[5];
        System.arraycopy(b, 0, a, 0, b.length);

        System.out.println(Arrays.toString(a));

    }
}