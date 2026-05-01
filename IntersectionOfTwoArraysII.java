import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1); // 计数减 1
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}

public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1_1 = {1, 2, 2, 1};
        int[] nums2_1 = {2, 2};
        int[] result1 = sol.intersect(nums1_1, nums2_1);
        System.out.println("Example 1 Output: " + Arrays.toString(result1)); // expected: [2, 2]

        // Example 2
        int[] nums1_2 = {4, 9, 5};
        int[] nums2_2 = {9, 4, 9, 8, 4};
        int[] result2 = sol.intersect(nums1_2, nums2_2);
        System.out.println("Example 2 Output: " + Arrays.toString(result2)); // expected: [4, 9] or [9, 4]
    }
}