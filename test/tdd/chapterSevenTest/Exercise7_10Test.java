package tdd.chapterSevenTest;

import chapterSeven.Exercise7_10;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise7_10Test {
    private Exercise7_10 exercise7_10;
    int [] array2 = new int[300];

    @BeforeEach
    public void setUp() {
        exercise7_10 = new Exercise7_10();}

    @Test
    public void pixelQuantizedTestTen() {

        int [] arrays = exercise7_10.getPixelValue(array2);

        for (int count = 0; count < 21; count++) {
            assertEquals(10, arrays[count]);}
    }


    @Test
    public void pixelQuantizedTestThirty() {

        int [] arrays = exercise7_10.getPixelValue(array2);

        for (int count = 21; count < 41; count++) {
            assertEquals(30, arrays[count]);}
    }
    @Test
    public void pixelQuantizedTestFifty() {

        int [] arrays = exercise7_10.getPixelValue(array2);

        for (int count = 41; count < 61; count++) {
            assertEquals(50, arrays[count]);}
    }
    @Test
    public void pixelQuantizedTestSeventy() {

        int [] arrays = exercise7_10.getPixelValue(array2);

        for (int count = 61; count < 81; count++) {
            assertEquals(70, array2[count]);}
    }

    @Test
    public void pixelQuantizedTestNine() {

        int [] arrays = exercise7_10.getPixelValue(array2);

        for (int count = 81; count < 101; count++) {
            assertEquals(90, array2[count]);}
    }



    @Test
    public void pixelQuantizedTest110() {

        int [] arrays = exercise7_10.getPixelValue(array2);

        for (int count = 101; count < 121; count++) {
            assertEquals(110, array2[count]);}
    }

    @Test
    public void pixelQuantizedTest130() {

        int [] arrays = exercise7_10.getPixelValue(array2);

        for (int count = 121; count < 141; count++) {
            assertEquals(130, array2[count]);}
    }

    @Test
    public void pixelQuantizedTest150() {

        int [] arrays = exercise7_10.getPixelValue(array2);

        for (int count = 141; count < 161; count++) {
            assertEquals(150, array2[count]);}
    }

    @Test
    public void pixelQuantizedTest170() {

        int [] arrays = exercise7_10.getPixelValue(array2);

        for (int count = 161; count < 181; count++) {
            assertEquals(170, array2[count]);}
    }

    @Test
    public void pixelQuantizedTestLast() {

        int [] arrays = exercise7_10.getPixelValue(array2);

        for (int count = 181; count < array2.length; count++) {
            assertEquals(190, array2[count]);}
    }

}
