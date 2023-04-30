import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> extends MyArrayList<T>{
    MyArrayList list;
    public MyLinkedListQueue(){
        this.list=new MyArrayList();
    }
    public void enqueue(T item){
        list.add(item,list.size()-1);
    }
}
