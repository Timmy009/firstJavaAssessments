package chapterSeven;

public class Exercise7_14 {
    public static double average(int ...num) {
         double total = 0;
        double average = 0;
        for (int count = 0; count < num.length; count++) {
            total += num[count];
        }
        average = total/num.length;
        return average;
    }

    public static void main(String[] args) {
        System.out.println(average(2, 3, 4, 5, 6));
        System.out.println(average(2, 3));
    }
}
