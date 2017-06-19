package Algorithms.DataStructures;

public class ArrayStack {

    private int maxSize;
    private long[] stack;
    private int top;


    public ArrayStack(int size){
        maxSize = size;
        stack = new long[maxSize];
        top = -1;
    }

    public void push(long element){
        stack[++top] = element;
    }

    public long pop(){
        return stack[top--];
    }

    public long top(){
        return stack[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }

    public int size(){
        return top+1;
    }
}
