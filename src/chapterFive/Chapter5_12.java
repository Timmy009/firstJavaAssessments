package chapterFive;

    public class Chapter5_12 {
        public static void main(String[] args) {

            int sum = 0;
            for (int count = 1; count <= 30; count++) {
                if (count % 3 == 0) {
                    sum = sum + count;
                }

            }
            System.out.println("The sum of the integers between 1 and 30, which are divisible by 3 is " + sum);
        }

    }


