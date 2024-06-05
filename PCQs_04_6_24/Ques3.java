package PCQs_04_6_24;

public class Ques3 {
        public static void rotateR(int[] arr, int n) {
          n = n % arr.length;
          for (int i = 0; i < n; i++) {
            int last = arr[arr.length - 1];

            for (int j = arr.length - 2; j >= 0; j--) {
              arr[j + 1] = arr[j];
            }
            arr[0] = last;
          }
        }
    
        public static void main(String[] args) {
          int[] arr = {1, 2, 3, 4, 5,6,7};
          int rotations = 4; 
      
          System.out.print("Original array: ");
          for (int i : arr) {
            System.out.print(i + " ");
          }
      
          rotateR(arr, rotations);
      
          System.out.println("\nRotated array: ");
          for (int i : arr) {
            System.out.print(i + " ");
          }
        }
    }


