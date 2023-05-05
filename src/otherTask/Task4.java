package otherTask;

public class Task4 {
    public static void main(String[] args) {
        int [] number = {-1, 5, 3, 2, 1, 6};

        System.out.println(arrayMaxAndMin(number));
    }



    public static String arrayMaxAndMin (int [] number) {
        int max = number[0];
        int min = number[0];
        for (int count = 0; count < number.length; count++) {
            if (number[count] > max) {
                max = number[count];
            }
            if (number[count] < min) {
                min = number[count];
            }
        }
        return "The minimum and the maximum values are " + min + " and " + max + " respectively";
    }
}
