class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }

        return second;
    }
}

public class ClimbingStairs {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int n1 = 2;
        int result1 = sol.climbStairs(n1);
        System.out.println("Example 1 Output: " + result1); // expected: 2

        // Example 2
        int n2 = 3;
        int result2 = sol.climbStairs(n2);
        System.out.println("Example 2 Output: " + result2); // expected: 3

        // Extra test 1
        int n3 = 1;
        int result3 = sol.climbStairs(n3);
        System.out.println("Extra Test 1 Output: " + result3); // expected: 1

        // Extra test 2
        int n4 = 4;
        int result4 = sol.climbStairs(n4);
        System.out.println("Extra Test 2 Output: " + result4); // expected: 5

        // Extra test 3
        int n5 = 5;
        int result5 = sol.climbStairs(n5);
        System.out.println("Extra Test 3 Output: " + result5); // expected: 8
    }
}
