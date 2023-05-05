package chapterSeven;

import java.util.Arrays;

public class Exercise7_1 {
    public static void main(String[] args) {
        int[] r = new int[100];
        int[] b = new int[100];



        System.out.println(r[9]);

        for (int count = 1; count < r.length; count++) {
            r[count] = count;
        }
        int max = 0;
        for (int count = 1; count < r.length; count++) {
            if (r[count] > max) {max = r[count];}


        }
        int countTwo = 0;
        int count = 99;
        while (count > 0)
        {
            b[countTwo] = r[count];
            count--;
            countTwo++;
        }

        System.out.println("max " + Arrays.toString(b));
        int total = 1;
        for (int countN = 2; countN <= 9; countN++) {
            System.out.println(Arrays.toString(r));
            total *= r[countN];

        }
        System.out.println("total " + total);
        System.out.println("max "+ max);
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(b));
        Arrays.fill(r, -1);
        System.out.println(r[9]);



    }



}