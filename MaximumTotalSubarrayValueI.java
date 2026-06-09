class Solution {
    public long maxTotalValue(int[] nums, int k) {
        // 在这里补你自己的 solution 代码
        return 0L;
    }
}

public class MaximumTotalSubarrayValueI {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {1, 3, 2};
        int k1 = 2;
        long result1 = sol.maxTotalValue(nums1, k1);
        System.out.println("Example 1 Output: " + result1);
        // expected: 4

        // Example 2
        int[] nums2 = {4, 2, 5, 1};
        int k2 = 3;
        long result2 = sol.maxTotalValue(nums2, k2);
        System.out.println("Example 2 Output: " + result2);
        // expected: 12

        // Extra test 1
        int[] nums3 = {7};
        int k3 = 1;
        long result3 = sol.maxTotalValue(nums3, k3);
        System.out.println("Extra Test 1 Output: " + result3);

        // Extra test 2
        int[] nums4 = {2, 2, 2};
        int k4 = 2;
        long result4 = sol.maxTotalValue(nums4, k4);
        System.out.println("Extra Test 2 Output: " + result4);

        // Extra test 3
        int[] nums5 = {1, 5, 3, 8};
        int k5 = 2;
        long result5 = sol.maxTotalValue(nums5, k5);
        System.out.println("Extra Test 3 Output: " + result5);
    }
}
