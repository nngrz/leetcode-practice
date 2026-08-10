import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}

public class ArrayPartition {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {1, 4, 3, 2};
        int result1 = sol.arrayPairSum(nums1);
        System.out.println("Example 1 Output: " + result1); // expected: 4

        // Example 2
        int[] nums2 = {6, 2, 6, 5, 1, 2};
        int result2 = sol.arrayPairSum(nums2);
        System.out.println("Example 2 Output: " + result2); // expected: 9

        // Extra test
        int[] nums3 = {7, 3, 1, 0};
        int result3 = sol.arrayPairSum(nums3);
        System.out.println("Extra Test Output: " + result3);
    }
}

