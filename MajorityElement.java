class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int candidate = nums[0];

        for (int i = 0; i < n; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
public class MajorityElement {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {3, 2, 3};
        int result1 = sol.majorityElement(nums1);
        System.out.println("Example 1 Output: " + result1); // expected: 3

        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int result2 = sol.majorityElement(nums2);
        System.out.println("Example 2 Output: " + result2); // expected: 2
    }
}
