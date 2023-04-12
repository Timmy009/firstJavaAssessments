package assignment;

public class TriangleB {
    public static void main(String[] args) {

        int count = 10;
        while (count > 1) {
            int countTwo = 1;
            while (countTwo < count) {
                System.out.print(" * ");
                countTwo++;
            }
            count--;
            System.out.println();

        }
    }
}