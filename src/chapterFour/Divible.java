package chapterFour;

public class Divible {
    private int number;

    public void setNumber(int number) {
        if (number < 0) {number = 0;}
        else {
        this.number = number;}
    }

    public String calculateDivible () {
            int sum = 0;
            for (int count = 1; count <= number; count++) {
                if (count % 3 == 0) {
                    sum = sum + count;
                }

            }
            return  ("The sum of the integers between 1 and 30, which are divisible by 3 is " + sum);
        }

    }




