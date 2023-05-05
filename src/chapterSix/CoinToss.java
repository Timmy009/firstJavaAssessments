package chapterSix;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;



public class CoinToss {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press enter to toss a coin or type quit to enter");
        String option = input.nextLine();
        while (true) {
            if (Objects.equals(option, "quit")) {
                break;
            }

            tossCo();
            System.out.println("Head is " + head);
            System.out.println("Tail is " + tail);
            System.out.println("Press enter to toss a coin or type quit to enter");
             option = input.nextLine();

        }


    }
private static int head = 0;
    private static int tail = 0;

    public static Coin tossCo () {
        SecureRandom rand = new SecureRandom();
        int coinTossed = 1 + rand.nextInt(2);

        switch (coinTossed) {
            case 1:
                head++;
                return Coin.HEAD;
                default:
                tail++;
                return Coin.TAIL;
        }

}}
