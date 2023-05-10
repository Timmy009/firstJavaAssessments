package chapterSeven;

import java.util.Arrays;

public class CodeRefacturingArray {
    private static final int ZERO = 0;

    public static void main(String[] args) {
        int [][] arr = new int [5] [];
        arr [0] = new int[5];
        arr [1] = new int[3];
        arr [2] = new int[10];
        arr [3] = new int[]{400, 500};
        arr[4] = new int [5];


        int [] firstRow = arr[0];
        int lenghtofFirstRow = firstRow.length;
        for (int index = ZERO; index < lenghtofFirstRow; index++) {
            populateFirstRow(firstRow, index);

        }
        int [] secondRow = arr[1];
        int lengthOfSecondRow = secondRow.length;

        for (int index = ZERO; index < lengthOfSecondRow; index++) {
            populateSecondRow(secondRow, index);

        }

        int [] thirdRow = arr[2];
        int lenghtofThirdRow = thirdRow.length;

        for (int index = ZERO; index < lenghtofThirdRow; index++) {
            populateThirdRow(thirdRow, index);

        }


        int [] fifthRow = arr[4];
        int lengthOfFifthRow = fifthRow.length;
        for (int index = ZERO; index < lengthOfFifthRow; index++) {
            populateFifthRow(fifthRow, index);


        }
        System.out.println(Arrays.deepToString(arr));
    }
    private static void populateFirstRow (int [] firstRow, int index) {
        firstRow[index] = index;
    }
    private static void populateSecondRow (int [] secondRow, int index) {
        secondRow[index] = index;
    }
    private static void populateThirdRow (int [] thirdRow, int index) {
        thirdRow[index] = index;
    }
    private static void populateFifthRow (int [] thirdRow, int index) {
        thirdRow[index] = (index + 1) * 100;
    }
}
