package assignment;

public class TriangleD {
            public static void main(String[] args) {
                int count = 10;
                while (count  >= 1) {

                    int countTwo = 0;
                    while (countTwo <= 10) {
                        if (countTwo <= count) {
                            System.out.print("   ");
                        }
                        else {
                            System.out.print(" * ");
                        }
                        countTwo++;
                    }
                    System.out.println();
                    count--;

                }
            }
}