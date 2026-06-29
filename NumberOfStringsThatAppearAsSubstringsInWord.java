class Solution {
    public int numOfStrings(String[] patterns, String word) {
        // TODO
        return 0;
    }
}

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        String[] patterns1 = {"a", "abc", "bc", "d"};
        String word1 = "abc";
        int result1 = sol.numOfStrings(patterns1, word1);
        System.out.println("Example 1 Output: " + result1); // expected: 3

        // Example 2
        String[] patterns2 = {"a", "b", "c"};
        String word2 = "aaaaabbbbb";
        int result2 = sol.numOfStrings(patterns2, word2);
        System.out.println("Example 2 Output: " + result2); // expected: 2

        // Example 3
        String[] patterns3 = {"a", "a", "a"};
        String word3 = "ab";
        int result3 = sol.numOfStrings(patterns3, word3);
        System.out.println("Example 3 Output: " + result3); // expected: 3

        // Extra test 1
        String[] patterns4 = {"ab", "ba", "abc"};
        String word4 = "abcba";
        int result4 = sol.numOfStrings(patterns4, word4);
        System.out.println("Extra Test 1 Output: " + result4);

        // Extra test 2
        String[] patterns5 = {"x", "y", "z"};
        String word5 = "abcdef";
        int result5 = sol.numOfStrings(patterns5, word5);
        System.out.println("Extra Test 2 Output: " + result5);

        // Extra test 3
        String[] patterns6 = {"aa", "aaa", "aaaa"};
        String word6 = "aaaaa";
        int result6 = sol.numOfStrings(patterns6, word6);
        System.out.println("Extra Test 3 Output: " + result6);
    }
}
