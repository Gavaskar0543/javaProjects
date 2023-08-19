package Railways;

public class GraphTest {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(1,2);
        g.addEdge(1,3);
       // g.bfs(0);
       g.dfs(0);
    }
}
