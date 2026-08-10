class Solution {
    public int strStr(String haystack, String needle) {
        int lenHaystack = haystack.length();
        int lenNeedle = needle.length();

        for (int i = 0; i <= lenHaystack - lenNeedle; i++) {
            boolean match = true;

            for (int j = 0; j < lenNeedle; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return i;
            }
        }

        return -1;
    }
}

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int result1 = sol.strStr(haystack1, needle1);
        System.out.println("Example 1 Output: " + result1); // expected: 0

        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int result2 = sol.strStr(haystack2, needle2);
        System.out.println("Example 2 Output: " + result2); // expected: -1

        // Extra test 1
        String haystack3 = "hello";
        String needle3 = "ll";
        int result3 = sol.strStr(haystack3, needle3);
        System.out.println("Extra Test 1 Output: " + result3); // expected: 2

        // Extra test 2
        String haystack4 = "aaaaa";
        String needle4 = "bba";
        int result4 = sol.strStr(haystack4, needle4);
        System.out.println("Extra Test 2 Output: " + result4); // expected: -1

        // Extra test 3
        String haystack5 = "mississippi";
        String needle5 = "issip";
        int result5 = sol.strStr(haystack5, needle5);
        System.out.println("Extra Test 3 Output: " + result5); // expected: 4
    }
}
