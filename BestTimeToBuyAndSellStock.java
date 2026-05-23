class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - minPrice);
            }
        }

        return profit;
    }
}

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int result1 = sol.maxProfit(prices1);
        System.out.println("Example 1 Output: " + result1); // expected: 5

        // Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        int result2 = sol.maxProfit(prices2);
        System.out.println("Example 2 Output: " + result2); // expected: 0

        // Extra test 1
        int[] prices3 = {2, 4, 1};
        int result3 = sol.maxProfit(prices3);
        System.out.println("Extra Test 1 Output: " + result3); // expected: 2

        // Extra test 2
        int[] prices4 = {3, 2, 6, 5, 0, 3};
        int result4 = sol.maxProfit(prices4);
        System.out.println("Extra Test 2 Output: " + result4); // expected: 4
    }
}
