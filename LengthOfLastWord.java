class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
                if (i > 0 && s.charAt(i - 1) == ' ') {
                    break;
                }
            }
        }

        return count;
    }
}

public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        String s1 = "Hello World";
        int result1 = sol.lengthOfLastWord(s1);
        System.out.println("Example 1 Output: " + result1); // expected: 5

        // Example 2
        String s2 = "   fly me   to   the moon  ";
        int result2 = sol.lengthOfLastWord(s2);
        System.out.println("Example 2 Output: " + result2); // expected: 4

        // Example 3
        String s3 = "luffy is still joyboy";
        int result3 = sol.lengthOfLastWord(s3);
        System.out.println("Example 3 Output: " + result3); // expected: 6

        // Extra test
        String s4 = "a";
        int result4 = sol.lengthOfLastWord(s4);
        System.out.println("Extra Test Output: " + result4); // expected: 1
    }
}
