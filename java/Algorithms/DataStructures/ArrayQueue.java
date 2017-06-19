package Algorithms.DataStructures;


import java.util.NoSuchElementException;

public class ArrayQueue {
    private Object[] array;
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity){
        array = new Object[capacity];
    }

    public void enqueue(Object o){
        if (size >= array.length) {
            throw new IllegalStateException();
        }
        array[tail] = o;
        tail = (tail + 1) % array.length;
        System.out.println("tail = " + tail);
        size++;
    }

    public Object dequeue(){
        if (size == 0)
            throw new NoSuchElementException();
        Object item = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        System.out.println("head = " + head);
        size--;
        return item;
    }

    public Object peek(){
        if (size == 0)
            throw new NoSuchElementException();
        return array[size-1];

    }

    public boolean isEmpty(){
        return (size ==0);

    }
    public int size(){
        return size;

    }
}
