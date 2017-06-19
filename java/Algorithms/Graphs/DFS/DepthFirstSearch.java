package Algorithms.Graphs.DFS;

public class DepthFirstSearch {

    public void dfs (Node root){
        root.setVisited(true);
        System.out.println(root);

        for (Node node : root.getNeighbour()) {
            if(!node.isVisited()){
                dfs(node);
            }
        }
    }
}
