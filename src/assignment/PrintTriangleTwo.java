package assignment;

public class PrintTriangleTwo {
    public static void main(String[] args) {
        int count = 1;
        int max = 5;
        int countTwo = 1;
        while (count <= 5) {
            countTwo = 1;
            while (countTwo <= max) {
                if (countTwo <= 5 - count )
                {
                    System.out.print("  ");

                } else {System.out.print(" *");}
                countTwo++;
            }
            System.out.println();
            count++;
        }
    }
}
