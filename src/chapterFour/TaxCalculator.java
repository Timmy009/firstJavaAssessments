package chapterFour;

public class TaxCalculator {
    private double earnings;


    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public double calculateTax () {
        int numberOfCitizen = 1;
        int maxNumberOfCitizen = 3;
        double tax = 0;
        while (numberOfCitizen <= maxNumberOfCitizen) {
            if (earnings < 0) {
                return 0;
            }
            if (earnings <= 30000) {
                tax = 0.15 * earnings;
            } else {
                tax = 0.15 * 30000 + (0.20 * (earnings - 30000));
            }
            numberOfCitizen++;
        }
            return tax;
    }

}
