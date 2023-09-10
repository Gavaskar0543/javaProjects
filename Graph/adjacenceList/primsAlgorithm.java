package adjacenceList;

import java.util.ArrayList;
import java.util.PriorityQueue;

import adjacenceList.DijkstraAlgorithm.Edge;

public class primsAlgorithm  {
	
	static class Pair implements Comparable<Pair>{
		int node;
		int cost;
		Pair(int n, int c){
			this.node = n;
			this.cost= c;
		}
		@Override
		public int compareTo(Pair c2) {
			return this.cost - c2.cost;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 4;
		ArrayList<Edge>graph[] = new ArrayList[v];
		createEdgeList(graph);
		mstCost(graph,v);

	}
	private static void mstCost(ArrayList<Edge>[] graph, int V) {
  PriorityQueue<Pair>pq = new PriorityQueue<>();
  boolean visited [] = new boolean[V];
  int mstCost = 0;
  pq.add(new Pair(0,0));
  while(!pq.isEmpty()) {
	  Pair curr = pq.remove();
	  if(!visited[curr.node]) {
		  visited[curr.node] = true;
		  //add the cost
		  mstCost+=curr.cost;
		  //to reach the neighobur nodes
		  for(int i = 0; i<graph[curr.node].size();i++) {
			  Edge e = graph[curr.node].get(i);
			  if(!visited[e.dest]) {
				  pq.add(new Pair(e.dest,e.weight));
			  }
		  }
		  
	  }
	
  }
  System.out.println(mstCost);
		
	}
	private static void createEdgeList(ArrayList<Edge>[] graph) {
		for(int i = 0; i<graph.length;i++) {
			graph[i] = new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0,10,1));
		graph[0].add(new Edge(0,15,2));
		graph[0].add(new Edge(0,30,3));
		graph[1].add(new Edge(1,40,3));
		graph[2].add(new Edge(2,50,3));
		
		
	}
}
