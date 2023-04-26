package otherTask;


    public class PyramidStar {
        public static void main(String[] args) {

            int count = 0;
            while (count < 15) {
                int countTwo = 0;
                while (countTwo < 15 - count) {
                    System.out.print(" ");
                    countTwo++;
                }
                int countThree = 0;
                while (countThree <= count ) {
                    System.out.print("*");
                    countThree = countThree + 1;
                }
                count = count + 2;
                System.out.println();
            }
        }
    }


