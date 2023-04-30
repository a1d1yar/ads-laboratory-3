#  Assignment 3  |  Maratov Aldiyar


##  MyArrayListStack.java


 
 __push()__
>__Description:__ the push method that adds an element to the top of the stack using the add method for MyArrayList.
 
_Code:_
```java
@Override
public void push(T item) {
    list.add(item, 0);
}
```


 __pop()__
>__Description:__ the pop method that removes and returns the top element of the stack using the  remove method for MyArrayList.

_Code:_
```java
@Override
public T pop() {
    return (T) list.remove(0);
}
```
 __peek()__
>__Description:__ the peek method that returns the top element of the stack without removing it using the  get method for MyArrayList.
>
_Code:_
```java
@Override
public T peek() {
    return list.get(0);
}
```
 __isEmpty()__
>__Description:__ the isEmpty method that returns true if the stack is empty or false if it is not using the isEmpty method for  MyArrayList.

_Code:_
```java
@Override
public boolean isEmpty() {
    return list.isEmpty();
}
```
 __size()__
>__Description:__ the size method that returns the number of elements in the stack using the size method for MyArrayList.

_Code:_
```java
@Override
public int size() {
    return list.size();
}
```
##  MyArrayListQueue.java

 
 __enqueue()__
>__Description:__ the enqueue method that adds an element to the back of the queue using the  add method for MyArrayList.


_Code:_
```java
@Override
public void enqueue(T item) {
    list.add(item, 0);
}
```
 __dequeue()__
>__Description:__ the dequeue method that removes and returns the front element of the queue using the  remove method for MyArrayList.


_Code:_
```java
@Override
public T dequeue() {
    return (T) list.remove(list.size()-1);
}
```
 __peek()__
>__Description:__  the peek method that returns the front element of the queue without removing it using the get method for MyArrayList.


_Code:_
```java
@Override
public T peek() {
    return list.get(list.size()-1);
}
```
 __isEmpty()__
>__Description:__ the isEmpty method that returns true if the queue is empty or false if it is not using the isEmpty method for MyArrayList.


_Code:_
```java
@Override
public boolean isEmpty() {
    return list.isEmpty();
}
```
 __size()__
>__Description:__ the size method that returns the number of elements in the queue using the size method for MyLinkedList or MyArrayList.

_Code:_
```java
@Override
public int size() {
    return list.size();
}
```