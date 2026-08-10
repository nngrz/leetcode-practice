import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        int result1 = sol.findKthLargest(nums1, k1);
        System.out.println("Example 1 Output: " + result1); // expected: 5

        // Example 2
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        int result2 = sol.findKthLargest(nums2, k2);
        System.out.println("Example 2 Output: " + result2); // expected: 4

        // Extra test
        int[] nums3 = {7, 10, 4, 3, 20, 15};
        int k3 = 3;
        int result3 = sol.findKthLargest(nums3, k3);
        System.out.println("Extra Test Output: " + result3); // expected: 10
    }
}
