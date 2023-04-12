package assignment;

public class TriangleC {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {

            int countTwo = 0;
            while (countTwo < 10) {
                if (countTwo < count) {
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
                countTwo++;
            }
                System.out.println();
                count++;

        }
    }
}