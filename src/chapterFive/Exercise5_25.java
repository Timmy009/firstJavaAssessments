package chapterFive;

import java.util.Scanner;

    public class Exercise5_25 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an odd number between the range of 1 - 19");
            int count = 0;
            int row = input.nextInt();
            if (row <= 19 && row % 2 == 1) {
                while (count <= row) {
                    int countTwo = 0;
                    while (countTwo < row - count) {
                        System.out.print(" ");
                        countTwo = countTwo + 2;
                    }
                    int countThree = 0;
                    while (countThree <= count ) {
                        System.out.print("*");
                        countThree++;
                    }

                    System.out.println();
                    count = count + 2;
                }
                int countFour = 2;
                while (countFour <= row) {
                    int countFive = 0;
                    while (countFive <=  countFour) {
                        System.out.print(" ");
                        countFive= countFive + 2;
                    }
                    int countSix = 0;
                    while (countSix < row - countFour ) {
                        System.out.print("*");
                        countSix++;
                    }
                    System.out.println();

                    countFour = countFour + 2;
                }}
            else {System.out.println( row + " is outside the range");}

        }
    }



