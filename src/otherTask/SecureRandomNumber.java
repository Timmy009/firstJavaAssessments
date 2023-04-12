package otherTask;

import java.security.SecureRandom;

    public class SecureRandomNumber {
        public static void main(String[] args) {
            SecureRandom random = new SecureRandom();
            int count = 1;
            while (count <= 20) {
                int countTwo = 1;
                while (countTwo <= 6) {
                    int result = 1 + random.nextInt(6);
                    System.out.print(result);
                    countTwo++;}
                System.out.println();
                count++;
            }
        }
    }


