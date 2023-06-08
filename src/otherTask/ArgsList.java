package otherTask;

public class ArgsList {


        public static int sum(int ...num) {
            int total = 0;
            for (int number : num) {
                total += number;
            }
            return total;
        }


    public static double product(double ...num) {
        int product = 1;
     for (double number : num) {
         product *= number;
     }
        return product;
    }

    public static void main(String[] args) {
            System.out.println(sum(2, 3, 4, 5, 6));
            System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(product(2, 4, 2));
        }
    }


