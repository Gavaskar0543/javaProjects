package adjacenceList;
import java.util.*;
import adjacenceList.DijkstraAlgorithm.Edge;
public class BellmanFord {

	public static void main(String[] args) {
		int v = 5;
		ArrayList<Edge>graph[] = new ArrayList[v];
		createEdgeList(graph);
		bellman(graph,v,0);

	}
	private static void bellman(ArrayList<Edge>[] graph,int V,int src) {
		
	//main things is run the loop v-1 times at outer the 1 loop for all vertex and inside that another for getting edges of it
		int distance [] = new int [V];
		//mark expect the src then other to max value;
		for(int i = 0; i<V;i++) {
			if(i != src) {
				distance[i] = Integer.MAX_VALUE;
			}
		}
		//outer main loop for no.of iteration based on the vertex on that graph
		for(int i = 0;i<V-1;i++) {
			//for each vertex from this the inner loop gets its edges
			for(int k = 0; k<V;k++) {
				
				for(int b = 0; b<graph[k].size();b++) {
					Edge e = graph[k].get(b);
					int u = e.src;
					int v = e.dest;
					if(distance[u] != Integer.MAX_VALUE && distance[u]+e.weight < distance[v]) {
						distance[v] = distance[u]+e.weight;
					}
					
				}
				
			}
		}
		for(int i = 0;i<distance.length;i++) {
			System.out.print(distance[i]+" ");
		}
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
