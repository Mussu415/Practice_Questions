package PCQs_31_5_24;

//move all zeroes to the end while maintaining the relative order order of the other elements
public class Ques7 {
    public void moveZeroes(int[]nums){
        int insertPosition = 0;
        //fill non-zero numbers
        for (int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }
        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
            }
    }
    
    public static void main(String[] args) {
        Ques7 solution = new Ques7();
        int[] nums ={0,1,0,3,12};
        System.out.println("Original array: ");
        printArray(nums);

        solution.moveZeroes(nums);

        System.out.println("Modified Array: ");
        printArray(nums);
    }
    public static void printArray(int[] nums){
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
