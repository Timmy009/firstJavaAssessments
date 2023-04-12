package tdd;



import org.junit.jupiter.api.Test;
import tddProject.Bike;

import static org.junit.jupiter.api.Assertions.*;

    public class BikeTest {

        @Test
        public void onBikeTest () {
            Bike powerBike = new Bike ();
            powerBike.bikeSwitch(true);
            assertTrue(powerBike.isOn());
        }
        @Test
        public void offBikeTest () {
            Bike powerBike = new Bike();
            powerBike.bikeSwitch(false);
            assertFalse(powerBike.isOn());
        }

        @Test
        public void gearOneTest () {
            Bike powerBike = new Bike (15);
            powerBike.bikeSwitch(true);
            powerBike.increaseGear(1);
            assertEquals(16, powerBike.getSpeed());
        }
        @Test
        public void gearTwoTest () {
            Bike powerBike = new Bike (24, 1);
            powerBike.bikeSwitch(true);
            powerBike.increaseGear(2);
            assertEquals(26, powerBike.getSpeed());
        }
        @Test
        public void gearThreeTest () {
            Bike powerBike = new Bike (35, 2);
            powerBike.bikeSwitch(true);
            powerBike.increaseGear(3);
            assertEquals(38, powerBike.getSpeed());
        }
        @Test
        public void gearFourTest () {
            Bike powerBike = new Bike (44, 3);
            powerBike.bikeSwitch(true);
            powerBike.increaseGear(4);
            assertEquals(48, powerBike.getSpeed());
        }
        @Test
        public void otherNumberTest () {
            Bike powerBike = new Bike (24, 3);
            powerBike.bikeSwitch(true);
            powerBike.increaseGear(7);
            assertEquals(0, powerBike.getSpeed());
        }

        @Test
        public void decreaseGearOneTest () {
            Bike powerBike = new Bike (15);
            powerBike.bikeSwitch(true);
            powerBike.decreaseGear(1);
            assertEquals(14, powerBike.getSpeed());
        }
        @Test
        public void decreaseGearTwoTest () {
            Bike powerBike = new Bike(24, 1);
            powerBike.bikeSwitch(true);
            powerBike.decreaseGear(2);
            assertEquals(22, powerBike.getSpeed());
        }
        @Test
        public void decreaseGearThreeTest () {
            Bike powerBike = new Bike (35, 2);
            powerBike.bikeSwitch(true);
            powerBike.decreaseGear(3);
            assertEquals(32, powerBike.getSpeed());
        }
        @Test
        public void decreaseGearFourTest () {
            Bike powerBike = new Bike (44, 3);
            powerBike.bikeSwitch(true);
            powerBike.decreaseGear(4);
            assertEquals(40, powerBike.getSpeed());
        }
        @Test
        public void decreaseOtherNumberTest () {
            Bike powerBike = new Bike (24, 3);
            powerBike.bikeSwitch(true);
            powerBike.decreaseGear(-9);
            assertEquals(0, powerBike.getSpeed());
        }


    }

