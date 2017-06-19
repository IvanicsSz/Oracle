package Algorithms.Graphs.BFS;

public class BfsMain {
    public static void main(String[] args) {
        BreadthFirstSearch bfs = new BreadthFirstSearch();

        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);

        vertex1.addVortex(vertex2);
        vertex1.addVortex(vertex4);
        vertex4.addVortex(vertex5);
        vertex2.addVortex(vertex3);

        bfs.bfs(vertex1);

    }
}
