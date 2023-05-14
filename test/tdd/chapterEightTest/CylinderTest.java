package tdd.chapterEightTest;

import ChapterEight.Cylinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CylinderTest {
    Cylinder cylinder;
    @BeforeEach
    public void setUp() {
        cylinder = new Cylinder();
    }
    @Test
    public void setRadiusTest () {
//        cylinder.setHeight(-1);
//        assertEquals(1, cylinder.getHeight());
        assertThrows(IllegalArgumentException.class, ()->cylinder.setHeight(-1));

    }

}
