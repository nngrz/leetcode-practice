class Solution {
    public int minElement(int[] nums) {

        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int temp = nums[i];

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                temp = temp / 10;
            }

            if (sum < minSum) {
                minSum = sum;
            }
        }

        return minSum;
    }
}

public class MinimumElementAfterReplacementWithDigitSum {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {10, 12, 13, 14};
        int result1 = sol.minElement(nums1);
        System.out.println("Example 1 Output: " + result1); // expected: 1

        // Example 2
        int[] nums2 = {1, 2, 3, 4};
        int result2 = sol.minElement(nums2);
        System.out.println("Example 2 Output: " + result2); // expected: 1

        // Example 3
        int[] nums3 = {999, 19, 199};
        int result3 = sol.minElement(nums3);
        System.out.println("Example 3 Output: " + result3); // expected: 10

        // Extra test 1
        int[] nums4 = {38, 57, 26};
        int result4 = sol.minElement(nums4);
        System.out.println("Extra Test 1 Output: " + result4); // expected: 8

        // Extra test 2
        int[] nums5 = {5};
        int result5 = sol.minElement(nums5);
        System.out.println("Extra Test 2 Output: " + result5); // expected: 5
    }
}
