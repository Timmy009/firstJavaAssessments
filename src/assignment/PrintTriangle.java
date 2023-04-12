package assignment;

public class PrintTriangle {
    public static void main(String[] args) {
        int number = 1;
        int max = 5;
        int numberTwo;

        while (number <= max) {
            numberTwo = 1;
            while (numberTwo <= number) {
                System.out.print(" * ");
                numberTwo++;
            }
            System.out.println();


            number++;
        }
    }
}
