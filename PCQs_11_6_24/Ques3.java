package PCQs_11_6_24;

public class Ques3 {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        
        System.out.println("Input array:");
        printArray(arr);
        
        rearrange(arr);
        
        System.out.println("\nOutput array:");
        printArray(arr);
    }
    
    public static void rearrange(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Find first positive number at even index
                if (arr[i] >= 0) {
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] < 0) {
                            rotateRight(arr, i, j);
                            break;
                        }
                    }
                }
            } else {
                // Find first negative number at odd index
                if (arr[i] < 0) {
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] >= 0) {
                            rotateRight(arr, i, j);
                            break;
                        }
                    }
                }
            }
        }
    }
    
    public static void rotateRight(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
