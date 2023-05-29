package listToArray;

import java.util.NoSuchElementException;

public class Queue {


    Object [] arrays = new Object[5];
    private int addingSize;
    private int removeSize;

    public boolean add (Object element) {
        if (addingSize < arrays.length) {
            arrays[addingSize] = element;
            addingSize++;
            return true;
        }
        throw new IllegalStateException();
    }

    public boolean offer (Object element) {
        if (addingSize < arrays.length) {
            arrays[addingSize] = element;
            addingSize++;
            return true;
        }
        throw new IllegalArgumentException();
    }
    public Object remove () {
        Object [] newArray = new Object[addingSize];
        Object removeElement = arrays[removeSize];
        if (addingSize != 0) {
        for (int count = 0; count < newArray.length; count++) {
            newArray[count] = arrays[count];
        }
        for (int countTwo = 1; countTwo < newArray.length; countTwo++) {
            arrays[countTwo] = newArray[countTwo];
        }

        addingSize--;
        return removeElement;
    }
    else {
        throw new NoSuchElementException();
        }
    }

    public Object poll () {
        Object [] newArray = new Object[addingSize];
        Object removeElement = arrays[removeSize];
        if (addingSize != 0) {
            for (int count = 0; count < newArray.length; count++) {
                newArray[count] = arrays[count];
            }
            for (int countTwo = 1; countTwo < newArray.length; countTwo++) {
                arrays[countTwo] = newArray[countTwo];
            }
            addingSize--;
            return removeElement;
        }
        else {
            return null;
        }
    }
    public Object element () {
        if (addingSize != 0) return arrays[removeSize];
        throw new NoSuchElementException();

    }

    public Object peek () {
        if (addingSize != 0) return arrays[removeSize];
       return null;
    }
}
