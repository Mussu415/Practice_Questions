package PCQs_10_6_24;

// Given two arrays of integers a[] and b[] of size n and m, the task is to check if a pair of values (one value from each array) exists such that swapping the elements of the pair will make the sum of two arrays equal.
// Note: Return 1 if there exists any such pair otherwise return -1.
// Example 1:
// Input: n = 6, m = 4, a[] = {4, 1, 2, 1, 1, 2}, b[] = (3, 6, 3, 3)
// Output: 1
// Explanation: Sum of elements in a[] = 11, Sum of elements in b[] = 15, To get same sum from both arrays, we can swap following values: 1 from a[] and 3 from b[]

public class Ques1 {
    //to find sum of an array
    private static int arraySum(int[] array){
        int sum =0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }
    //checking if pair exists
    public static int swapToEqual(int[] a, int[] b){
        int sumA = arraySum(a);
        int sumB = arraySum(b);

        int difference = sumA-sumB;

        //if odd difference
        if(difference % 2 != 0){
            return -1;
        }

        //checking for each pair 
        for(int i = 0; i < a.length; i++){
            for (int j =0; j < b.length; j++){
                //Calculation of new sum if value swap
                int newSumA = sumA - a[i] + b[j];
                int newSumB = sumB -b[j] + a[i];
                
                //to check new sums are equal
                if (newSumA == newSumB){
                    return 1;
                }
            }
        }
        //if no pair found
        return -1;
    }
    public static void main(String[] args) {
        int[] a= {4, 1, 2, 1, 1, 2};
        int[] b= {3, 6, 3, 3};
        int result = swapToEqual(a, b);
        System.out.println("Result | 1 | indicates pair found and | -1 | indicates no pair found");
        System.out.println("Result: " + result);
    }
}
