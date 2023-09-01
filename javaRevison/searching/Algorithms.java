class Algorithms{
    public static void main(String[] args) {
        int arr[] = {1,2,3,6};
       // linearSearch(arr,3);
       binarySearch(arr,3);
    }

    private static void binarySearch(int[] arr, int i) {
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == i){
                System.out.println(mid);
                return ;
            }
        else if(arr[mid] > i){
            end=mid-1;
        }
        else{
            start= start+1;
        }
        }
        System.out.println("no element found");
    }

    private static void linearSearch(int[] arr, int i) {
        for(int j = 0; j<arr.length;j++){
            if(arr[j] == i){
                System.out.println(true);
                return;
            }
           
        }
         System.out.println(false);
    }
}