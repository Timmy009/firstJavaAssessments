package listProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyList<E> {
    Object [] list;
   private final int defaultCapacity = 10;
   private int size;

    public MyList() {;
        list = new String[defaultCapacity];
    }
   
    public void add(int index, String element) {
        list[index] = element;
    }
    public String getElement(int element) {
        return list[element];
    }
    public int listSize() {
        return list.length;
    }

    public void addCollection(int index, Collection collection) {
        list[index] = collection.toString();

    }
    public int clearElement() {
        Arrays.fill(list, null);
        return size = 0;
    }
}
