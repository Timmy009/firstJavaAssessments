package tdd;

import org.junit.jupiter.api.Test;
import tddProject.Utme;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UtmeTest {
        @Test
        public void testForOneCopy () {
            Utme utmeTest = new Utme();
            assertEquals(2000, utmeTest.testDrillerUtme(1));
        }
        @Test
        public void testForTwoCopies () {
            Utme utmeTest = new Utme();
            assertEquals(4000, utmeTest.testDrillerUtme(2));
        }
        @Test
        public void testForSevenCopies () {
            Utme utmeTest = new Utme();
            assertEquals(12600, utmeTest.testDrillerUtme(7));
        }
        @Test
        public void testForNineCopies () {
            Utme utmeTest = new Utme();
            assertEquals(16200, utmeTest.testDrillerUtme(9));
        }
        @Test
        public void testForTenCopies () {
            Utme utmeTest = new Utme();
            assertEquals(16000, utmeTest.testDrillerUtme(10));
        }


        @Test
        public void testForTwentyNineCopies () {
            Utme utmeTest = new Utme();
            assertEquals(46400, utmeTest.testDrillerUtme(29));
        }
        @Test
        public void testForFiveHundredCopies () {
            Utme utmeTest = new Utme();
            assertEquals(500000, utmeTest.testDrillerUtme(500));
        }
        @Test
        public void testForNinetyNineCopies () {
            Utme utmeTest = new Utme();
            assertEquals(128700, utmeTest.testDrillerUtme(99));
        }
        @Test
        public void testForSixHundredCopies () {
            Utme utmeTest = new Utme();
            assertEquals(600000, utmeTest.testDrillerUtme(600));
        }
        @Test
        public void testForNegativeNumbers () {
            Utme utmeTest = new Utme();
            assertEquals(0, utmeTest.testDrillerUtme(-1));
        }



}
