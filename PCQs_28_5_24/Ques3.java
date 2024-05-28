package PCQs_28_5_24;
// to find the largest element from the array 

class Ques3 {

    public static void main(String[] args) {
      int[] arr = {5, 8, 9, 10, 13, 2, 13};
      int largest = arr[0];
  
      for (int element : arr) {
        if (element > largest) {
          largest = element;
        }
      }
  
      System.out.println("Largest element in the array: " + largest);
    }
  }
  