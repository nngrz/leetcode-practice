class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        // TODO
        return 0;
    }
}

public class CountSubarraysWithMajorityElementI {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 2, 3};
        int target1 = 2;
        int result1 = sol.countMajoritySubarrays(nums1, target1);
        System.out.println("Example 1 Output: " + result1); // expected: 5

        // Example 2
        int[] nums2 = {1, 1, 1, 1};
        int target2 = 1;
        int result2 = sol.countMajoritySubarrays(nums2, target2);
        System.out.println("Example 2 Output: " + result2); // expected: 10

        // Example 3
        int[] nums3 = {1, 2, 3};
        int target3 = 4;
        int result3 = sol.countMajoritySubarrays(nums3, target3);
        System.out.println("Example 3 Output: " + result3); // expected: 0

        // Extra test 1
        int[] nums4 = {2};
        int target4 = 2;
        int result4 = sol.countMajoritySubarrays(nums4, target4);
        System.out.println("Extra Test 1 Output: " + result4);

        // Extra test 2
        int[] nums5 = {2, 2, 2};
        int target5 = 2;
        int result5 = sol.countMajoritySubarrays(nums5, target5);
        System.out.println("Extra Test 2 Output: " + result5);

        // Extra test 3
        int[] nums6 = {1, 2, 1, 2, 1};
        int target6 = 1;
        int result6 = sol.countMajoritySubarrays(nums6, target6);
        System.out.println("Extra Test 3 Output: " + result6);
    }
}
