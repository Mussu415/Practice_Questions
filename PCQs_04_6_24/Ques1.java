package PCQs_04_6_24;
import java.util.Arrays;

//finding duplicate and printing it in a new array by removing duplicates 

public class Ques1 {
    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
          return arr;  
        }
        //insertion sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
    
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        int j = 0;  
        for (int i = 0; i < arr.length - 1; i++) {
          if (arr[i] != arr[i + 1]) {
            arr[j++] = arr[i];  
          }
        }
        arr[j++] = arr[arr.length - 1];  
        int[] uniqueArr = new int[j];
        System.arraycopy(arr, 0, uniqueArr, 0, j);  
        return uniqueArr;
      }
      public static void main(String[] args) {
        int[] originalArr = {-1,-1,0,5,1, 2, 2,5, 3, 4, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(originalArr));
        int[] uniqueArr = removeDuplicates(originalArr.clone());
        System.out.println("Unique Elements: " + Arrays.toString(uniqueArr));
    }
}
