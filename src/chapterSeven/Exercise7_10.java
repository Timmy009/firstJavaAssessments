package chapterSeven;

public class Exercise7_10 {

    public int[] getPixelValue(int[] arrays) {

    for (int count = 0; count <= 20; count++) {
        arrays[count] = 10;
    }
        for (int count = 21; count <= 40; count++) {
            arrays[count] = 30;
        }
        for (int count = 41; count <= 60; count++) {
            arrays[count] = 50;
        }
        for (int count = 61; count <= 80; count++) {
            arrays[count] = 70;
        }
        for (int count = 81; count <= 100; count++) {
            arrays[count] = 90;
        }
        for (int count = 101; count <= 120; count++) {
            arrays[count] = 110;
        }
        for (int count = 121; count <= 140; count++) {
            arrays[count] = 130;
        }
        for (int count = 141; count <= 160; count++) {
            arrays[count] = 150;
        }
        for (int count = 161; count <= 180; count++) {
            arrays[count] = 170;
        }
        for (int count = 181; count < arrays.length; count++) {
            arrays[count] = 190;
        }



        return arrays;
    }
}
