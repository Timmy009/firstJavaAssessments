package assignment;

public class PrintTriangleFive {
    public static void main(String[] args) {
                int count = 1;
                while (count <= 5) {
                    int countTwo = 1;
                    while (countTwo <= 5 - count) {
                        System.out.print(" ");
                        countTwo++;
                    }
                    int countThree = 1;
                    while (countThree <= count * 2 - 1) {
                        System.out.print(count);
                        countThree++;
                    }
                    System.out.println();
                    count++;
                }
            }
        }

