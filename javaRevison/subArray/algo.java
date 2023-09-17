package javaRevison.subArray;

import java.util.ArrayList;

public class algo {
    public static void main(String[] args) {
      int arr[] ={12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50}; int m = 7 ;
      ArrayList<ArrayList<Integer>>list = new ArrayList<>();
      
      for(int i = 0; i<arr.length;i++){
        if(i+m > arr.length){
            break;
        }
        ArrayList<Integer>newList = new ArrayList<>();
        for(int j = i;j<i+m;j++){
            System.out.print(arr[j]+" ");
      newList.add(arr[j]);
        }
        list.add(newList);
        System.out.println();
   
      }
 int totalMin = Integer.MAX_VALUE;
   for(int i = 0;i<list.size();i++){
     int min =  findmin(list.get(i));
     totalMin = Math.min(totalMin,min);
   }
   System.out.println(totalMin);
    }

    private static int findmin(ArrayList<Integer> arrayList) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arrayList.size();i++){
            if(arrayList.get(i) > max){
                max = arrayList.get(i);
            }
            if(arrayList.get(i)<min){
                min = arrayList.get(i);
            }
        }
   int finalMin = max - min;
        return finalMin;
    }
}
