package chapterSeven;

public class Exercise7_14 {
    public static double average(int ...args) {
         double total = 0;
        double average = 0;
        for (int count = 0; count < args.length; count++) {
            total += args[count];
        }
        average = total/args.length;
        return average;
    }

    public static void main(String[] args) {
        System.out.println(average(2, 3, 4, 5, 6));
        System.out.println(average(2, 3));
    }
}
