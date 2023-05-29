package listToArrayTest;

import listToArray.MySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MySetTest {


    MySet mySet;

    @BeforeEach public void startWith () {
        mySet = new MySet();
    }

    @Test public void listCanContainOnlyUniqueValue () {
        mySet.add("3");
        mySet.add("2");
        mySet.add("3");
        assertEquals (2, mySet.getSize());
    }

    @Test public void containsTest () {
        mySet.add("3");
        mySet.add("2");
        mySet.add("3");
        assertEquals (true, mySet.contains("3"));
    }

    @Test public void notContainsTest () {
        mySet.add("3");
        mySet.add("2");
        mySet.add("3");
        assertEquals (false, mySet.contains("6"));
    }

    @Test public void clear () {
        mySet.add("3");
        mySet.add("2");
        mySet.add("3");
        mySet.clear();
        assertEquals (0, mySet.getSize());
    }
@Test public void isEmptyTest () {
        assertEquals(true, mySet.isEmpty());
}

//    @Test public void iteratorTest () {
//        mySet.add("3");
//        mySet.add("2");
//        mySet.add("3");
//        assertEquals ("3, 2 , 3", mySet.getSize());
//    }

    @Test public void removeTest () {
        mySet.add("3");
        mySet.add("2");
        mySet.add("4");
     mySet.remove(0);
        assertEquals (2, mySet.getSize());
    }

    @Test public void toArrayTest () {
        mySet.add("3");
        mySet.add("2");
        assertEquals ("[3, 2]", Arrays.toString(mySet.toArray()));
    }

}
