import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        /*
        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] newArr = new int[Math.min(nums1.length, nums2.length)];
        int k = 0; // index of the new array

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (nums1[i] == nums2[j]) {
                    boolean exists = false;
                    for (int m = 0; m < k; m++) {
                        if (newArr[m] == nums1[i]) {
                            exists = true;
                            break;
                        }
                    }

                    if (!exists) {
                        newArr[k] = nums1[i];
                        k++;
                    }
                    break;
                }
            }
        }
        return Arrays.copyOf(newArr, k);
        */

        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
            }
        }

        int[] res = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            res[i++] = num;
        }
        return res;
    }
}

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        Solution sol = new Solution();

        // Example 1
        int[] nums1_1 = {1, 2, 2, 1};
        int[] nums2_1 = {2, 2};
        int[] result1 = sol.intersection(nums1_1, nums2_1);
        System.out.println("Example 1 Output: " + Arrays.toString(result1)); // expected: [2]

        // Example 2
        int[] nums1_2 = {4, 9, 5};
        int[] nums2_2 = {9, 4, 9, 8, 4};
        int[] result2 = sol.intersection(nums1_2, nums2_2);
        System.out.println("Example 2 Output: " + Arrays.toString(result2)); // expected: [9, 4] or [4, 9]
    }
}
