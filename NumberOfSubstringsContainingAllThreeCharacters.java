class Solution {
    public int numberOfSubstrings(String s) {
        // TODO
        return 0;
    }
}

public class NumberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        String s1 = "abcabc";
        int result1 = sol.numberOfSubstrings(s1);
        System.out.println("Example 1 Output: " + result1); // expected: 10

        // Example 2
        String s2 = "aaacb";
        int result2 = sol.numberOfSubstrings(s2);
        System.out.println("Example 2 Output: " + result2); // expected: 3

        // Example 3
        String s3 = "abc";
        int result3 = sol.numberOfSubstrings(s3);
        System.out.println("Example 3 Output: " + result3); // expected: 1

        // Extra test 1
        String s4 = "aabbcc";
        int result4 = sol.numberOfSubstrings(s4);
        System.out.println("Extra Test 1 Output: " + result4);

        // Extra test 2
        String s5 = "aaaa";
        int result5 = sol.numberOfSubstrings(s5);
        System.out.println("Extra Test 2 Output: " + result5); // expected: 0

        // Extra test 3
        String s6 = "abccba";
        int result6 = sol.numberOfSubstrings(s6);
        System.out.println("Extra Test 3 Output: " + result6);
    }
}
