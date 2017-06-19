package Algorithms.Graphs.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

   public void bfs(Vertex root){
       Queue<Vertex> queue = new LinkedList<>();
       root.setVisited(true);
       queue.add(root);
       while(!queue.isEmpty()){
           Vertex tmp = queue.remove();
           System.out.print(tmp);
           for (Vertex v : tmp.getNeighbours()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
           }
       }
   }
}
