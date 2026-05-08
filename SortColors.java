import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else if (nums[i] == 2) {
                count2++;
            }
        }

        int index = 0;

        // 0
        for (int i = 0; i < count0; i++) {
            nums[index] = 0;
            index++;
        }

        // 1
        for (int i = 0; i < count1; i++) {
            nums[index] = 1;
            index++;
        }

        // 2
        for (int i = 0; i < count2; i++) {
            nums[index] = 2;
            index++;
        }
    }
}

public class SortColors {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        System.out.println("Before Example 1: " + Arrays.toString(nums1));
        sol.sortColors(nums1);
        System.out.println("After Example 1:  " + Arrays.toString(nums1));
        System.out.println();

        // Example 2
        int[] nums2 = {2, 0, 1};
        System.out.println("Before Example 2: " + Arrays.toString(nums2));
        sol.sortColors(nums2);
        System.out.println("After Example 2:  " + Arrays.toString(nums2));
    }
}

