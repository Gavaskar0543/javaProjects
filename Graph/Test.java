public class Test {
    public static void main(String[] args) {
       Graph graph = new Graph(5);
       graph.addEdge(0,1);
       graph.addEdge(0,4);
       graph.addEdge(4,1);
       graph.addEdge(4,3);
       graph.addEdge(1,3);
       graph.addEdge(1,2);
       graph.addEdge(3,2);
       graph.printList();
    }
}
