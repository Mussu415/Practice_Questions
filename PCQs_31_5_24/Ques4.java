package PCQs_31_5_24;


//Dutch national flag prblm 
public class Ques4 {
    void sortColours(int [] nums){
        int start = 0;
        int end = 0;
        int mid=nums.length - 1;
        while(mid <= end){
            switch (nums[mid]){
             case 0:
                swap(nums, start, mid);
                start++;
                mid++;
                break;

             case 1:
                mid++;
                break;

             case 2:
                swap(nums, mid, end);
                end--;
                break;
            }
        }
    }
    private void swap(int[] arr, int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
    public static void main(String[] args) {
        Ques4 solution = new Ques4();
        int[] nums1 = {2,0,2,1,1,0};
        solution.sortColours(nums1);
        System.out.print("Sorted array: ");
        for(int num : nums1){
            System.out.print(num + " ");
        }
        System.out.println();
        
        int[] nums2 = {2,0,1};
        solution.sortColours(nums2);
        System.out.print("Sorted array: ");
        for(int num: nums2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums3= {0,1,2,0,1,2};
        solution.sortColours(nums3);
        System.out.print("Sorted array: ");
        for(int num : nums3){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
