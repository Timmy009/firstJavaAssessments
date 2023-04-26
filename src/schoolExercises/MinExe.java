package schoolExercises;

public class MinExe {
    public static void main(String[] args) {

        int maximum = getMaximum(2,5,6);
        System.out.println("The maximum value is: " + maximum);
        int minimum = getMinimum(9,0,6);
        System.out.println("The minimum value is: " + minimum);
    }


    public static int getMaximum (int num1, int num2, int num3) {

      return Math.max(num1, Math.max(num2, num3));

    }

    public static int getMinimum (int num1, int num2, int num3) {

        return Math.min(num1, Math.min(num2, num3));

    }
}
