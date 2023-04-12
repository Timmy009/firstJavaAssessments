package chapterFive;

    public class Exercise5_18 {
        public static void main(String[] args) {
            int principal = 100000;

            int  rate = 5;
            int amount;
            System.out.println("Year" + "\t" + "Amount on deposit");
            for (int count = 1; count <= 10; count++) {
                amount = principal * (100 + rate) / 100;
                System.out.printf("%4d%20d.%02d%n\"", count, amount/ 100, amount/ 100  );
                principal = amount;

            }
        }
    }
