class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) {
                return m;
            } else {
                if (nums[m] > target) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }

        return l;
    }
}

public class SearchInsertPosition {

    public static void main(String[] args) {

        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Example 1 Output: " + sol.searchInsert(nums1, target1));

        // Example 2
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Example 2 Output: " + sol.searchInsert(nums2, target2));

        // Example 3
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("Example 3 Output: " + sol.searchInsert(nums3, target3));
    }
}
