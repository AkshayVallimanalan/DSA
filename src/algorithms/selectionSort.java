package algorithms;

public class selectionSort {   
    public static void SelectionSort(int[] nums){
        int n = nums.length;
        for(int i =0; i <n; i++){
            int minInd = i;
            for(int j =i+1; j<n; j++){
                if(nums[j] < nums[minInd]){
                    minInd = j;
                }
            }
            int temp = nums[minInd];
            nums[minInd] = nums[i];
            nums[i] = temp;
        }
    }
}