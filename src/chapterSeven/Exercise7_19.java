package chapterSeven;

import java.util.Scanner;

public class Exercise7_19 {
    private boolean [] seats = new boolean[10];
    public void assignSeat () {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your prefered seat. 1 for first class and 2 for second class");
        int choice = userInput.nextInt();
        while (true) {
        while (choice == 1) {
            int seatFirstClassAvailable = assignFistClass();
            if (seatFirstClassAvailable >= 0 && seatFirstClassAvailable < 5) {
                System.out.println("Boarding pass: Seat" + (seatFirstClassAvailable+1) + ", First Class section");
                System.out.println("Enter your prefered seat. 1 for first class and 2 for second class");
                choice = userInput.nextInt();
            }
            else if (seatFirstClassAvailable > 4) {
                System.out.println("Next flight leaves in the next 3 hours");
                break;

            }
            else {
                System.out.println("Seat is unavailable. Would you like to try economy");
                System.out.println("Enter your preferred seat. 1 for firs class and 2 for second class");
                choice = userInput.nextInt();
                break;
            }
            if (seatFirstClassAvailable == 4) {
                System.out.println("Next flight leaves in the next 3 hours");
                break;
            }
        }
        while (choice == 2) {
            int seatEconomyAvailable = assignEconomy();
            if (seatEconomyAvailable >= 5 && seatEconomyAvailable <= 9) {
                System.out.println("Boarding pass: Seat" + (seatEconomyAvailable + 1) + ", Economy section");
                System.out.println("Enter your preferred seat. 1 for firs class and 2 for second class");
                choice = userInput.nextInt();
            } else if (seatEconomyAvailable > 9) {
                    System.out.println("Next flight leaves in the next 3 hours");
                    break;

            } else {
                System.out.println("Seat is unavailable. Would you like to try First Class");
                System.out.println("Enter your preferred seat. 1 for firs class and 2 for second class");
                choice = userInput.nextInt();

            }


        }

            System.out.println("Next flight leaves in the next 3 hours");
        }




    }





public int assignFistClass() {
    int firstClassMaximumSeats = 5;
    int seatNumber = -1;
    for (int seatIndex = 0; seatIndex < firstClassMaximumSeats; seatIndex++) {
        if (seats[seatIndex] == false) {
            seats[seatIndex] = true;
            seatNumber = seatIndex;
break;
        }
        else {
            seatNumber = -1;
        }
    }
   return seatNumber;
}
    public int assignEconomy() {
        int seatNumber = -1;
        int economyClassMaximumSeats = 10;
        for ( int economySeat = 5; economySeat < economyClassMaximumSeats; economySeat++) {
            if (seats[economySeat] == false) {
                seats[economySeat] = true;
                seatNumber = economySeat;
                break;

            }
            else {
                seatNumber =economySeat;
            }
        }
        return seatNumber;
    }

    }
