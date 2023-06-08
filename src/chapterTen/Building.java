package chapterTen;

public class Building implements CarbonFootPrint{
    private String type;
    private double squareFoot;
    private double numberOfFloors;

    public Building(String type, double squareFoot, double numberOfFloors) {
        this.type = type;
        this.squareFoot = squareFoot;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double getCarbonFootPrint() {
        return  squareFoot * numberOfFloors * 0.5;
    }

}
