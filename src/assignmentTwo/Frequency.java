package assignmentTwo;

import java.util.Scanner;

public class Frequency {
    public boolean frequentNumber(int[] arrays, int number) {
        boolean numberOccur = false;
        for (int count = 0; count < arrays.length; count++) {
            if (arrays[count] == number) {
               numberOccur = true;

            }


        }
        return numberOccur;
    }
}
