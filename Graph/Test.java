public class Test {
    public static void main(String[] args) {
       Graph graph = new Graph(3);
       graph.addEdge(0,1);
       graph.addEdge(0,2);
       graph.addEdge(1, 2);
       graph.printList();
    }
}
