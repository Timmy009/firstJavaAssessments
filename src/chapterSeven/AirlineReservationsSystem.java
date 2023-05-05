package chapterSeven;

import java.util.Scanner;

public class AirlineReservationsSystem {
    private static boolean[] seats = new boolean[10];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please type 1 for First Class and 2 for Economy:");
            int choice = input.nextInt();

            if (choice == 1) {
                int seat = reserveSeatInFirstClass();
                if (seat == -1) {
                    System.out.println("First Class is full. Would you like to be placed in Economy? (y/n)");
                    if (input.next().equalsIgnoreCase("y")) {
                        seat = reserveSeatInEconomy();
                        if (seat == -1) {
                            System.out.println("Economy is also full. Next flight leaves in 3 hours.");
                        } else {
                            printBoardingPass(seat, "Economy");
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                } else {
                    printBoardingPass(seat, "First Class");
                }
            } else if (choice == 2) {
                int seat = reserveSeatInEconomy();
                if (seat == -1) {
                    System.out.println("Economy is full. Would you like to be placed in First Class? (y/n)");
                    if (input.next().equalsIgnoreCase("y")) {
                        seat = reserveSeatInFirstClass();
                        if (seat == -1) {
                            System.out.println("First Class is also full. Next flight leaves in 3 hours.");
                        } else {
                            printBoardingPass(seat, "First Class");
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                } else {
                    printBoardingPass(seat, "Economy");
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int reserveSeatInFirstClass() {
        for (int i = 0; i < 5; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return i;
            }
        }
        return -1;
    }

    private static int reserveSeatInEconomy() {
        for (int i = 5; i < 10; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return i;
            }
        }
        return -1;
    }

    private static void printBoardingPass(int seat, String section) {
        System.out.printf("Boarding pass: Seat %d, %s section%n", seat + 1, section);
    }
}
