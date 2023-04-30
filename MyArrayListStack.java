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
}
