package Algorithms.Graphs.DFS;

public class DfsMain {

    public static void main(String[] args) {
    DepthFirstSearch  dfs = new DepthFirstSearch();

    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);

        node1.addNode(node2);
        node1.addNode(node3);
        node2.addNode(node4);
        node4.addNode(node5);

        dfs.dfs(node1);

    }





}
