import java.util.Arrays;

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];
        int leftResult = 0;
        int rightResult = 0;

        // left sum
        for (int i = 0; i < len; i++) {
            leftSum[i] = leftResult;
            leftResult += nums[i];
        }

        // right sum
        for (int i = len - 1; i >= 0; i--) {
            rightSum[i] = rightResult;
            rightResult += nums[i];
        }

        for (int i = 0; i < len; i++) {
            if (leftSum[i] - rightSum[i] < 0) {
                answer[i] = rightSum[i] - leftSum[i];
            } else {
                answer[i] = leftSum[i] - rightSum[i];
            }
        }

        return answer;
    }
}

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {10, 4, 8, 3};
        int[] result1 = sol.leftRightDifference(nums1);
        System.out.println("Example 1 Output: " + Arrays.toString(result1));
        // expected: [15, 1, 11, 22]

        // Example 2
        int[] nums2 = {1};
        int[] result2 = sol.leftRightDifference(nums2);
        System.out.println("Example 2 Output: " + Arrays.toString(result2));
        // expected: [0]

        // Extra test 1
        int[] nums3 = {1, 2, 3, 4};
        int[] result3 = sol.leftRightDifference(nums3);
        System.out.println("Extra Test 1 Output: " + Arrays.toString(result3));

        // Extra test 2
        int[] nums4 = {5, 5, 5};
        int[] result4 = sol.leftRightDifference(nums4);
        System.out.println("Extra Test 2 Output: " + Arrays.toString(result4));

        // Extra test 3
        int[] nums5 = {2, 7};
        int[] result5 = sol.leftRightDifference(nums5);
        System.out.println("Extra Test 3 Output: " + Arrays.toString(result5));
    }
}
