class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // TODO
        return 0;
    }
}

public class MaximumIceCreamBars {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] costs1 = {1, 3, 2, 4, 1};
        int coins1 = 7;
        int result1 = sol.maxIceCream(costs1, coins1);
        System.out.println("Example 1 Output: " + result1); // expected: 4

        // Example 2
        int[] costs2 = {10, 6, 8, 7, 7, 8};
        int coins2 = 5;
        int result2 = sol.maxIceCream(costs2, coins2);
        System.out.println("Example 2 Output: " + result2); // expected: 0

        // Example 3
        int[] costs3 = {1, 6, 3, 1, 2, 5};
        int coins3 = 20;
        int result3 = sol.maxIceCream(costs3, coins3);
        System.out.println("Example 3 Output: " + result3); // expected: 6

        // Extra test 1
        int[] costs4 = {2, 2, 2};
        int coins4 = 4;
        int result4 = sol.maxIceCream(costs4, coins4);
        System.out.println("Extra Test 1 Output: " + result4);

        // Extra test 2
        int[] costs5 = {5, 1, 4, 2};
        int coins5 = 6;
        int result5 = sol.maxIceCream(costs5, coins5);
        System.out.println("Extra Test 2 Output: " + result5);

        // Extra test 3
        int[] costs6 = {7};
        int coins6 = 10;
        int result6 = sol.maxIceCream(costs6, coins6);
        System.out.println("Extra Test 3 Output: " + result6);
    }
}