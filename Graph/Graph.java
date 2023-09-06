import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>>arrayList = new ArrayList<>();
    public Graph(int v){
        for(int i = 0; i<v;i++){
            arrayList.add(new ArrayList<>());
        }
    }
    //add edges
    public void addEdge(int u,int v){
        arrayList.get(u).add(v);
        arrayList.get(v).add(u);
    }
    //print edges that associated with the respected vertex
    public void printList(){
        for(int i = 0; i<arrayList.size();i++){
            System.out.println("Vertex of:"+" "+i);
            for(int j = 0; j<arrayList.get(i).size();j++){
                System.out.println(arrayList.get(i).get(j));
            }

        }
    }


}
