import java.util.Arrays;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        //TODO
    }
}

public class PartitionArrayAccordingToGivenPivot {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {9, 12, 5, 10, 14, 3, 10};
        int pivot1 = 10;
        int[] result1 = sol.pivotArray(nums1, pivot1);
        System.out.println("Example 1 Output: " + Arrays.toString(result1));
        // expected: [9, 5, 3, 10, 10, 12, 14]

        // Example 2
        int[] nums2 = {-3, 4, 3, 2};
        int pivot2 = 2;
        int[] result2 = sol.pivotArray(nums2, pivot2);
        System.out.println("Example 2 Output: " + Arrays.toString(result2));
        // expected: [-3, 2, 4, 3]

        // Extra test 1
        int[] nums3 = {5, 1, 7, 3, 5, 2};
        int pivot3 = 5;
        int[] result3 = sol.pivotArray(nums3, pivot3);
        System.out.println("Extra Test 1 Output: " + Arrays.toString(result3));
        // expected: [1, 3, 2, 5, 5, 7]

        // Extra test 2
        int[] nums4 = {2, 2, 2};
        int pivot4 = 2;
        int[] result4 = sol.pivotArray(nums4, pivot4);
        System.out.println("Extra Test 2 Output: " + Arrays.toString(result4));
        // expected: [2, 2, 2]

        // Extra test 3
        int[] nums5 = {8, 1, 4, 9, 6};
        int pivot5 = 5;
        int[] result5 = sol.pivotArray(nums5, pivot5);
        System.out.println("Extra Test 3 Output: " + Arrays.toString(result5));
        // expected: [1, 4, 8, 9, 6]
    }
}
