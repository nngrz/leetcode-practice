class Solution {
    public char findTheDifference(String s, String t) {

        int[] count = new int[26];

        // c - 'a' maps a letter to an index:
        // 'a' -> 0, 'b' -> 1, ..., 'z' -> 25
        // count[c - 'a']++ increases the frequency of that character by 1
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] < 0) {
                return (char)('a' + i);
            }
        }

        return ' ';
    }
}

public class FindTheDifference {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Example 1
        String s1 = "abcd";
        String t1 = "abcde";
        char result1 = sol.findTheDifference(s1, t1);
        System.out.println("Example 1 Output: " + result1); // expected: e

        // Example 2
        String s2 = "";
        String t2 = "y";
        char result2 = sol.findTheDifference(s2, t2);
        System.out.println("Example 2 Output: " + result2); // expected: y

        // Extra test
        String s3 = "ae";
        String t3 = "aea";
        char result3 = sol.findTheDifference(s3, t3);
        System.out.println("Extra Test Output: " + result3); // expected: a
    }
}
