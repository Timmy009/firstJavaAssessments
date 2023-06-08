package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MrFemiTask1Test {
    MrFemiTask1 mrFemiTask1 = new MrFemiTask1();

    @Test
    public void revTet () {

        assertEquals("java love I ", mrFemiTask1.rev(""));

    }

    @Test
    public void testOne () {

        assertEquals("invalid", mrFemiTask1.validate("I lovejav]a {}"));

    }

    @Test
    public void testTwo () {

        assertThrows(InvalidException.class, ()-> mrFemiTask1.validate("I love ><java"));

    }

    @Test
    public void testThree () {

        assertEquals("invalid", mrFemiTask1.validate("I love [java"));

    }

    @Test
    public void testFour () {

        assertEquals("invalid", mrFemiTask1.validate("I love {java"));

    }
    @Test
    public void testFive () {

        assertEquals("valid", mrFemiTask1.validate("I love java []"));

    }

    @Test
    public void testSix () {

        assertEquals("valid", mrFemiTask1.validate("I}love java {"));

    }

    @Test
    public void phoneTest () {

        assertEquals(true, mrFemiTask1.phoneN("08069547786"));

    }

}