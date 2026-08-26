import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {
        // Write your solution here
        
        return -1;
    }
}


public class FindLargestAlmostMissingInteger {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {3, 9, 2, 1, 7};
        int k1 = 3;

        int result1 = sol.largestInteger(nums1, k1);

        System.out.println("Example 1");
        System.out.println("Output: " + result1);
        System.out.println("Expected: 7");
        System.out.println();


        // Example 2
        int[] nums2 = {3, 9, 7, 2, 1, 7};
        int k2 = 4;

        int result2 = sol.largestInteger(nums2, k2);

        System.out.println("Example 2");
        System.out.println("Output: " + result2);
        System.out.println("Expected: 3");
        System.out.println();


        // Example 3
        int[] nums3 = {0, 0};
        int k3 = 1;

        int result3 = sol.largestInteger(nums3, k3);

        System.out.println("Example 3");
        System.out.println("Output: " + result3);
        System.out.println("Expected: -1");
        System.out.println();


        // Extra Test 1
        int[] nums4 = {1, 2, 3, 4, 5};
        int k4 = 2;

        int result4 = sol.largestInteger(nums4, k4);

        System.out.println("Extra Test 1");
        System.out.println("Output: " + result4);
        System.out.println();


        // Extra Test 2
        int[] nums5 = {5, 5, 5};
        int k5 = 2;

        int result5 = sol.largestInteger(nums5, k5);

        System.out.println("Extra Test 2");
        System.out.println("Output: " + result5);
        System.out.println();
    }
}
