package otherTask;

import java.util.ArrayList;

public class Jomath {
    public static void main(String[] args) {

        int [] y = {12, 34, 56, 6};
        System.out.println(arrS(y));
    }

    public static  ArrayList<Integer>  arrS (int [] arr) {
        StringBuilder apl = new StringBuilder();
        for (int count = 0; count < arr.length; count++) {
            apl.append(arr[count]);
        }
        System.out.println(apl);
        ArrayList<Integer> ars = new ArrayList<>();
        for (int count = 0; count < apl.length(); count++) {
            ars.add(count, Integer.parseInt(String.valueOf(apl.charAt(count))) );

        }
        return ars;
    }
}
