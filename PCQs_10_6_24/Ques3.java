package PCQs_10_6_24;

public class Ques3 {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
    
        return maxProduct;
    }
    public static void main(String[] args) {
        int[] nums = {2, 2, -3, -3, 1, 2};
        int maxProduct = maxProduct(nums);
        System.out.println("Maximum product of a contiguous subarray: " + maxProduct);
        }
    }
