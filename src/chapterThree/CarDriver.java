package chapterThree;

public class CarDriver {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 78990, "2016");
        Car car2 = new Car("Camry", 2090889, "2013");
        System.out.println(car1.getPrice());
        System.out.println(car2.getPrice());

        car1.applyDiscount(5);
        car2.applyDiscount(7);
        System.out.println(car1.getPrice());
        System.out.println(car2.getPrice());
    }
}
