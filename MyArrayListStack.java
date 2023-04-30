import java.util.EmptyStackException;

/**
 * A generic implementation of a stack using ArrayList.
 * @param <T> the type of elements held in this stack
 */
public class MyArrayListStack<T> extends MyArrayList {
    MyArrayList<T> list ;

    /**
     * Constructs an empty stack.
     */
    public MyArrayListStack() {
        this.list = new MyArrayList<>();
    }

    /**
     * Pushes an element onto the top of this stack.
     * @param item the element to be pushed onto this stack
     */
    public void push(T item) {
        list.add(item);
    }

    /**
     * Removes and returns the element at the top of this stack.
     * @return the element at the top of this stack
     * @throws EmptyStackException if this stack is empty
     */
    public T pop() throws EmptyStackException {
        if(list.isEmpty())
            throw new EmptyStackException();
        else {
            return (T) list.remove(0);
        }
    }

    /**
     * Returns the element at the top of this stack without removing it.
     * @return the element at the top of this stack
     * @throws EmptyStackException if this stack is empty
     */
    public T peek() throws EmptyStackException {
        if(list.isEmpty())
            throw new EmptyStackException();
        else {
            return (T) list.get(0);
        }
    }

    /**
     * Returns true if this stack contains no elements.
     * @return true if this stack contains no elements, false otherwise
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Returns the number of elements in this stack.
     * @return the number of elements in this stack
     */
    public int size() {
        return list.size();
    }
}
