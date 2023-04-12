package assignment;

public class SquareStar {
    public static void main(String[] args) {

        int max = 4;
        int numberCounterTwo;
        int maxTwo;
        int numberCounter = 1;
        while (numberCounter <= max) {
             numberCounterTwo = 1;
            maxTwo = 10;
            while (numberCounterTwo <= maxTwo) {
                System.out.print(" * ");
                numberCounterTwo++;
            }
            System.out.println();
            numberCounter++;
        }
    }
}
