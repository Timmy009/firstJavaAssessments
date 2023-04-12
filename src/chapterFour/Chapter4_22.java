package chapterFour;

public class Chapter4_22 {
    public static void main(String[] args) {


        int number = 1;
        int maxNumber = 5;
        int N2;
        int N3;
        int N4;
        System.out.println("N \t N2 \t N3 \t N4");
    while (number <= maxNumber) {
        N2 = number * number;
        N3 = N2 * number;
        N4 = N3 * number;
        System.out.println(number + " \t" + N2 + " \t" + N3 + " \t" + N4);
        number++;
    }
    }
}