package DSAtest;

import dsa.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
   private MyStack stack;

    @BeforeEach
    public void startWith () {
        stack = new MyStack();
    }
    @Test public void stackNotNull() {
        assertNotNull(stack);
    }

    @Test public void isEmptyTest () {
        assertTrue(stack.isEmpty());

    }
    @Test public void pushAndCheckIfStillEmptyTest () {
        stack.push("Timmy");
        assertFalse(stack.isEmpty());
    }
    @Test public void pushAndPopAndCheckIfEmpty () {
        stack.push("Timmy");
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test public void pushTwiceAndPopAndCheckIfEmpty () {
        stack.push("Timmy");
        stack.push("Torin");
        stack.pop();
        assertFalse(stack.isEmpty());
    }
    @Test public void ppopTest () {
        stack.push("Timmy");
        stack.push("Torin");
        assertEquals("Torin", stack.pop());
    }
}
