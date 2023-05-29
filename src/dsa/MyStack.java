package dsa;

public class MyStack {
 private String [] myStack;
 private int size;

 public MyStack() {
     myStack = new String[5];
 }

    public boolean isEmpty() {
     if (size == 0) return true;
     return false;
    }

    public void push(String element) {
     myStack[size] = element;
     size++;
    }

    public String pop() {
     size--;
     return myStack[size];
    }
}
