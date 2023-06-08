package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Sudoku {
   private static int [][] sudokuDigit =new  int [9][9] ;
   private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(checkRow()));

    }

    private static int[][] checkRow () {
        for (int count = 0; count < 9; count++) {
            for (int countTwo = 0; countTwo < 9; countTwo++) {
                System.out.println("Enter number to play");
                sudokuDigit [count] [countTwo] = scanner.nextInt();
            }

        }
        return sudokuDigit;
    }


}
