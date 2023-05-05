package otherTask;

public class ExceptionArray {

    public static void main(String[] args) {
        try {
            int [] numbers = {1, 2, 3, 5};
            System.out.println(numbers[0]);
            System.out.println(numbers[10]);
            System.out.println(numbers[2]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);

        }
    }
}
