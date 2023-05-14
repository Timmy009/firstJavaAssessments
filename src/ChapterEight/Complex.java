package ChapterEight;

public class Complex {
     double realPart;
     double imaginaryPart;

    public Complex () {
        this(0.0, 0.0);

    }



    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
public Complex add (Complex other) {
        double realSum = this.realPart + other.realPart;
        double imaginarySum = this.imaginaryPart + other.imaginaryPart;
        return new Complex(realSum, imaginarySum);
}

  public Complex sub (Complex other) {
      double realSub = this.realPart - other.realPart;
      double imaginarySub = this.imaginaryPart - other.imaginaryPart;
      return new Complex(realSub, imaginarySub);
  }

}
