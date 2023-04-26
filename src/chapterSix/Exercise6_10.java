package chapterSix;

public class Exercise6_10 {

    private double number;

    public void setNumber(double number) {
        this.number = number;
    }

    public int roundToInteger() {
        int roundNumber = (int) Math.floor(number + 0.5);
        return roundNumber;
    }

    public double roundToInTenth() {
        double roundNumber =  Math.floor(number * 10 + 0.5) / 10;
        return roundNumber;
    }

    public double roundToHundred() {
        double roundNumber =  Math.floor(number * 100 + 0.5) / 100;
        return roundNumber;

    }

    public double roundToInThousands() {
        double roundNumber =  Math.floor(number * 1000 + 0.5) / 1000;
        return roundNumber;
    }
}
