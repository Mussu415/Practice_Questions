package PCQs_11_6_24;

public class Ques4 {
    public static int countGoodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int count = 0;

        for (int x = 0; x < n; x++) {
            for (int y = x + 1; y < n; y++) {
                for (int z = y + 1; z < n; z++) {
                    if (nums1[x] < nums1[y] && nums1[y] < nums1[z] && 
                        nums2[x] < nums2[y] && nums2[y] < nums2[z]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 0, 1, 3};
        int[] nums2 = {0, 1, 2, 3};
        System.out.println("Output: " + countGoodTriplets(nums1, nums2));
    }
}
