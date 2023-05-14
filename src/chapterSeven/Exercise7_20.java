package chapterSeven;

import java.security.SecureRandom;
import java.util.Arrays;

public class Exercise7_20 {


    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int [][] archeryGame = new int[4][3];
        int firstPlayerTotal = 0;
        int secondPlayerTotal = 0;
        int thirdPlayerTotal = 0;
        int fourthPlayerTotal = 0;
        int winner = firstPlayerTotal;
        int highestPlayer  = 1;

        for (int players = 0; players < archeryGame.length; players++) {
        for (int chances = 0; chances < archeryGame[0].length; chances++) {
            archeryGame[players][chances] = secureRandom.nextInt(10);}
    }

        System.out.println(Arrays.deepToString(archeryGame));
        System.out.println("Players Chance 1    Chance 2    Chance 3       Total");
    for (int count = 0; count < archeryGame.length; count++){
        System.out.print(count + "           " );
        for (int countTwo = 0; countTwo < archeryGame[0].length; countTwo++) {
            if (count == 0) {
            firstPlayerTotal += archeryGame[0][countTwo];}
            if (count == 1) {
            secondPlayerTotal += archeryGame[1][countTwo];}
            if (count == 2) {
            thirdPlayerTotal += archeryGame[2][countTwo];}
            if (count == 3) {
            fourthPlayerTotal += archeryGame[3][countTwo];}
            System.out.print( (archeryGame[count][countTwo]) + "           ");
        }
        if (count==0) {System.out.print(firstPlayerTotal);}
        if (count==1) {System.out.print(secondPlayerTotal);}
        if (count==2) {System.out.print(thirdPlayerTotal);}
        if (count==3) {System.out.print(fourthPlayerTotal);}
        System.out.println();

    }
    if (secondPlayerTotal > winner) {
        winner = secondPlayerTotal;
        highestPlayer = 2;
    }
        if (thirdPlayerTotal > winner) {
            winner = thirdPlayerTotal;
            highestPlayer  = 3;
        }
        if (fourthPlayerTotal > winner) {
            winner = fourthPlayerTotal;
            highestPlayer  =4;
        }


        System.out.println("The winner of the Archery game is player "  + highestPlayer + " With the total score of " + winner);
    }




}
