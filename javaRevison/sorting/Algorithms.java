package javaRevison.sorting;
import java.lang.reflect.Array;
/*BUBLE SORT - o(n2) */
import java.util.*;
public class Algorithms {
    public static void main(String[] args) {
        int arr[] = {3,1,1,2};
     
      int result[] =  countSort(arr);
      System.out.println(Arrays.toString(result));
        
    }

   private static int[] countSort(int[] arr) {
    //time o(max(Ai,N))
       /*1.max 
        * 2.count array
        3.position
        4.filling
        5.return;
        */
        int max = arr[0];
        for(int i = 1; i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        int count[] = new int [max+1];
        //counting frequency
        for(int i = 0; i<arr.length;i++){
            count[arr[i]]++;

        }
        //positioning
        for(int i = 1;i<arr.length;i++){
            count[i] += count[i-1];

        }
        //output
        int output[] = new int [arr.length];
        for(int i = arr.length-1;i>=0;i--){
            output[--count[arr[i]]] = arr[i];
        }

        for(int i = 0; i<arr.length;i++){
            arr[i] = output[i];

        }


        return arr;

    }

private static int[] quickSort(int[] arr, int low, int high) {

    //o(nlogn)
    if(low < high){
        int pivotIndex = partiction(arr,low,high);

        //swap before and after pivotIndex;
        quickSort(arr, low, pivotIndex-1);
        quickSort(arr, pivotIndex+1, high);
    }
    return arr;
    }
private static int partiction(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low-1;
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Swap arr[i+1] and arr[high] (pivot)
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i+1;
}


private static void insertion(int[] arr) {
    //always keep in mind first element in the insertion sort will be sorted .as you need to assume it
    //o(n2)
    for(int i = 1;i<arr.length;i++){
        int x = arr[i];
        int j = i-1;
        while((j>-1) && arr[j] > x){
            arr[j+1] = arr[j];
            j--;

        }
        arr[j+1] = x;
    }
    System.out.println(Arrays.toString(arr));
    }

private static void selection(int[] arr) {
    //selection sort o(n2)
    for(int i = 0;i<arr.length-1;i++){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int  j = i;j<arr.length;j++){
            if(arr[j] < min){
                min = arr[j];
                minIndex = j;
            }
        }
       int temp = arr[minIndex];
       arr[minIndex] = arr[i];
       arr[i] = temp;

    }
    System.out.println(Arrays.toString(arr));
    }

private static void mergeSort(int[] arr1, int[] arr2) {
    // Divide Step: Dividing the array into smaller subarrays takes O(log n) time, as it repeatedly divides the array in half.
    // Merge Step: Merging two sorted subarrays of length 'n/2' each takes O(n) time.
       
     int m = arr1.length;
     int n = arr2.length;
     int arr[] = new int[m+n];
     int i = 0; 
     int j = 0;
     int k = 0;
     //o(logn)
     while(i <m && j <n){
        if(arr1[i] <= arr2[j]){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        else{
            arr[k] = arr2[j];
            j++;
            k++;
        }
     }
     //o(n)
     while(i < m){
        arr[k] = arr1[i];
        i++;
        k++;
     }
     while(j < n){
        arr[k] = arr2[j];
        j++;
        k++;
     }

     System.out.println(Arrays.toString(arr));
    }


        
    


 private static void bubbleSort(int[] arr) {
        int n = arr.length;
        System.out.println(n);
        int count = 1;
        while(count < n){
            for(int i = 0; i<n-count;i++){
                if(arr[i] > arr[i+1]){
                 swap(arr, i, i+1);
                }
            }
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
                   int temp = arr[i];
                    arr[i]  = arr[j];
                    arr[j] = temp;
    }
}
