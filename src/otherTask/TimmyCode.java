package otherTask;

import java.util.ArrayList;
import java.util.Arrays;

public class TimmyCode {

    public static void main(String[] args) {
        TimmyCode timmyCode = new TimmyCode();

        int [] arrays = {8, 5, 5, 8, 3, 8, 8};
        System.out.println(timmyCode.duplicate(arrays));
    }

    public int duplicate (int [] arrays) {
     int countThree = 0;
        for (int count = 0; count < arrays.length; count++) {
            for (int countTwo  = count + 1; countTwo < arrays.length; countTwo++) {

                if (arrays[count]!= arrays[countTwo]) {
                countThree++;}
            }
            }
        return countThree;
    }


}
