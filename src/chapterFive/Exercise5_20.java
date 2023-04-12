package chapterFive;

    public class Exercise5_20 {
        public static void main(String[] args) {

            float denominator = 3;
            float pi = 4;
//        System.out.println("Terms                PI");
            int count = 1;
            while (count <= 200000) {
                pi = pi - 4 / denominator;
                pi = pi * -1;
                denominator = denominator + 2;

                if (String.format("%.5f", pi).startsWith("3.14159")) {
                    System.out.printf("Found after %d terms: %.5f%n", count, pi);

                    count++;
                }}
        }
    }
