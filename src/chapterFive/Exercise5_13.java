package chapterFive;

    public class Exercise5_13 {
        public static void main(String[] args) {
            long count = 1;
            long sum = 0;
            System.out.println("Numbers \t Summation");
            while (count <= 100) {
                sum = sum + count;

                System.out.println(count + "\t\t\t\t" + sum);

                count++;
            }
        }
    }




