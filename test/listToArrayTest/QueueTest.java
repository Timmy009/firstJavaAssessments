package listToArrayTest;

import listToArray.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue queue;

    @BeforeEach public void startWith () {
        queue = new Queue();
    }


    @Test public void addNotMOreThanTheLengthTest () {
        queue.add("3");
        queue.add("3");
        queue.add("3");
        queue.add("3");
        assertTrue (queue.add("7"));
    }
    @Test public void offerTest () {
        queue.add("3");
        queue.add("3");
        queue.add("3");
        queue.add("3");
        assertTrue (queue.offer("7"));
    }

    @Test public void removeTest () {
        queue.add("4");
        queue.add("6");
        queue.add("8");
        queue.add("3");
        assertEquals ("4", queue.remove());
    }

    @Test public void pollTest () {
        queue.add("4");
        queue.add("6");
        queue.add("8");
        queue.add("3");
        assertEquals ("4", queue.poll());
    }
    @Test public void elementTest () {
        queue.add("4");
        queue.add("6");
        queue.add("8");
        queue.add("3");
        assertEquals ("4", queue.element());
    }

    @Test public void peekTest () {
        queue.add("4");
        queue.add("6");
        queue.add("8");
        queue.add("3");
        assertEquals ("4", queue.peek());
    }

}
