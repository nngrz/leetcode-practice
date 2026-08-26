class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        // Write your solution here
        return "";
    }
}

public class ShortestBeautifulSubstring {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        String s1 = "100011001";
        int k1 = 3;

        String result1 = sol.shortestBeautifulSubstring(s1, k1);

        System.out.println("Example 1");
        System.out.println("Output: \"" + result1 + "\"");
        System.out.println("Expected: \"11001\"");
        System.out.println();


        // Example 2
        String s2 = "1011";
        int k2 = 2;

        String result2 = sol.shortestBeautifulSubstring(s2, k2);

        System.out.println("Example 2");
        System.out.println("Output: \"" + result2 + "\"");
        System.out.println("Expected: \"11\"");
        System.out.println();


        // Example 3
        String s3 = "000";
        int k3 = 1;

        String result3 = sol.shortestBeautifulSubstring(s3, k3);

        System.out.println("Example 3");
        System.out.println("Output: \"" + result3 + "\"");
        System.out.println("Expected: \"\"");
        System.out.println();


        // Extra Test 1
        String s4 = "0011100";
        int k4 = 2;

        String result4 = sol.shortestBeautifulSubstring(s4, k4);

        System.out.println("Extra Test 1");
        System.out.println("Output: \"" + result4 + "\"");
        System.out.println();


        // Extra Test 2
        String s5 = "11111";
        int k5 = 3;

        String result5 = sol.shortestBeautifulSubstring(s5, k5);

        System.out.println("Extra Test 2");
        System.out.println("Output: \"" + result5 + "\"");
        System.out.println("Expected: \"111\"");
        System.out.println();


        // Extra Test 3
        String s6 = "010101";
        int k6 = 2;

        String result6 = sol.shortestBeautifulSubstring(s6, k6);

        System.out.println("Extra Test 3");
        System.out.println("Output: \"" + result6 + "\"");
    }
}
