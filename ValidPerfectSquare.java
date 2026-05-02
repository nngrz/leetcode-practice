class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num;

        while (l <= r) {
            int m = l + (r - l)/2;
            long square = (long) m * m;

            if (square == num) {
                return true;
            } else{
                if (square > num) {
                r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }

        return false;
    }
}

public class ValidPerfectSquare {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Example 1
        int num1 = 16;
        boolean result1 = sol.isPerfectSquare(num1);
        System.out.println("Example 1 Output: " + result1); // expected: true

        // Example 2
        int num2 = 14;
        boolean result2 = sol.isPerfectSquare(num2);
        System.out.println("Example 2 Output: " + result2); // expected: false

        // Extra tests
        int num3 = 1;
        boolean result3 = sol.isPerfectSquare(num3);
        System.out.println("Extra Test 1 Output: " + result3); // expected: true
        int num4 = 25;
        boolean result4 = sol.isPerfectSquare(num4);
        System.out.println("Extra Test 2 Output: " + result4); // expected: true
        int num5 = 26;
        boolean result5 = sol.isPerfectSquare(num5);
        System.out.println("Extra Test 3 Output: " + result5); // expected: false
    }
}
