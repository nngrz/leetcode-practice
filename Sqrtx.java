class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;

        while (l <= r) {
            int m = l + (r - l) / 2;
            long square = (long) m * m;

            if (square == x) {
                return m;
            } else {
                if (square > x) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return r;
    }
}

public class Sqrtx {
    public static void main(String[] args) {

            Solution sol = new Solution();

            int x1 = 4;
            int x2 = 8;
            int x3 = 0;
            int x4 = 1;
            int x5 = 15;

            System.out.println("sqrt(" + x1 + ") = " + sol.mySqrt(x1)); // 2
            System.out.println("sqrt(" + x2 + ") = " + sol.mySqrt(x2)); // 2
            System.out.println("sqrt(" + x3 + ") = " + sol.mySqrt(x3)); // 0
            System.out.println("sqrt(" + x4 + ") = " + sol.mySqrt(x4)); // 1
            System.out.println("sqrt(" + x5 + ") = " + sol.mySqrt(x5)); // 3
    }
}
