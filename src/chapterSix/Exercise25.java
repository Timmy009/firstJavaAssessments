package chapterSix;

public class Exercise25 {

    public static void main(String[] args) {
       int count = 1;
       while (count <= 10000) {
           System.out.println(getPrime(count));
           count++;
       }
    }

    public static String getPrime(int number) {
        int count = 1;
        int primeCount = 0;
        while (count <= Math.sqrt(number)) {
            if (number % count ==0) {
                primeCount++;
            }
            count++;
        }
        if (primeCount == 1) {
            return number + " is a prime number";
        }
        else { return number + " is not a prime number";}
    }
}
