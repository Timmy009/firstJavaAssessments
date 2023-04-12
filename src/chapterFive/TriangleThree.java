package chapterFive;

    public class TriangleThree {
        public static void main(String[] args) {


            int count = 0;
            while (count < 10) {

                int countThree = 0;
                while (countThree < count){
                    System.out.print(" ");
                    countThree++;}

                int countTwo = 0;
                while (countTwo < 10 - count)
                {
                    System.out.print("*");
                    countTwo++;}

                System.out.println();
                count++;}
        }


}
