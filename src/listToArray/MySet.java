package listToArray;

import java.util.ArrayList;

public class MySet {


    private MyList myList = new MyList();



    public void add(Object element) {
            if (!myList.contains(element)) {
                myList.add(element);
            }


    }

//    public ArrayList<Object> iterator () {
//        return myList;
//    }

    public void clear () {
        myList.clear();

    }

//    public String iterator () {
//        for (int count = 0; count < myList.getSize(); count++) {
//
//        }
//    }

//    private void resizeArray () {
//        Object [] newList = new Object[.length * 2];
//        for (int count = 0; count < newList.length; count++) {
//            newList[count] = list[count];
//        }
//        list = newList;
//    }
//
//    public Object getElement(int index) {
//        return list[index];
//
//    }
//
//    public void addAll(int index, String[] arrayTwo) {
//        for (int count = index; count < list.length; count++) {
//            add(count, arrayTwo[count]);
//        }
//    }
//
    public int getSize() {
        return myList.getSize();
    }

    public boolean contains (Object element){
       if (myList.contains(element)) {
           return true;
       }
       return false;
    }
//
    public void remove(int index) {
        myList.remove(index);
    }

    public Object[] toArray () {
        Object [] arr = new Object[myList.getSize()];
        for (int count = 0; count < arr.length; count++) {
            arr[count] = myList.getElement(count);
        }
        return arr;
    }
//
//
//    public void set(int index, String element) {
//        list[index] = element;
//    }
//
//    public int indexOf(String element) {
//        for (int count = 0; count < list.length; count++) {
//            if (list[count] == element) {
//                return count;
//
//            }
//
//        }
//        return -1;
//    }
//
//    public int lastIndexOf(String element) {
//        for (int count = list.length -1; count >= 0; count--) {
//            if (list[count] == element) {
//                return count;
//
//            }
//
//        }
//        return -1;
//
//    }
//
//    public boolean equalsTo(String element) {
//        for (Object name : list) {
//            if (name == element) {
//                return true;
//            }
//        }
//        return false;
//    }
//
    public boolean isEmpty() {
        return myList.isEmpty();
    }
//
//    public boolean contains(Object element) {
//        for (Object name : list) {
//            if (name == element) {
//                return true;
//            }
//        }
//        return false;
//    }

}
