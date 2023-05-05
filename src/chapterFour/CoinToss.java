package chapterFour;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    enum Coin { HEADS, TAILS };

    public static void main(String[] args) {
        int headsCount = 0;
        int tailsCount = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Press Enter to toss the coin or type 'quit' to exit.");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            Coin result = flip(random);
            if (result == Coin.HEADS) {
                headsCount++;
            } else {
                tailsCount++;
            }
            System.out.printf("Coin toss result: %s%n", result);
            System.out.printf("Heads count: %d, Tails count: %d%n", headsCount, tailsCount);
        }
    }

    public static Coin flip(Random random) {
        return (random.nextBoolean()) ? Coin.HEADS : Coin.TAILS;
    }
}
