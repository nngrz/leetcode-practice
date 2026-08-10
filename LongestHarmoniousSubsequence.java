import java.util.HashMap;

class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;

        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int length = map.get(key) + map.get(key + 1);
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println("Example 1 Output: " + sol.findLHS(nums1)); // expected: 5

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Example 2 Output: " + sol.findLHS(nums2)); // expected: 2

        int[] nums3 = {1, 1, 1, 1};
        System.out.println("Example 3 Output: " + sol.findLHS(nums3)); // expected: 0
    }
}

