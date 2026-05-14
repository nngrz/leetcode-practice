import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {1, 1, 2};
        int k1 = sol.removeDuplicates(nums1);
        System.out.println("Example 1 k = " + k1);
        System.out.println("First k elements: " + Arrays.toString(Arrays.copyOf(nums1, k1)));
        // expected: k = 2, [1, 2]

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = sol.removeDuplicates(nums2);
        System.out.println("Example 2 k = " + k2);
        System.out.println("First k elements: " + Arrays.toString(Arrays.copyOf(nums2, k2)));
        // expected: k = 5, [0, 1, 2, 3, 4]
    }
}
