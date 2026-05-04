class Solution {
    public int arrangeCoins(int n) {

        long l = 1;
        long r = n;

        while (l <= r) {
            long m = l + (r - l)/2;
            long totalCoins = (m * (m + 1)) / 2;

            if (totalCoins == n) {
                return (int) m;
            } else {
                if (totalCoins > n) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }

        return (int) r;
    }
}

public class ArrangingCoins {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int n1 = 5;
        System.out.println("Input: " + n1);
        System.out.println("Output: " + sol.arrangeCoins(n1)); // expected: 2

        int n2 = 8;
        System.out.println("Input: " + n2);
        System.out.println("Output: " + sol.arrangeCoins(n2)); // expected: 3

        int n3 = 1;
        System.out.println("Input: " + n3);
        System.out.println("Output: " + sol.arrangeCoins(n3)); // expected: 1

        int n4 = 2147483647;
        System.out.println("Input: " + n4);
        System.out.println("Output: " + sol.arrangeCoins(n4)); // expected: 65535
    }
}
