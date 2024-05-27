package PCQs_27_5_24;

import java.util.Arrays;

//Sum of elements array 
public class Ques8 {
    public static void main(String[] args) {
        int arr[]= {5,8,9,0,3,2};
        int sum=0;
        for(int i=0; i<=arr.length-1; i++){
            sum = sum+arr[i];
        }
        System.out.println("The Array is: "+ Arrays.toString(arr));
        System.out.println("Sum of array elements:"+ sum);
    }
}
