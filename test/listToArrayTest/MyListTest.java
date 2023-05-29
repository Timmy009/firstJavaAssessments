package listToArrayTest;

import listToArray.MyList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {
    MyList myList;

    @BeforeEach public void startWith() {
        myList = new MyList();
    }
    @Test public void testThatArrayExists () {
        assertNotNull(myList);
    }
    @Test public void addElementTest () {
        myList.add(2, "esther");
        assertEquals("esther", myList.getElement(2));
    }

    @Test public void addAll () {
        String [] arrayTwo = {"Mark", "Steven", "Hazard"};
        myList.addAll(0, arrayTwo);
        String [] expected = {"Mark", "Steven", "Hazard", null, null, null, null, null, null, null};
        for ( int count = 0; count < expected.length; count++) {
            assertEquals(expected[count],  myList.getElement(0));
        }
    }
    @Test public void sizeTest() {
        myList.add(2, "esther");
        myList.add(3, "esther");
        myList.add(4, "esther");
        assertEquals(3, myList.getSize());

    }



    @Test public void clearTest() {
        myList.add(2, "esther");
        myList.add(3, "esther");
        myList.add(4, "esther");
        assertEquals(3, myList.getSize());
        myList.clear();
        assertEquals(0, myList.getSize());
    }


    @Test public void clearTwoTest() {
        myList.add(2, "esther");
        myList.add(3, "esther");
        myList.add(4, "esther");
        assertEquals(3, myList.getSize());
        myList.clear();
        assertEquals(0, myList.getSize());
        assertEquals(null, myList.getElement(0));}

    @Test public void removeTest() {
        myList.add(2, "esther");
        myList.add(3, "esther");
        myList.add(4, "esther");
        assertEquals(3, myList.getSize());
        myList.remove(2);
        assertEquals(null, myList.getElement(2));}



    @Test public void setTest() {
        myList.set(3, "timi");
        assertEquals("timi", myList.getElement(3));
    }
    @Test public void indexOfTest () {
        myList.add(2, "timi");
        myList.add(3, "esther");
        myList.add(4, "david");
        assertEquals(3, myList.indexOf("esther"));
    }
    @Test public void indexOfMissingTest () {
        myList.add(2, "timi");
        myList.add(3, "esther");
        myList.add(4, "david");
        assertEquals(-1, myList.indexOf("tayo"));
    }
    @Test public void lastIndexOfTest () {
        myList.add(2, "timi");
        myList.add(3, "esther");
        myList.add(4, "david");
        myList.add(7, "esther");
        assertEquals(7, myList.lastIndexOf("esther"));
    }

    @Test public void lastIndexOfMissingTest () {
        myList.add(2, "timi");
        myList.add(3, "esther");
        myList.add(4, "david");
        myList.add(7, "esther");
        assertEquals(-1, myList.lastIndexOf("terry"));
    }

    @Test public void equalsTest () {
        myList.add(2, "timi");
        myList.add(3, "esther");
        myList.add(4, "david");
        myList.add(7, "esther");
        assertTrue(myList.equalsTo("esther"));
    }

    @Test public void not_equalsTest () {
        myList.add(2, "timi");
        myList.add(3, "esther");
        myList.add(4, "david");
        myList.add(7, "esther");
        assertFalse(myList.equalsTo("tey"));
    }

    @Test public void isNotEmptyTest() {
        myList.add(2, "timi");
        myList.add(3, "esther");
        myList.add(4, "david");
        myList.add(7, "esther");
        assertFalse(myList.isEmpty());
    }
    @Test public void isEmptyTest() {
        assertTrue(myList.isEmpty());
    }
    @Test public void not_containsTest() {
        myList.add(3, "esther");
        myList.add(4, "david");
        myList.add(7, "esther");
        assertFalse(myList.contains("timi"));
    }

    @Test public void containsTest() {
        myList.add(3, "esther");
        myList.add(4, "david");
        myList.add(7, "esther");
        assertTrue(myList.contains("david"));
    }


        }

