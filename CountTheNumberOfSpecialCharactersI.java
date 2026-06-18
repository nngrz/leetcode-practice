class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        int count = 0;

        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                lower[c - 'a'] = true;
            } else if (c >= 'A' && c <= 'Z') {
                upper[c - 'A'] = true;
            }
        }

        for (int i = 0; i < lower.length; i++) {
            if (lower[i] && upper[i]) {
                count++;
            }
        }

        return count;
    }
}

public class CountTheNumberOfSpecialCharactersI {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        String word1 = "aaAbcBC";
        int result1 = sol.numberOfSpecialChars(word1);
        System.out.println("Example 1 Output: " + result1); // expected: 3

        // Example 2
        String word2 = "abc";
        int result2 = sol.numberOfSpecialChars(word2);
        System.out.println("Example 2 Output: " + result2); // expected: 0

        // Example 3
        String word3 = "abBCab";
        int result3 = sol.numberOfSpecialChars(word3);
        System.out.println("Example 3 Output: " + result3); // expected: 1

        // Extra test
        String word4 = "aA";
        int result4 = sol.numberOfSpecialChars(word4);
        System.out.println("Extra Test Output: " + result4); // expected: 1
    }
}
