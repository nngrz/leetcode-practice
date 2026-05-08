import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            temp[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            temp[k] = nums2[j];
            j++;
            k++;
        }

        for (int p = 0; p < m + n; p++) {
            nums1[p] = temp[p];
        }
    }
}

public class MergeSortedArray {
    public static void main(String[] args) {

        Solution solution = new Solution();

        // Example 1
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;
        solution.merge(nums1_1, m1, nums2_1, n1);
        System.out.println("Example 1 output: " + Arrays.toString(nums1_1));

        // Example 2
        int[] nums1_2 = {1};
        int m2 = 1;
        int[] nums2_2 = {};
        int n2 = 0;
        solution.merge(nums1_2, m2, nums2_2, n2);
        System.out.println("Example 2 output: " + Arrays.toString(nums1_2));

        // Example 3
        int[] nums1_3 = {0};
        int m3 = 0;
        int[] nums2_3 = {1};
        int n3 = 1;
        solution.merge(nums1_3, m3, nums2_3, n3);
        System.out.println("Example 3 output: " + Arrays.toString(nums1_3));
    }
}
