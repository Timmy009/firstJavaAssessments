package tdd;

import chapterThree.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    Car car = new Car("Toyota", 30000, "2015");



    @Test
    public void applyDiscountTest () {
        // given
        car.applyDiscount(10);
       assertEquals(27000, car.getPrice());
    }
    @Test
    public void priceTest () {
        assertEquals(30000, car.getPrice());
    }
}
