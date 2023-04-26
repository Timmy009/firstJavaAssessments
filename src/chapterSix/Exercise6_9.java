package chapterSix;

public class Exercise6_9 {
    private double X;
    public void setXValue(double X) {
        this.X = X;
    }

    public double roundOff() {
    double Y = Math.floor(X + 0.5);
        return Y;
    }
}
