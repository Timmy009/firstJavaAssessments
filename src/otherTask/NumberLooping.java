package otherTask;

    public class NumberLooping {
        public static void main(String[] args) {
            int count = 0;
            while (count <= 10) {
                int countTwo = 1;
                while (countTwo <= count) {
                    System.out.print(countTwo);
                    countTwo++;
                }
                System.out.println();
                count++;
            }
        }
    }


