package assignment;

public class PrintTriangleThree {
    public static void main(String[] args) {
        int count = 1;
        int max = 5;
        int maxTwo = 9;
        int countTwo;
        while (count <= max) {
            countTwo = 1;
            while (countTwo <= count) {
               System.out.print(" *");

                countTwo++;
            }
            System.out.println();
            count++;
        }
    }
}
