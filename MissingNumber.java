class Solution {
    public int missingNumber(int[] nums) {
        /* 1
        int n = nums.length;
        // range [0, n], in total n+1 numbers
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            // check if i exsits in nums[]
            // index of nums [0, n - 1]
            for (int j = 0; j < n; j++) {
                if (i == nums[j]) {
                    found = true;
                    break;
                }
            }

            // if i not found in nums[], means i is missing
            if (!found) {
                return i;
            }
        }
        return -1;
        */

        // 2
        int n = nums.length;

        int expectedSum = 0; // sum of numbers in the range
        int actualSum = 0; // sum of numbers in the given array nums[]
        // count expectedSum
        for (int i = 0; i <= n; i++) {
            expectedSum += i;
        }

        // count actuaSum
        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        int missingNumber = expectedSum - actualSum;
        return missingNumber;
    }
}

public class MissingNumber {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Example 1 Output: " + sol.missingNumber(nums1)); // 2

        // Example 2
        int[] nums2 = {0, 1};
        System.out.println("Example 2 Output: " + sol.missingNumber(nums2)); // 2

        // Example 3
        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println("Example 3 Output: " + sol.missingNumber(nums3)); // 8
    }
}
