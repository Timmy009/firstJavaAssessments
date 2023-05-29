package listToArray;

public class MyList {

    Object [] list;
    private int size;
    private final int INITIAL_CAPACITY = 10;

    public MyList() {
        list = new String[INITIAL_CAPACITY];

    }

    public void add(int index, Object element) {
        if (index == size) {
            resizeArray();
      }
            list[index] = element;
            size++;
    }

    public void add(Object element) {
        list[size] = element;
        size++;
    }

    public void remove(Object element) {
        for (int count = 0; count < list.length; count++) {
            if (list[count] == element) {
                list[count] = null;
                break;
            }
        }
        size--;

    }


    private void resizeArray () {
        Object [] newList = new Object [list.length * 2];
        for (int count = 0; count < newList.length; count++) {
            newList[count] = list[count];
        }
        list = newList;
    }

    public Object getElement(int index) {
        return list[index];

    }

    public void addAll(int index, Object[] arrayTwo) {
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
            size--;
        }


    public void set(int index, Object element) {
        list[index] = element;
    }

    public int indexOf(Object element) {
        for (int count = 0; count < list.length; count++) {
            if (list[count] == element) {
                return count;

            }

        }
        return -1;
    }

    public int lastIndexOf(Object element) {
        for (int count = list.length -1; count >= 0; count--) {
            if (list[count] == element) {
                return count;

            }

        }
        return -1;

    }

    public boolean equalsTo(Object element) {
        for (Object name : list) {
            if (name == element) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object element) {
            for (Object name : list) {
                if (name == element) {
                    return true;
                }
            }
            return false;
    }


}
