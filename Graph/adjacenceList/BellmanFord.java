package adjacenceList;
import java.util.*;
import adjacenceList.DijkstraAlgorithm.Edge;
public class BellmanFord {

	public static void main(String[] args) {
		int v = 5;
		ArrayList<Edge>graph[] = new ArrayList[v];
		createEdgeList(graph);
		bellman(graph,v);

	}
	private static void bellman(ArrayList<Edge>[] graph,int V) {
		
	//main things is run the loop v-1 times at outer the 1 loop for all vertex and inside that another for getting edges of it
		
	}
	private static void createEdgeList(ArrayList<Edge>[] graph) {
		for(int i = 0; i<graph.length;i++) {
			graph[i] = new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0,2,1));
		graph[0].add(new Edge(0,4,2));
		graph[1].add(new Edge(1,-4,2));
		graph[2].add(new Edge(2,2,3));
		graph[3].add(new Edge(3,4,4));
		graph[4].add(new Edge(4,-1,1));
	}
}
