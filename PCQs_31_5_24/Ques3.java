package PCQs_31_5_24;

// finding duplicate number in an array 
public class Ques3 {
    public int findDuplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while (slow != fast);
        int ptr1 = nums[0];
        int ptr2 = slow;
        while (ptr1 != ptr2){
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }
    public static void main(String[] args) {
        Ques3 solution = new Ques3();
        int[] nums1 = {1,3,4,2,2};
        int[] nums2 = {3,1,3,4,2};
        int[] nums3 = {3,3,3,3,3};
        System.out.println(solution.findDuplicate(nums1));
        System.out.println(solution.findDuplicate(nums2));
        System.out.println(solution.findDuplicate(nums3));

    }
}

