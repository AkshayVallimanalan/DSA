package algorithms;
import java.util.Random;

public class mergeSort {
  public static void main(String[] args) {

    //Creating and array of random integers
    Random rand = new Random();
    int[] numbers = new int[10];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rand.nextInt(1000000);
    }
    //Debug printing info
    System.out.println("Before:");
    printArray(numbers);
    MergeSort(numbers); 
    System.out.println("\nAfter:");
    printArray(numbers);
  }
  private static void MergeSort(int[] inputArray){
    int n = inputArray.length;
    if(n<2){
        return;
    }
    int mid = n/2;
    int leftsize = mid;
    int rightsize = n-mid;
    int[] leftHalf = new int[leftsize];
    int[] rightHalf = new int[rightsize];

    for(int i=0; i<mid; i++){
        leftHalf[i] = inputArray[i];
    }
    for(int j = mid; j<n; j++){
        rightHalf[j-mid] = inputArray[j];
    }
    MergeSort(leftHalf);
    MergeSort(rightHalf);
    merge(inputArray, leftHalf, rightHalf);
  }

  private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
    int i = 0, j = 0, k = 0;
    int leftsize = leftHalf.length;
    int rightsize = rightHalf.length;
    while (i<leftsize && j<rightsize) {
        if(leftHalf[i]<=rightHalf[j]){
            inputArray[k] = leftHalf[i];
            i++;
        }else{
            inputArray[k] = rightHalf[j];
            j++;
        }
        k++;
    }
    while (i < leftsize) {
        inputArray[k] = leftHalf[i];
        i++;
        k++;
      }
      
      while (j < rightsize) {
        inputArray[k] = rightHalf[j];
        j++;
        k++;
      }
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}