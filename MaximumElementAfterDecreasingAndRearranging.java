class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        // TODO
        return 0;
    }
}

public class MaximumElementAfterDecreasingAndRearranging {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] arr1 = {2, 2, 1, 2, 1};
        int result1 = sol.maximumElementAfterDecrementingAndRearranging(arr1);
        System.out.println("Example 1 Output: " + result1); // expected: 2

        // Example 2
        int[] arr2 = {100, 1, 1000};
        int result2 = sol.maximumElementAfterDecrementingAndRearranging(arr2);
        System.out.println("Example 2 Output: " + result2); // expected: 3

        // Example 3
        int[] arr3 = {1, 2, 3, 4, 5};
        int result3 = sol.maximumElementAfterDecrementingAndRearranging(arr3);
        System.out.println("Example 3 Output: " + result3);

        // Extra test 1
        int[] arr4 = {1};
        int result4 = sol.maximumElementAfterDecrementingAndRearranging(arr4);
        System.out.println("Extra Test 1 Output: " + result4);

        // Extra test 2
        int[] arr5 = {5, 5, 5, 5};
        int result5 = sol.maximumElementAfterDecrementingAndRearranging(arr5);
        System.out.println("Extra Test 2 Output: " + result5);

        // Extra test 3
        int[] arr6 = {3, 7, 2, 1, 8};
        int result6 = sol.maximumElementAfterDecrementingAndRearranging(arr6);
        System.out.println("Extra Test 3 Output: " + result6);
    }
}
