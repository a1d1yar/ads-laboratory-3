import java.util.EmptyStackException;

public class MyArrayListStack<T> extends MyArrayList {
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
        if(list.isEmpty())
            throw new EmptyStackException();
        else {
            return false;
        }
    }
    public int size(T item){
        return list.size();
    }
}
