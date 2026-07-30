class Solution {
    public int minimumPushes(String word) {
        // TODO
        return 0;
    }
}

public class MinimumNumberOfPushesToTypeWordI {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        String word1 = "abcde";
        int result1 = sol.minimumPushes(word1);

        System.out.println("Example 1");
        System.out.println("Input: " + word1);
        System.out.println("Output: " + result1);
        System.out.println("Expected: 5");
        System.out.println();

        // Example 2
        String word2 = "xycdefghij";
        int result2 = sol.minimumPushes(word2);

        System.out.println("Example 2");
        System.out.println("Input: " + word2);
        System.out.println("Output: " + result2);
        System.out.println("Expected: 12");
        System.out.println();

        // Extra test 1
        String word3 = "a";
        int result3 = sol.minimumPushes(word3);

        System.out.println("Extra Test 1");
        System.out.println("Input: " + word3);
        System.out.println("Output: " + result3);
        System.out.println("Expected: 1");
        System.out.println();

        // Extra test 2
        String word4 = "abcdefgh";
        int result4 = sol.minimumPushes(word4);

        System.out.println("Extra Test 2");
        System.out.println("Input: " + word4);
        System.out.println("Output: " + result4);
        System.out.println("Expected: 8");
        System.out.println();

        // Extra test 3
        String word5 = "abcdefghi";
        int result5 = sol.minimumPushes(word5);

        System.out.println("Extra Test 3");
        System.out.println("Input: " + word5);
        System.out.println("Output: " + result5);
        System.out.println("Expected: 10");
        System.out.println();

        // Extra test 4
        String word6 = "abcdefghijklmnop";
        int result6 = sol.minimumPushes(word6);

        System.out.println("Extra Test 4");
        System.out.println("Input: " + word6);
        System.out.println("Output: " + result6);
        System.out.println("Expected: 24");
    }
}
