package chapterFour;

public class Chapter4_33 {
    public static void main(String[] args) {
        int count = 1;
        int max = 8;
        while (count <= max) {
            int countTwo = 1;
          while (countTwo < max) {
              System.out.print(" * ");
              countTwo++;
          }

          System.out.println();
          count++;
            if (count % 2 == 0) {System.out.print(" ");}

        }
    }
}
