package otherTask;

public class Task3 {
    public static void main(String[] args) {
        int [] number = {10, 0, 5, 3, 2, 1, 6, -1, -9, -6};
        System.out.println("The maximum number is " + arrayMax(number));
        System.out.println("The minimum number is " + arrayMin(number));

    }
    public static int arrayMax (int [] number) {
        int max = number[0];
        for (int count = 0; count < number.length; count++) {
            if (number[count] > max) {
                max = number[count];
            }
        }
        return max;
    }
    public static int arrayMin (int [] number) {
        int min = number[0];
        for (int count = 0; count < number.length; count++) {
            if (number[count] < min) {
                min = number[count];
            }
        }
        return min;
    }
}
