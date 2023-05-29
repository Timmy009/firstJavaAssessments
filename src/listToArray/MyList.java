package listToArray;

import java.util.ArrayList;

public class MyList {

    String [] list;
    private int size;
    private final int INITIAL_CAPACITY = 10;

    public MyList() {
        list = new String[INITIAL_CAPACITY];
        ArrayList <Integer> arr = new ArrayList<>();

    }

    public void add(int index, String element) {
        if (index == size) {
            resizeArray();
      }
            list[index] = element;
            size++;
    }


    private void resizeArray () {
        String [] newList = new String[list.length * 2];
        for (int count = 0; count < newList.length; count++) {
            newList[count] = list[count];
        }
        list = newList;
    }

    public String getElement(int index) {
        return list[index];

    }

    public void addAll(int index, String[] arrayTwo) {
       for (int count = index; count < list.length; count++) {
            add(count, arrayTwo[count]);
        }
    }

    public int getSize() {
        return size;
    }

    public int clear() {
        for (int count = 0; count < list.length; count++) {
            list[count] = null;
        }
        return size = 0;
    }

    public void remove(int index) {
            list[index] = null;
        }


    public void set(int index, String element) {
        list[index] = element;
    }

    public int indexOf(String element) {
        for (int count = 0; count < list.length; count++) {
            if (list[count] == element) {
                return count;

            }

        }
        return -1;
    }

    public int lastIndexOf(String element) {
        for (int count = list.length -1; count >= 0; count--) {
            if (list[count] == element) {
                return count;

            }

        }
        return -1;

    }

    public boolean equalsTo(String element) {
        for (String name : list) {
            if (name == element) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(String element) {
            for (String name : list) {
                if (name == element) {
                    return true;
                }
            }
            return false;
    }


}
