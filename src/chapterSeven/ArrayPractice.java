package chapterSeven;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int numbers [], ages;
        numbers = new int [4];
        ages =  3;

        int [] number, ages1;
        number = new int[4];
        ages1 = new int [4];

        int [] figures = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(figures));

        String [] names = new String[]{
                "Esther", "Kulitech", "Vicky", "Retnar", "Onye", "Joy", "Sultan", "Bright"
        };
        System.out.println(names[0]);
        System.out.println(names[5]);
        System.out.println(names.length);
    }
}
