package PCQs_03_6_24;
import java.util.Arrays;

public class Ques3 {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,8};
        int target=9;
        findSetsSum(nums ,target,0, new int[nums.length],0);
        //findPairsSum(nums,target);
    } 
    public static void findSetsSum(int[]nums, int target, int startIndex, int[]currentSet, int currentSize){
        if(target ==0){
            System.out.println("Set found: ");
            for(int i=0; i<currentSize; i++){
                System.out.print(currentSet[i] + " ");
            }
            System.out.println();
            return;
        }
        if(target < 0 || startIndex == nums.length) {
            return;
        }
        
        currentSet[currentSize] = nums[startIndex];
        findSetsSum(nums, target - nums[startIndex], startIndex + 1, currentSet, currentSize + 1);
        
        findSetsSum(nums, target, startIndex + 1, currentSet, currentSize);
    }
}
    //     public static void findPairsSum(int[] nums, int target) {
    //    Arrays.sort(nums);

    //     int left = 0;
    //     int right = nums.length - 1;

    //     while (left < right) {
    //         int sum = nums[left] + nums[right];
    //         if (sum == target) {
    //             System.out.println("Pair found: (" + nums[left] + ", " + nums[right] + ")");
    //             left++;
    //             right--;
    //         } else if (sum < target) {
    //             left++;
    //         } else {
    //             right--;
    //         }
    //     }
    // }


