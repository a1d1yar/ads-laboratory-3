import org.junit.Test;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import static org.junit.Assert.*;

public class Main {
    public static void main(String[] args) {


        class MyStackQueueTest {

            @Test
            public void testStack() {
                MyArrayListStack<Integer> stack = new MyArrayListStack<>();
                assertTrue(stack.isEmpty());

                stack.push(1);
                stack.push(2);
                stack.push(3);

                assertEquals(3, stack.size());
                assertEquals(3, (int) stack.peek());
                assertEquals(3, (int) stack.pop());

                assertEquals(2, stack.size());
                assertEquals(2, (int) stack.peek());
                assertEquals(2, (int) stack.pop());

                assertEquals(1, stack.size());
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


    }
}
}