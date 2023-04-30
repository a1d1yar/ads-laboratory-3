import java.util.EmptyStackException;

public class MyArrayListStack<T> extends MyArrayList {
    private T[] arr;
    private int size;
    MyArrayList<T> list ;
    public MyArrayListStack() {
        this.list = new MyArrayList<>();
    }
    public void push(T item) {
        list.add(item);

    }
    public T pop(){
        return (T) list.remove(0);
    }
    public T peek(){
        return (T) list.get(0);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
