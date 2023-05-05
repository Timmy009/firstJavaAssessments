package otherTask;

import java.util.Arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
           number = 5;
            System.out.println(number);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
