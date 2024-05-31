package PCQs_30_5_24;

import java.util.Arrays;

//3rd minimum 
public class Ques1 {
    public static void main(String[] args) {
        int arr[]={-7,-1,0,8,5,-8,-9,-1,-2,-7};
        int low1=Integer.MAX_VALUE;
        int low2=Integer.MAX_VALUE;
        int low3=Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i]<low1){
                low3=low2;
                low2=low1;
                low1=arr[i];
            }
            else if(arr[i]<low2 && arr[i] != low1){
                low3=low2;
                low2=arr[i];
            }
            else if (arr[i]<low3 && arr[i] != low1 && arr[i] != low2){
                low3= arr[i];
            }
        }
        System.out.println("The array is: "+ Arrays.toString(arr));
        System.out.println("The 3 lowest values are: \nValue 1:" + low1 + "\nValue 2:"+ low2 + "\nValue 3:" + low3);
        System.out.println("The 3rd lowest value is:" + low3);
    }
}

