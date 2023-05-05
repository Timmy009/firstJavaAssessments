package otherTask;

import java.util.Arrays;

public class SemiMain {
    public static void main(String[] args) {
        Semi [] semiNative = {
                new Semi("Timmy", 12),
                new Semi("Sultan", 15),
            new Semi("Mariam", 16),
            new Semi("Esther", 13)
        };

        System.out.println(Arrays.toString(semiNative));

        String [] myStringArray = new String [3];
        myStringArray [0] =  "Timmy";
        myStringArray [1] =  "Esther";
        myStringArray [2] =  "Mariam";

        System.out.println(Arrays.toString(myStringArray));

    }
}
