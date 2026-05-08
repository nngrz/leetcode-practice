class GuessGame {
    protected int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    // -1: your guess is higher than the picked number
    //  1: your guess is lower than the picked number
    //  0: your guess is correct
    public int guess(int num) {
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Solution extends GuessGame {

    public Solution(int pick) {
        super(pick);
    }

    public int guessNumber(int n) {
        int l = 1;
        int r = n;

        while (l <= r) {
            int m = l + (r - l) / 2;
            int result = guess(m);

            if (result == 0) {
                return m;
            } else if (result == -1) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -1;
    }
}

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {

        // Example 1: n = 10, pick = 6
        Solution sol1 = new Solution(6);
        int result1 = sol1.guessNumber(10);
        System.out.println("Example 1 Output: " + result1); // expected: 6

        // Example 2: n = 1, pick = 1
        Solution sol2 = new Solution(1);
        int result2 = sol2.guessNumber(1);
        System.out.println("Example 2 Output: " + result2); // expected: 1

        // Example 3: n = 2, pick = 1
        Solution sol3 = new Solution(1);
        int result3 = sol3.guessNumber(2);
        System.out.println("Example 3 Output: " + result3); // expected: 1
    }
}
