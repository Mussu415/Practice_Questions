package PCQs_03_6_24;
import java.util.Arrays;

// finding sets for the target sum 
public class Ques3 {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,8};
        int target=9;
        System.out.println("The target sum is: "+ target);
        findSetsSum(nums ,target);
        //findPairsSum(nums,target);
    } 
    public static void findSetsSum(int[]nums, int target){
        findSets(nums, target,0,new int[nums.length],0);
    }
    public static void findSets(int[] nums, int target, int index, int[] currentSet, int setSize){
        if(target ==0){
            printSet(currentSet, setSize);
            return;
        }  
        
        if(target < 0 || index== nums.length) {
            return;
        }
        
        //Include the current element
        currentSet[setSize] = nums[index];
        findSets(nums, target - nums[index], index + 1, currentSet, setSize + 1);
        
        //exclude the current element
        findSets(nums, target, index + 1, currentSet, setSize);
    }
    public static void printSet(int[] currentSet, int setSize){
        System.out.print("Set Found: ");
        for(int i=0; i<setSize;i++){
            System.out.print(currentSet[i] + " ");
        }
        System.out.println();
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


