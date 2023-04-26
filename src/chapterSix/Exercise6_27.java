package chapterSix;

import java.util.Scanner;

public class Exercise6_27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        System.out.println(gcf(numberOne, numberTwo));
    }

    public static int gcf(int numberOne, int numberTwo) {
        if (numberOne >= numberTwo) {
            int count = numberOne;
            while (count >= 1) {
                if (numberOne % count ==0 && numberTwo % count == 0)
                {return count;
                }
                count--;
            }
        }
        if (numberOne < numberTwo) {
            int count = numberTwo;
            while (count >= 1) {
                if (numberOne % count ==0 && numberTwo % count == 0)
                {return count;}
                count--;

            }
        }

        return 0;
    }
}
