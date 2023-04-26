package chapterFive;

import java.util.Scanner;

    public class Exercise5_25 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an odd number between the range of 1 - 19");
            int count = 0;
            String row1 = input.nextLine();

            if (row1.matches("^[1,3,5,7,9,11,13,15,17,19]+$")) {
                int row = Integer.parseInt(row1);
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
            else {System.out.println("Invalid! " + row1 + " is outside the range");}

        }
    }



