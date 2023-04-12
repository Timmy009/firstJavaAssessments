package assignment;

public class PatternB {

        public static void main(String[] args) {

            int count = 6;
            while (count >= 1) {
                int countTwo = 1;
                while (countTwo <= count) {
                    System.out.print(" " + countTwo + " ");
                    countTwo++;
                }
                count--;
                System.out.println();

            }
        }
    }

