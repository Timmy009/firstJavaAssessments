package otherTask;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {

        int[] array = new int[10];
        System.out.println(Arrays.toString(array));
        array[2] = 20;
        System.out.println(toString(array));
        for (int number: array) {
            System.out.print(number + " ");
        }
    }
    private static String toString (int [] array) {
        String arrayRepresentation = "[";
        for (int index = 0; index < array.length; index++) {
            arrayRepresentation += array[index] + ", ";
            if (index == array.length-1) {
                arrayRepresentation += array[index];
            }
        }
        arrayRepresentation += "]";
        return arrayRepresentation;
    }


}
