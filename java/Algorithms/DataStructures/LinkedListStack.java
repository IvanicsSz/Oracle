package Algorithms.DataStructures;


import java.util.LinkedList;

public class LinkedListStack {
    private LinkedList<Object> elements = new LinkedList<>();
    public void push(Object o){elements.addFirst(o);}
    public Object pop(){return elements.removeFirst();}
    public Object peek(){return elements.getFirst();}
    public Object size(){return  elements.size();}
    public boolean isEmpty(){
        return elements.isEmpty();
    }


}
