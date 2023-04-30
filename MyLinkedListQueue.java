import java.util.NoSuchElementException;

/**
 * A generic implementation of a queue using ArrayList.
 * @param <T> the type of elements held in this queue
 */
public class MyLinkedListQueue<T> extends MyArrayList<T> {
    MyArrayList<T> list;

    /**
     * Constructs an empty queue.
     */
    public MyLinkedListQueue() {
        this.list = new MyArrayList<>();
    }

    /**
     * Inserts the specified element into this queue.
     * @param item the element to add
     */
    public void enqueue(T item) {
        list.add(item, list.size() - 1);
    }

    /**
     * Retrieves and removes the head of this queue.
     * @return the head of this queue
     * @throws NoSuchElementException if this queue is empty
     */
    public T dequeue() throws NoSuchElementException {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return (T) list.remove(0);
        }
    }

    /**
     * Retrieves, but does not remove, the head of this queue.
     * @return the head of this queue
     * @throws NoSuchElementException if this queue is empty
     */
    public T peek() throws NoSuchElementException {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return (T) list.get(0);
        }
    }

    /**
     * Returns true if this queue contains no elements.
     * @return true if this queue contains no elements, false otherwise
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Returns the number of elements in this queue.
     * @return the number of elements in this queue
     */
    public int size() {
        return list.size();
    }
}
