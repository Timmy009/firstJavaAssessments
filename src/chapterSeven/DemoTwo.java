package chapterSeven;

import java.security.SecureRandom;

public class DemoTwo {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int [] array = new int[7];
        for (int count = 1; count <= 60000; count++) {
            array[1 + random.nextInt(6)]++;
        }
        for (int countTwo = 1; countTwo < array.length; countTwo++) {
            System.out.println(countTwo + "     " + array[countTwo]);
        }
    }
}
