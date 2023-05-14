package chapterSeven;

import java.util.ArrayList;

public class Fibonacci {





    public String getFibonaci(int lenght) {
        ArrayList <Integer> myList = new ArrayList<>();

        System.out.println(myList);
        myList.add(0, 0);
        myList.add(1, 1);
        for (int count = 2; count < lenght; count++) {
            myList.add(count,
                    myList.get(count - 2) + myList.get(count - 1));
        }
        return myList.toString();
    }
}
