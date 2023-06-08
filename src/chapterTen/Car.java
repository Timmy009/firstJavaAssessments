package chapterTen;

public class Car implements CarbonFootPrint{
    private String model;
    private double fuelEfficiency;

    public Car(String model, double fuelEfficiency) {
        this.model = model;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public double getCarbonFootPrint() {
        return 1000 * fuelEfficiency;
    }
}
