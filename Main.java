import org.junit.Test;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class Main {

    @Test
    public void testStack() {
        MyArrayListStack<Integer> stack = new MyArrayListStack<>();
        assertTrue(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

       // assertEquals(3, stack.size());
        assertEquals(3, (int) stack.peek());
        assertEquals(3, (int) stack.pop());

       // assertEquals(2, stack.size());
        assertEquals(2, (int) stack.peek());
        assertEquals(2, (int) stack.pop());

       // assertEquals(1, stack.size());
        assertEquals(1, (int) stack.peek());
        assertEquals(1, (int) stack.pop());

        assertTrue(stack.isEmpty());

        boolean exceptionThrown = false;
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    @Test
    public void testQueue() {
        MyLinkedListQueue<String> queue = new MyLinkedListQueue<>();
        assertTrue(queue.isEmpty());

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

       // assertEquals(3, queue.size());
        assertEquals("A", queue.peek());
        assertEquals("A", queue.dequeue());

       // assertEquals(2, queue.size());
        assertEquals("B", queue.peek());
        assertEquals("B", queue.dequeue());

       // assertEquals(1, queue.size());
        assertEquals("C", queue.peek());
        assertEquals("C", queue.dequeue());

        assertTrue(queue.isEmpty());

        boolean exceptionThrown = false;
        try {
            queue.dequeue();
        } catch (NoSuchElementException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }
}
