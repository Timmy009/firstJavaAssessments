package chapterFive;

    public class Exercise5_22 {
        public static void main(String[] args) {
            int count = 0;
            while (count <= 10) {
                int countTwo = 0;
                while (countTwo <= count) {
                    System.out.print("*");
                    countTwo++;
                }
                int countThree = 0;
                while (countThree <= 10 - count) {
                    System.out.print(" ");
                    countThree++;
                }
                int countFour = 0;
                while (countFour <= 10 - count) {
                    System.out.print("*");
                    countFour++;
                }
                int countFive = 0;
                while (countFive <= count) {
                    System.out.print("  ");
                    countFive++;
                }
                int countSix = 0;
                while (countSix <= 10 - count) {
                    System.out.print("*");
                    countSix++;
                }
                int countSeven = 0;
                while (countSeven <= 10 - count) {
                    System.out.print(" ");
                    countSeven++;
                }
                int countEight = 0;
                while (countEight <= count) {
                    System.out.print("*");
                    countEight++;
                }

                System.out.println();

                count++;
            }
        }



}
