class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            // Update the three largest numbers
            if (num >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num >= max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // Update the two smallest numbers
            if (num <= min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        int result1 = max1 * max2 * max3;
        int result2 = max1 * min1 * min2;

        return Math.max(result1, result2);
    }
}

public class MaximumProductOfThreeNumbers2 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 3};
        int result1 = sol.maximumProduct(nums1);
        System.out.println("Example 1 Output: " + result1);
        System.out.println("Expected: 6");
        System.out.println();

        // Example 2
        int[] nums2 = {1, 2, 3, 4};
        int result2 = sol.maximumProduct(nums2);
        System.out.println("Example 2 Output: " + result2);
        System.out.println("Expected: 24");
        System.out.println();

        // Example 3
        int[] nums3 = {-1, -2, -3};
        int result3 = sol.maximumProduct(nums3);
        System.out.println("Example 3 Output: " + result3);
        System.out.println("Expected: -6");
        System.out.println();

        // Failed LeetCode test
        int[] nums4 = {-100, -98, -1, 2, 3, 4};
        int result4 = sol.maximumProduct(nums4);
        System.out.println("Test 4 Output: " + result4);
        System.out.println("Expected: 39200");
        System.out.println();

        // Extra test
        int[] nums5 = {-10, -10, 5, 2};
        int result5 = sol.maximumProduct(nums5);
        System.out.println("Test 5 Output: " + result5);
        System.out.println("Expected: 500");
    }
}