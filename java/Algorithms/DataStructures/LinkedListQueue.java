package Algorithms.DataStructures;

import java.util.LinkedList;

public class LinkedListQueue {
    private LinkedList<Object> linkedList = new LinkedList<>();
    private void enqueue(Object o) {linkedList.addLast(o);}
    private Object dequeue(){return linkedList.removeFirst();}
    private Object peek(){return linkedList.getFirst();}
    private int size(){return linkedList.size();}
    private boolean isEmpty(){return (linkedList.isEmpty());}
}
