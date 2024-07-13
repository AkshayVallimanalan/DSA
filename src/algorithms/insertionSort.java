package algorithms;

public class insertionSort {
    public static void InsertionSort(int[] arr){
        int n = arr.length;
        for(int i =1; i <n; ++i){
            int current = arr[i];
            int j = i-1;

            while(j >=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = current;
        }
    }    
}