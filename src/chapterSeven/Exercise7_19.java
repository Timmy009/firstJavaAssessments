package chapterSeven;

import java.util.Scanner;

public class Exercise7_19 {

    public static void main(String[] args) {

        firstClassSeatAssign();
        economyClassSeatAssign();

    }
           private static Scanner scanner = new Scanner(System.in);
        private static boolean [] seats = new boolean[10];
    public static void firstClassSeatAssign() {
        System.out.println("Enter 1 for first class and 2 for economy");
        int seatOption = scanner.nextInt();
        int count = 0;
        while (!seats[4]) {
            System.out.println("The seat " + (count + 1) + " of the firstclass seat assigned to you");
            seats[count] = true;
            System.out.println("Enter 1 for first class and 2 for economy");
            seatOption = scanner.nextInt();
            count++;
        }
        if (count == 4) {
            System.out.println("The economy is full");
        }



    }


    public static void economyClassSeatAssign() {
        System.out.println("Enter 1 for first class and 2 for economy");
        int seatOption = scanner.nextInt();
        int count = 5;
        System.out.println("The seat " + (count + 1) + " of the  economy seat assigned to you");

        while (!seats[9]) {
            seats[count] = true;
            System.out.println("Enter 1 for first class and 2 for economy");
            seatOption = scanner.nextInt();
            count++;
        }
        if (count == 9) {
            System.out.println("The first class is full");
        }



    }




    }
