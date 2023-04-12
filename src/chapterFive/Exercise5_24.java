package chapterFive;

    public class Exercise5_24 {
        public static void main(String[] args) {
            int count = 0;
            int row = 10;
            while (count <= row) {
                int countTwo = 0;
                while (countTwo < row - count) {
                    System.out.print(" ");
                    countTwo = countTwo + 2;
                }
                int countThree = 0;
                while (countThree <= count ) {
                    System.out.print("*");
                    countThree++;
                }

                System.out.println();
                count = count + 2;
            }
            int countFour = 2;
            while (countFour <= row) {
                int countFive = 0;
                while (countFive <  countFour) {
                    System.out.print(" ");
                    countFive= countFive + 2;
                }
                int countSix = 0;
                while (countSix <= row - countFour ) {
                    System.out.print("*");
                    countSix++;
                }
                System.out.println();

                countFour = countFour + 2;
            }

        }



}
