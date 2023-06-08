package ChapterEight;

import static java.lang.Math.*;

public class Cylinder {

private int radius;
private int height;


public Cylinder() {
    radius = 1;
    height = 1;
        }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        validateRadius(radius);
        this.radius = radius;

    }

    public void setHeight(int height) {
        validateRadius(height);
        this.radius = height;

    }
    private static void validateHeight(int height) {
        if (height < 1)  throw new IllegalArgumentException();
    }


    private static void validateRadius(int radius) {
        if (radius < 1)  throw new IllegalArgumentException();
    }

    public int getHeight() {
        return height;
    }


    public double calculateVolume() {
        return PI * pow(radius, 2) * height;

    }
}
