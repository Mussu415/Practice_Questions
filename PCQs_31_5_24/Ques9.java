package PCQs_31_5_24;
import java.util.Arrays;

public class Ques9 {

    //using brute force 
    int[] twoSum(int[] nums, int target){
        for (int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]+nums[j] == target)
                return new int[]{i,j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    // using array sort 
    int[] twoSumSorting(int[] nums, int target){
        int[] copyArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyArray);

        int head=0;
        int tail= copyArray.length-1;
        int num1 = 0, num2 = 0;
        while(head<tail){
            int sum = copyArray[head]+ copyArray[tail];
            if(sum<target){
                head++;
            }
            else if(sum>target){
                tail--;
            }
            else{
                num1 =copyArray[head];
                num2 =copyArray[tail];
                break;
            }
        }

        // result array for indices
        int[] result = new int[2];
        for(int i =0; i<nums.length; i++){
            if(nums[i] == num1) result[0]=i;
            if(nums[i] == num2) result[1]=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Ques9 solution = new Ques9();
        int[] nums= {2,7,11,15};
        int target=9;
        System.out.println("Using brute force method: ");
        try {
            int[] resultBruteForce = solution.twoSum(nums, target);
            System.out.println("Indices: "+ Arrays.toString(resultBruteForce));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Using sorting method: ");
        try {
            int[] resultSorting = solution.twoSum(nums, target);
            System.out.println("Indices: "+Arrays.toString(resultSorting));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
