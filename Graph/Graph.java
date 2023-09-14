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
    public void printPaths(int src,int des){
        boolean visited [] = new boolean[arrayList.size()];
        visited[src] = true;
        String path = ""+src;
        printHelper(arrayList,src,des,path,visited);

    }
    private void printHelper(ArrayList<ArrayList<Integer>> arrayList2, int src, int des, String path,
            boolean[] visited) {
                if(src == des){
                    System.out.println(path);
                    return;
                }
                for(int i = 0; i<arrayList2.get(src).size();i++){
                    int av = arrayList2.get(src).get(i);
                    if(!visited[av]){
                        visited[av] = true;
                        printHelper(arrayList2,av,des,path+av,visited);
                        visited[av] = false;
                    }
                }
    }
  

}
