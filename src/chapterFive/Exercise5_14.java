package chapterFive;

    public class Exercise5_14 {
        public static void main(String[] args) {
            System.out.println("Rate \t Amount on deposit");
            double amount = 0;
            double principal = 1000;
            double rate = 0.05;
            while (rate <= 0.1) {
                System.out.printf("%.2f  ", rate);
                int count = 1;
                while (count <= 10){
                    amount = principal * Math.pow(1 + rate, count);
                    System.out.printf("%.2f  ", amount  );
                    count++;}
                System.out.println();
                rate+=0.01;
            }
        }
    }