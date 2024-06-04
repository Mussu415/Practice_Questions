package PCQs_04_6_24;

//to arrays equal 
public class Ques2 {
    public static boolean areEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
          return false;
        }
      
        for (int element : arr1) {
          boolean found = false;
          for (int value : arr2) {
            if (element == value) {
              found = true;
              break;
            }
          }
          if (!found) {
            return false;
          }
        }
      
        return true;
      }
      public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 1, 3, 8};
    
        if (areEqual(arr1, arr2)) {
          System.out.println("Arrays are equal!");
        } else {
          System.out.println("Arrays are not equal.");
        }
      }
    }      

