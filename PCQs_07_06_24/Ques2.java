package PCQs_07_06_24;

//Binary Search
public class Ques2 {
    public static int search(int[] arr, int target){
        int left =0;
        int right =arr.length-1;

        while(left <= right){
            int mid = left +(right-left)/2;

            if (arr[mid]==target){
                return mid;
            } else if(arr[mid]<target){
                left =mid+1;
            } else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,7,8,9,10,11,12};
        int target = 14;
        int index = search(arr, target);

        if(index==-1){
            System.out.println(target + " is not found in the array.");
        } else{
            System.out.println(target + " is found at index "+ index);
        }
    }
}
