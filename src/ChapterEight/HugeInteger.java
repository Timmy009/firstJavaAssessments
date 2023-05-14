package ChapterEight;

import java.util.Arrays;

public class HugeInteger {
    private int [] integers1;

    public HugeInteger() {
        integers1 = new int[40];
    }

    @Override
    public String toString() {
        return "HugeInteger{" +
                "integers1=" + Arrays.toString(integers1) +
                '}';
    }

    public void parse (String input) {
        char letter;
        int intValue;
        for (int count = 0; count < input.length(); count++) {
            letter = input.charAt(count);
            intValue = Character.getNumericValue(letter);
            integers1[count] =intValue;
        }


    }
}
