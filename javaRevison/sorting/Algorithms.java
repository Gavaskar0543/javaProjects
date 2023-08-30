package javaRevison.sorting;
import java.lang.reflect.Array;
/*BUBLE SORT - o(n2) */
import java.util.*;
public class Algorithms {
    public static void main(String[] args) {
      int arr[] = {3,1,2};
      insertion(arr);
        
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
