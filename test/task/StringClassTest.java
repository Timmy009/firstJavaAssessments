package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringClassTest {
    Mode2 mode2 = new Mode2();


    @Test
    public void modeTest () {

        assertEquals('a', mode2.mode("jav------a"));

    }


}