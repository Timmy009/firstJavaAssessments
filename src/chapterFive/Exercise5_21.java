package chapterFive;

    public class Exercise5_21 {
        public static void main(String[] args) {
            int firstSide;
            int secondSide;
            int thirdSide;

            int sum = 0;
            for (int sideOne = 1; sideOne <= 500; sideOne++) {
                    firstSide = sideOne;

                for (int sideTwo = 1; sideTwo <= 500; sideTwo++){
                        secondSide = sideTwo;
                    for (int sideThree = 1; sideThree <= 500; sideThree++) {
                        thirdSide = sideThree;
                        if ((sideOne * sideOne) + (sideTwo * sideTwo) == (sideThree * sideThree)) {
                            sum = sum + firstSide + secondSide + thirdSide ;
                            if (sum != (firstSide + secondSide +  thirdSide)) {
                            System.out.println(sideOne + " " + sideTwo + " " + sideThree);}
                            sum = sum + firstSide + secondSide + thirdSide ;
                        }

                    }
                }

            }
        }



}
