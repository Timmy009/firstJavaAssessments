package chapterFive;

    public class Exercise5_21 {
        public static void main(String[] args) {
            for (int sideOne = 1; sideOne <= 500; sideOne++) {

                for (int sideTwo = 1; sideTwo <= 500; sideTwo++){

                    for (int sideThree = 1; sideThree <= 500; sideThree++) {
                        if ((sideOne * sideOne) + (sideTwo * sideTwo) == (sideThree * sideThree)) {
                            System.out.println(sideOne + " " + sideTwo + " " + sideThree);
                        }

                    }
                }
            }
        }



}
