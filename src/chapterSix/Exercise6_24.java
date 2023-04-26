package chapterSix;

public class Exercise6_24 {

    public static void main(String[] args) {
        int countTwo = 1;
        while (countTwo <= 1000) {
            System.out.println(perfectNumber(countTwo));
            countTwo++;
        }
    }
    public static String perfectNumber(int number) {
        int count = 1;
        int divisible = 0;
        StringBuilder factors = new StringBuilder();
        while (count < number) {
            if (number % count ==0) {
                divisible = divisible + count;
                factors.append(count).append(" ");
            }
            count++;
        }
        if (divisible == number) {return number + " is a perfect number. The factors are " + factors;}
        else {
            return number + " is not perfect number";
        }
    }
}
