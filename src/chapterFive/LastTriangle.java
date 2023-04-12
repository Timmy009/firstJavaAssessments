package chapterFive;

    public class LastTriangle {
        public static void main(String[] args) {
            int count = 0;
            while (count < 10)
            {int countThree = 0;
                while (countThree < 9 - count){
                    System.out.print(" ");
                    countThree++;
                }
                int countTwo = 0;
                while (countTwo <= count) {
                    System.out.print("*");
                    countTwo++;
                }
                System.out.println();
                count++;
            }
    }



}
