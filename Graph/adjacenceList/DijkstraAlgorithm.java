package adjacenceList;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
	static class pair  implements Comparable<pair>{
		int node;
		int dist;
		public pair(int n,int d) {
			this.node = n;
			this.dist = d;
		}
		@Override
		public int compareTo(pair p2) {
			return this.dist - p2.dist;
		}
	}
  static class Edge{
	  int src;
	  int weight;
	  int dest;
	  public Edge(int s, int w, int d) {
		  this.src = s;
		  this.weight = w;
		  this.dest = d;
	  }
  }
  public static void main(String[] args) {
	  int v = 6;
	ArrayList<Edge>graph[] = new ArrayList[v];
	createEdgeList(graph);
	
	//dijkstra
	/*main rule
	 * 1.must not visited
	 * 2.shortest distance on weight calculation*/
	dijkstraAlog(graph,0,v);

}
  /* Timecomplexity o(E ElogV)*/
private static void dijkstraAlog(ArrayList<Edge>[] graph,int src ,int V) {
	PriorityQueue<pair>pq = new PriorityQueue<pair>();
	//intial pair
	pq.add(new pair(0,0));
	//distance track array
	int distance[] = new int [V];
	for(int i = 0;i<graph.length;i++) {
		if(i != src) {
			distance[i] = Integer.MAX_VALUE;
		}
	}
	boolean visited[] = new boolean[V];
	while(!pq.isEmpty()) {
		pair curr = pq.remove();
		if(!visited[curr.node]) {
			visited[curr.node] = true;
			for(int i = 0;i<graph[curr.node].size();i++) {
				Edge e = graph[curr.node].get(i);
				int u = e.src;
				int v = e.dest;
				//relaxation main step
				if(distance[u]+e.weight < distance[v]) {
					distance[v] = distance[u]+e.weight;
					pq.add(new pair(v,distance[v]));
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
	graph[1].add(new Edge(1,1,2));
	graph[1].add(new Edge(1,7,3));
	graph[2].add(new Edge(2,3,4));
	graph[3].add(new Edge(3,1,5));
	graph[4].add(new Edge(4,2,3));
	graph[4].add(new Edge(4,5,5));
	
}
}
