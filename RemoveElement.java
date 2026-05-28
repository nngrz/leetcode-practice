import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

public class RemoveElement {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = sol.removeElement(nums1, val1);
        System.out.println("Example 1:");
        System.out.println("k = " + k1);
        System.out.println("First k elements = " + Arrays.toString(Arrays.copyOf(nums1, k1)));
        System.out.println();

        // Example 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = sol.removeElement(nums2, val2);
        System.out.println("Example 2:");
        System.out.println("k = " + k2);
        System.out.println("First k elements = " + Arrays.toString(Arrays.copyOf(nums2, k2)));
        System.out.println();

        // Extra Test 1: no element removed
        int[] nums3 = {1, 3, 5};
        int val3 = 2;
        int k3 = sol.removeElement(nums3, val3);
        System.out.println("Extra Test 1:");
        System.out.println("k = " + k3);
        System.out.println("First k elements = " + Arrays.toString(Arrays.copyOf(nums3, k3)));
        System.out.println();

        // Extra Test 2: all elements removed
        int[] nums4 = {7, 7, 7, 7};
        int val4 = 7;
        int k4 = sol.removeElement(nums4, val4);
        System.out.println("Extra Test 2:");
        System.out.println("k = " + k4);
        System.out.println("First k elements = " + Arrays.toString(Arrays.copyOf(nums4, k4)));
        System.out.println();

        // Extra Test 3: single element
        int[] nums5 = {4};
        int val5 = 4;
        int k5 = sol.removeElement(nums5, val5);
        System.out.println("Extra Test 3:");
        System.out.println("k = " + k5);
        System.out.println("First k elements = " + Arrays.toString(Arrays.copyOf(nums5, k5)));
        System.out.println();
    }
}
