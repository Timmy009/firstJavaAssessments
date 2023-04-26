package tdd.chapterSixTest;

import chapterSix.Exercise6_28;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise28Test {
   @Test
    public void temperatureCheck() {
       assertEquals("Its reasonable weather for sports today", Exercise6_28.temperatureCheck("20-30 C"));
   }
}
