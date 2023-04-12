package chapterFive;

public class CompoundInterestCalculator {

        public static void main(String[] args) {
            double principal = 1_000;

            double rate = 0.05;
            double amount;
            System.out.println("Year" + "\t" + "Amount on deposit");
            for (int count = 1; count <= 10; count++) {
                amount = principal * Math.pow(1 + rate, count);
                System.out.printf("%d\t%,20.2f%n", count, amount  );

            }
    }
}
