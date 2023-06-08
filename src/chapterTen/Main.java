package chapterTen;


import java.util.ArrayList;

public class Main {
    private static ArrayList< CarbonFootPrint > arr = new ArrayList<>();

    public static void main(String[] args) {


        Building building = new Building("bungalow", 67.7, 8878.5);
        Car car = new Car("2019", 9.0);
        Bicycle bicycle = new Bicycle("Toyota", true);
         arr.add(building);
        arr.add(car);
         arr.add(bicycle);

        for (CarbonFootPrint carbonFootPrint : arr) {
            System.out.println(carbonFootPrint.getCarbonFootPrint());
        }

    }
}
