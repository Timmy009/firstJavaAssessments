package chapterSix;

public class Exercise6_8 {
    private int hours;

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double calculateCharges() {
        double basicCharge = 2.00;
        double maxCharge = 10;
        double excessCharge = 0.50;
        double charges;
        int minHour = 3;
        int maxHour = 24;
       charges = basicCharge(basicCharge);
       charges += excessCharge(excessCharge, charges, minHour);
       charges = maxCharge(maxCharge, charges, maxHour);
        return charges;
    }

    private double basicCharge (double basicCharge) {
        return basicCharge;
    }
    private double excessCharge (double excessCharge, double charges, int minHours) {
        if (hours > 3)  charges =  ((hours - minHours) * excessCharge);
        return charges;

    }
    public double maxCharge (double maxCharge, double charges, int maxHour) {
        if (hours == maxHour) charges = maxCharge;
        return  charges;
    }
}
