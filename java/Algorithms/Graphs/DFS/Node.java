package Algorithms.Graphs.DFS;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private int data;
    private List<Node> neighbour;
    private boolean visited;

    public Node(int data) {
        this.data = data;
        neighbour = new ArrayList<>();
    }

    public void addNode(Node node){
        neighbour.add(node);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public List<Node> getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(List<Node> neighbour) {
        this.neighbour = neighbour;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
