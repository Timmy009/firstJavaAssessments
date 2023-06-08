package assignment;

import java.util.ArrayList;

public class AwalP {
    public static void main(String[] args) {
        int[][] arry1 = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        int [][] aa = {{11, 4,6},{23, 7,0}};
        System.out.println(suu(aa));

    }
    private static ArrayList<Integer> suu (int [] [] arry1) {
        ArrayList <Integer> ls = new ArrayList<>();
        for (int count = 0; count < arry1.length; count++) {
            for (int countFour = count + 1; countFour < arry1.length; countFour++) {
                for (int countTwo = 0; countTwo < arry1[count].length; countTwo++) {
                    for (int countThree = countTwo + 1; countThree < arry1[countFour].length; countThree++) {
                        if (arry1[count][countTwo] == arry1[countFour][countThree]) {
                            ls.add(arry1[count][countTwo]);}}}}}
        for (int count = 0; count < arry1.length; count++) {
            for (int countTwo = count +1; countTwo < arry1[count].length; countTwo++) {
                for (int countFour = count+1; countFour < arry1.length; countFour++) {
                    for (int countThree = countFour + 1; countThree < arry1[countFour].length; countThree++) {
                        if (arry1[count][countTwo] == arry1[countFour][countThree]) {
                            ls.add(arry1[count][countTwo]);

                        }

                    }
                }
            }
        }
        return ls;
    }
    }


