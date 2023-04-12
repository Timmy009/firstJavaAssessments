package otherTask;

    public class SquareLoop {
        public static void main(String[] args) {

            int count = 0;
            while (count < 4) {
                int countTwo = 0;
                while (countTwo < 4) {
                    System.out.print("*");
                    countTwo++;
                }
                System.out.println();
                count++;
            }
        }
    }


