import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int countDistinctNumber = 1;
        int max = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                countDistinctNumber++;
            }

            if (countDistinctNumber == 3) {
                return nums[i];
            }
        }

        return max;
    }
}

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {3, 2, 1};
        int result1 = sol.thirdMax(nums1);
        System.out.println("Example 1 Output: " + result1); // expected: 1

        // Example 2
        int[] nums2 = {1, 2};
        int result2 = sol.thirdMax(nums2);
        System.out.println("Example 2 Output: " + result2); // expected: 2

        // Example 3
        int[] nums3 = {2, 2, 3, 1};
        int result3 = sol.thirdMax(nums3);
        System.out.println("Example 3 Output: " + result3); // expected: 1

        // Extra test
        int[] nums4 = {5, 2, 2};
        int result4 = sol.thirdMax(nums4);
        System.out.println("Extra Test Output: " + result4); // expected: 5
    }
}
