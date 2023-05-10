package otherTask;

import java.util.Arrays;

public class PassByReference {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
       modify(numbers);
        System.out.println(Arrays.toString(numbers));;
        String name = "tem";
        now(name);
        System.out.println(name);
    }
    public static void modify(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void now (String name) {
        name = "timi";
        System.out.println(name);
    }

}
