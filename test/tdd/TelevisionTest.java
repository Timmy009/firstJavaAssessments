package tdd;

import org.junit.jupiter.api.Test;
import tddProject.Television;

import static org.junit.jupiter.api.Assertions.*;

    public class TelevisionTest {

        @Test
        public void testForTurnOn() {
            Television television = new Television();
            assertFalse(television.isOn());
            television.toggleOn();
            assertTrue(television.isOn());

        }
        @Test
        public void testForTurnOff() {
            Television television = new Television();
            television.toggleOn();
            assertTrue(television.isOn());
            television.toggleOn();
            assertFalse(television.isOn());

        }
        @Test
        public void increaseVolumeTestToEleven () {
            Television television = new Television();
            television.toggleOn();
            for (int count = 1; count <= 10; count++)
            {television.increaseVolume();}
            assertEquals(10, television.getVolume());
            television.increaseVolume();
            assertEquals(11, television.getVolume());
        }

        @Test
        public void decreaseVolumeTestToTwenty () {
            Television television = new Television();
            television.toggleOn();
            for (int count = 1; count <= 21; count++)
            {television.increaseVolume();}
            assertEquals(21, television.getVolume());
            television.decreaseVolume();
            assertEquals(20, television.getVolume());
        }
        @Test
        public void increaseVolumeTestToMoreThanHundred () {
            Television television = new Television();
            television.toggleOn();
            for (int count = 1; count <= 100; count++)
            {television.increaseVolume();}
            assertEquals(100, television.getVolume());
            television.increaseVolume();
            assertEquals(100, television.getVolume());
        }
        @Test
        public void decreaseVolumeTestTolessThanZero () {
            Television television = new Television();
            television.toggleOn();
            assertEquals(0, television.getVolume());
            television.decreaseVolume();
            assertEquals(0, television.getVolume());
        }

        @Test
        public void increaseVolumeBrightnessToThirtyOne () {
            Television television = new Television();
            television.toggleOn();
            for (int count = 1; count <= 29; count++)
            {television.increaseBrightness();}
            assertEquals(29, television.getBrightness());
            television.increaseBrightness();
            assertEquals(30, television.getBrightness());
        }
        @Test
        public void decreaseVolumeBrightnessToTwenty () {
            Television television = new Television();
            television.toggleOn();
            for (int count = 1; count <= 21; count++)
            {television.increaseBrightness();}
            assertEquals(21, television.getBrightness());
            television.decreaseBrightness();
            assertEquals(20, television.getBrightness());
        }

        @Test
        public void increaseBrightnessTestToMoreThanHundred () {
            Television television = new Television();
            television.toggleOn();
            for (int count = 1; count <= 100; count++)
            {television.increaseBrightness();}
            assertEquals(100, television.getBrightness());
            television.increaseBrightness();
            assertEquals(100, television.getBrightness());
        }
        @Test
        public void decreaseBrightnessTestTolessThanZero () {
            Television television = new Television();
            television.toggleOn();
            assertTrue(television.isOn());
            assertEquals(0, television.getBrightness());
            television.decreaseBrightness();
            assertEquals(0, television.getBrightness());
        }



    }

