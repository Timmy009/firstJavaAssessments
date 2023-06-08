package task;

import java.security.SecureRandom;
import java.util.Random;
import java.util.stream.Collectors;


public class Lamdas {

    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        String num =        randomNumbers.ints(10, 1, 7).mapToObj(String::valueOf).collect(Collectors.joining(" "));



    }



}
