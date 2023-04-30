import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> extends MyArrayList<T>{
    MyArrayList list;
    public MyLinkedListQueue(){
        this.list=new MyArrayList();
    }
    public void enqueue(T item){
        list.add(item,list.size()-1);
    }
    public T dequeue(){
        return (T) list.remove(0);
    }
    public T peek(){
        return (T) list.get(0);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
