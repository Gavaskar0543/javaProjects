package Railways;

import java.util.Scanner;

public class metro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // ask for vertex;
        System.out.println("Enter no.of Vertex:");
        int vertex = s.nextInt();
        // edges
        System.out.println("Enter no.of edges");
        int edges = s.nextInt();
        // 2d array
        int graph[][] = new int[vertex][vertex];
        for (int i = 0; i < edges; i++) {
            System.out.println("enter vertex v1");
            int v1 = s.nextInt();
            System.out.println("enter vertex v2");
            int v2 = s.nextInt();
            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        s.close();
    }
}