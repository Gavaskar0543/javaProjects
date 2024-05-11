import java.util.LinkedList;
import java.util.Queue;

public class practice {
    public static void main(String[] args) {
       int OrangeBox [][] = {{2,1,1},{1,1,0},{0,1,1}};
       int minutesForRotten = rottenOrange(OrangeBox);
    }
    public static int rottenOrange(int OrangeBox[][]){
        //get colum and row from box
        //create a queue for adding rotten orange index
        //count the fresh orange
        int row =  OrangeBox.length;
        int col = OrangeBox[0].length;
        Queue<int[]>queue = new LinkedList<>();
        //loop to travers over the rows and columns to get the count of rotten oranges
        //and get count fresh oranges
        int freshOranges = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(OrangeBox[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }
                else if(OrangeBox[i][j] == 1){
                  freshOranges++;
                }
            }
        }
        //if freshOranges == 0 return 0;
       if(freshOranges == 0){
        return 0;
       }
       //minute calculation
       int count = 0;
       //possible directions
       int dirs[][] = {{1,0},{-1,0},{0,1},{0,-1}};
       while(!queue.isEmpty()){
        ++count;
     
        //search all four direction
       
        
       }
        return 0;
    }
}
