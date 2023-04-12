package otherTask;

public class ArrayBarChart {

        public static void main(String[] args) {
            int [] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
            System.out.println("Grade \t Distribution");
            int count = 0;

            while (count < array.length) {

                if (count == 10) {System.out.print( "-" + 100);}
                else {System.out.print(count * 10 + "-" + (count * 10 + 9));}

                int countTwo = 0;
                while (countTwo < array[count]) {
                    System.out.print(" *");
                    countTwo++;}
                System.out.println();
                count++;

            }

        }
    }

