import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int miniCost = 0;
        int count = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            count++;
            if (count % 3 == 0 && count != 1) {
                cost[i] = 0;
            }
            miniCost += cost[i];
        }

        return miniCost;
    }
}

public class MinimumCostOfBuyingCandiesWithDiscount {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] cost1 = {1, 2, 3};
        int result1 = sol.minimumCost(cost1);
        System.out.println("Example 1 Output: " + result1); // expected: 5

        // Example 2
        int[] cost2 = {6, 5, 7, 9, 2, 2};
        int result2 = sol.minimumCost(cost2);
        System.out.println("Example 2 Output: " + result2); // expected: 23

        // Extra test 1
        int[] cost3 = {5, 5};
        int result3 = sol.minimumCost(cost3);
        System.out.println("Extra Test 1 Output: " + result3); // expected: 10

        // Extra test 2
        int[] cost4 = {8, 4, 6, 2, 3};
        int result4 = sol.minimumCost(cost4);
        System.out.println("Extra Test 2 Output: " + result4); // expected: 14

        // Extra test 3
        int[] cost5 = {10, 10, 10, 10, 10, 10};
        int result5 = sol.minimumCost(cost5);
        System.out.println("Extra Test 3 Output: " + result5); // expected: 40
    }
}
