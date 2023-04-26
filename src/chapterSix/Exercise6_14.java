package chapterSix;

public class Exercise6_14 {

    public int mathFloor(double num) {
        int result = (int) num;
        if (num < 0 && num != result) return result - 1;
        return result;
    }

    public int mathCelling(double num) {
        int result = (int) num;
        if (num <= 0 || num == result) {return (int) num;}
        else return result + 1;

    }
}
