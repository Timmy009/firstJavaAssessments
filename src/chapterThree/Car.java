package chapterThree;

public class Car {
    private String model;
    private double price;
    private String year;


    public Car(String model, double price, String year) {
        this.model = model;
        if (price > 1) {
        this.price = price;}
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
      if (price > 1) { this.price = price;}
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public void applyDiscount (double discountPercentage) {
        double discountAmount = discountPercentage /100 * price;
        price = price - discountAmount;
    }
}
