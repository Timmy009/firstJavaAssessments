package chapterSix;

import java.security.SecureRandom;

public class Exercise6_13 {
    public static void main(String[] args) {
        System.out.println(randomGenerator());
        System.out.println(randomGenerator2());
        System.out.println(randomGenerator3());


    }
    public static int randomGenerator() {
        SecureRandom secureRandom = new SecureRandom();
        int randomNum = secureRandom.nextInt(5) + 1;
        switch (randomNum) {
            case 1:
                randomNum = 0;
                break;
            case 2:
                randomNum = 3;
                break;
            case 3:
                randomNum = 6;
                break;
            case 4:
                randomNum = 9;
                break;
            case 5:
                randomNum = 12;
                break;
        }
        return randomNum;
    }
    public static int randomGenerator2() {
        SecureRandom secureRandom = new SecureRandom();
        int randomNum = secureRandom.nextInt(5) + 1;
        switch (randomNum) {
            case 1:
                randomNum = 1;
                break;
            case 2:
                randomNum = 2;
                break;
            case 3:
                randomNum = 4;
                break;
            case 4:
                randomNum = 8;
                break;
            case 5:
                randomNum = 16;
                break;
            default:
                randomNum = 32;
                break;
        }
        return randomNum;
    }
    public static int randomGenerator3() {
        SecureRandom secureRandom = new SecureRandom();
        int randomNum = secureRandom.nextInt(5) + 1;
        switch (randomNum) {
            case 1:
                randomNum = 10;
                break;
            case 2:
                randomNum = 20;
                break;
            case 3:
                randomNum = 30;
                break;
            case 4:
                randomNum = 40;
                break;
        }
        return randomNum;
    }
}
