class Solution {
    public int maxNumberOfBalloons(String text) {
        // 在这里写你的 solution
        return 0;
    }
}

public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        String text1 = "nlaebolko";
        int result1 = sol.maxNumberOfBalloons(text1);
        System.out.println("Example 1 Output: " + result1); // expected: 1

        // Example 2
        String text2 = "loonbalxballpoon";
        int result2 = sol.maxNumberOfBalloons(text2);
        System.out.println("Example 2 Output: " + result2); // expected: 2

        // Example 3
        String text3 = "leetcode";
        int result3 = sol.maxNumberOfBalloons(text3);
        System.out.println("Example 3 Output: " + result3); // expected: 0

        // Extra test 1
        String text4 = "balloon";
        int result4 = sol.maxNumberOfBalloons(text4);
        System.out.println("Extra Test 1 Output: " + result4); // expected: 1

        // Extra test 2
        String text5 = "balloonballoon";
        int result5 = sol.maxNumberOfBalloons(text5);
        System.out.println("Extra Test 2 Output: " + result5); // expected: 2

        // Extra test 3
        String text6 = "balon";
        int result6 = sol.maxNumberOfBalloons(text6);
        System.out.println("Extra Test 3 Output: " + result6); // expected: 0
    }
}
