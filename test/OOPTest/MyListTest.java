package OOPTest;

import listProject.MyList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyListTest {
    MyList myList;

    @BeforeEach
    public void startWith() {
        myList = new MyList();
    }
    @Test public void addTest() {
        String name = "Timi";
        myList.add(2, name);
        assertEquals("Timi", myList.getElement(2));
    }
    @Test public void addCollectionTest() {
        String [] names = {"Timi", "Torin", "Sam"};
        myList.addCollection(3, List.of(names));
        assertEquals("[Timi, Torin, Sam]", myList.getElement(3));
    }

    @Test public void getSizeTest() {
        assertEquals(10, myList.listSize());
    }
    @Test public void clearElementTest() {
       assertEquals(0, myList.clearElement());
    }
}
