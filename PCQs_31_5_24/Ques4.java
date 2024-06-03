package PCQs_31_5_24;


//Dutch national flag prblm 
public class Ques4 {
    void sortColours(int [] nums){
    
        int start = 0;
        int end =nums.length - 1;
        int mid=0;
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
        int[] nums1 = {0,1,1,0,2,1,0,2,2};
        solution.sortColours(nums1);
        System.out.print("Sorted array: ");
        boolean zero=false,one=false,two=false;
        for(int num : nums1){
            if(num==0) zero=true;
            if(num==1) one=true;
            if(num==2) two=true;
            System.out.print(num + " ");
        }
        System.out.println();
        
        if(zero== true) System.out.print("Red ");
        if(one == true) System.out.print("White ");
        if(two == true) System.out.print("Blue");
        System.out.println();
        
        int[] nums2 = {2,0,1};
        solution.sortColours(nums2);
        System.out.println("Sorted array: ");
        
        for(int num: nums2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums3= {0,1,2,0,1,2};
        solution.sortColours(nums3);
        System.out.println("Sorted array: ");
        for(int num : nums3){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
