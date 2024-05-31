package PCQs_30_5_24;

import java.util.Arrays;

//third maximum element
public class Ques8 {
    public static void main(String[] args) {
        int arr[]={-7,-1,0,8,5,-8,-9,-1,-2,-7};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && arr[i] != max1){
                max3=max2;
                max2=arr[i];
            }
            else if (arr[i]>max3 && arr[i] != max1 && arr[i] != max2){
                max3= arr[i];
            }
        }
        System.out.println("The array is: "+ Arrays.toString(arr));
        System.out.println("The 3 maximum values are: \nValue 1:" + max1 + "\nValue 2:"+ max2 + "\nValue 3:" + max3);
        System.out.println("The 3rd maximum value is:" + max3);
    }
}
