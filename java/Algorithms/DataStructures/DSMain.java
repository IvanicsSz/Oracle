package Algorithms.DataStructures;


public class DSMain {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(20);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(22);
        arrayQueue.enqueue(5);
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
    }
}
