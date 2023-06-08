package chapterTen;

public class Bicycle implements CarbonFootPrint{

    private String brand;
    private boolean electric;

    public Bicycle(String brand, boolean electric) {
        this.brand = brand;
        this.electric = electric;
    }

    @Override
    public double getCarbonFootPrint () {
        return electric ? 0 : 1;
    }
}
