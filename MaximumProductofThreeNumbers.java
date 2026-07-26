import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }
}

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 3};
        int result1 = sol.maximumProduct(nums1);
        System.out.println("Example 1 Output: " + result1); // expected: 6

        // Example 2
        int[] nums2 = {1, 2, 3, 4};
        int result2 = sol.maximumProduct(nums2);
        System.out.println("Example 2 Output: " + result2); // expected: 24

        // Example 3
        int[] nums3 = {-1, -2, -3};
        int result3 = sol.maximumProduct(nums3);
        System.out.println("Example 3 Output: " + result3); // expected: -6

        // Extra Test 1
        int[] nums4 = {-10, -10, 5, 2};
        int result4 = sol.maximumProduct(nums4);
        System.out.println("Extra Test 1 Output: " + result4); // expected: 500

        // Extra Test 2
        int[] nums5 = {-4, -3, -2, -1, 60};
        int result5 = sol.maximumProduct(nums5);
        System.out.println("Extra Test 2 Output: " + result5); // expected: 720
    }
}
