package otherTask;

public class SumSeries {

        public static void main(String[] args) {
            int count = 1;
            long result = 0;
            while (count <= 100) {
                result = result + count;
                System.out.println(count + " " + result);
                count++;
            }
        }
    }

