package Railways;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<ArrayList<Integer>>adjList = new ArrayList<>();

    public Graph(int V){
        for(int i = 0; i<V;i++){
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int U, int V){
        adjList.get(U).add(V);
        adjList.get(V).add(U);
    }
    public void printAdjList(){
        for(int i = 0; i<adjList.size();i++){
            System.out.println("adj list of vertex"+" "+i);
            for(int j = 0; j<adjList.get(i).size();j++){
                System.out.println(adjList.get(i).get(j));
            }
            System.out.println();
        }
    }
    public void bfs(int v){
        int V = adjList.size();
        boolean[] visited = new boolean[V];
        visited[v] = true;
        Queue<Integer>pendingVertex =new LinkedList<>();
        pendingVertex.add(v);
        while(!pendingVertex.isEmpty()){
            int vertex = pendingVertex.poll();
            System.out.println("vertex visited:"+""+vertex);
            for(int i =0;i<adjList.get(vertex).size();i++){
                int av = adjList.get(vertex).get(i);
                if(!visited[av]){
                    pendingVertex.add(av);
                    visited[av] = true;
                }
            }
        }
        

    }
}
