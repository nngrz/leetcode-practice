class Solution {
    public boolean stoneGameIX(int[] stones) {
        // Write solution here
        return false;
    }
}

public class StoneGameIX {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] stones1 = {2, 1};
        boolean result1 = sol.stoneGameIX(stones1);

        System.out.println("Example 1");
        System.out.println("Output: " + result1);
        System.out.println("Expected: true");
        System.out.println();

        // Example 2
        int[] stones2 = {2};
        boolean result2 = sol.stoneGameIX(stones2);

        System.out.println("Example 2");
        System.out.println("Output: " + result2);
        System.out.println("Expected: false");
        System.out.println();

        // Example 3
        int[] stones3 = {5, 1, 2, 4, 3};
        boolean result3 = sol.stoneGameIX(stones3);

        System.out.println("Example 3");
        System.out.println("Output: " + result3);
        System.out.println("Expected: false");
        System.out.println();

        // Extra test 1
        int[] stones4 = {1, 1, 1};
        boolean result4 = sol.stoneGameIX(stones4);

        System.out.println("Extra Test 1");
        System.out.println("Output: " + result4);
        System.out.println();

        // Extra test 2
        int[] stones5 = {1, 2, 3, 4, 5, 6};
        boolean result5 = sol.stoneGameIX(stones5);

        System.out.println("Extra Test 2");
        System.out.println("Output: " + result5);
        System.out.println();

        // Extra test 3
        int[] stones6 = {3, 3, 3};
        boolean result6 = sol.stoneGameIX(stones6);

        System.out.println("Extra Test 3");
        System.out.println("Output: " + result6);
        System.out.println();
    }
}
