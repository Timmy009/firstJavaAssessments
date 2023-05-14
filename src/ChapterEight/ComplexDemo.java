package ChapterEight;
public class ComplexDemo {
    double realPart;
    double imaginaryPart;

    public ComplexDemo() {
        this(0.0, 0.0);
    }

    public ComplexDemo(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexDemo add(ComplexDemo other) {
        double realSum = this.realPart + other.realPart;
        double imaginarySum = this.imaginaryPart + other.imaginaryPart;
        return new ComplexDemo(realSum, imaginarySum);
    }

    public ComplexDemo subtract(ComplexDemo other) {
        double realDiff = this.realPart - other.realPart;
        double imaginaryDiff = this.imaginaryPart - other.imaginaryPart;
        return new ComplexDemo(realDiff, imaginaryDiff);
    }

    public void print() {
        System.out.printf("(%f, %f)\n", realPart, imaginaryPart);
    }

}
