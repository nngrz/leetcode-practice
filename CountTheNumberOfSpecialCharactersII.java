class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lastLower = new int[26];
        int[] firstUpper = new int[26];

        for (int i = 0; i < 26; i++) {
            lastLower[i] = -1;
            firstUpper[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c >= 'a' && c <= 'z') {
                lastLower[c - 'a'] = i;
            } else if (c >= 'A' && c <= 'Z') {
                if (firstUpper[c - 'A'] == -1) {
                    firstUpper[c - 'A'] = i;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (lastLower[i] != -1 &&
                firstUpper[i] != -1 &&
                lastLower[i] < firstUpper[i]) {
                count++;
            }
        }

        return count;
    }
}

public class CountTheNumberOfSpecialCharactersII {
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
        String word3 = "AbBCab";
        int result3 = sol.numberOfSpecialChars(word3);
        System.out.println("Example 3 Output: " + result3); // expected: 0

        // Extra test 1
        String word4 = "aA";
        int result4 = sol.numberOfSpecialChars(word4);
        System.out.println("Extra Test 1 Output: " + result4); // expected: 1

        // Extra test 2
        String word5 = "Aa";
        int result5 = sol.numberOfSpecialChars(word5);
        System.out.println("Extra Test 2 Output: " + result5); // expected: 0
    }
}