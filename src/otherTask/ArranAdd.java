package otherTask;

import java.util.Arrays;

public class ArranAdd {
    public static void main(String[] args) {
        int [] li = {2, 4, 3};
        int [] l2 = {5, 6, 4};

        System.out.println(Arrays.toString(arrayAddition(li, l2)));
    }
    public static int[] arrayAddition(int [] arrayInput, int [] arrayInputTwo) {
        String reverseArray ="";
        String reverseArrayTwo = ""; 
        for (int count = arrayInput.length-1; count >= 0; count--) {
            reverseArray += arrayInput[count];
        }
        for (int count = arrayInputTwo.length-1; count >= 0; count--) {
            reverseArrayTwo += arrayInputTwo[count];
        }
        int reverseArrayNum = Integer.parseInt(reverseArray);
        int reverseArrayNUmTwo = Integer.parseInt(reverseArrayTwo);
        int addition = reverseArrayNum + reverseArrayNUmTwo;
       String stringAddition = Integer.toString(addition);
        int [] reverseAddition = new int[stringAddition.length()];
        int countREv = 0;
       for (int count = stringAddition.length(); count > 0; count--) {
           reverseAddition[countREv] += Integer.parseInt(String.valueOf(stringAddition.charAt(count-1)));
           countREv++;
       }
        return reverseAddition;
    }
}
