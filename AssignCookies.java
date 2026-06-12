import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        /*
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // child pointer
        int j = 0; // cookie pointer
        int count = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return count;
        */

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }
        return i;
    }
}

public class AssignCookies {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        int result1 = sol.findContentChildren(g1, s1);
        System.out.println("Example 1 Output: " + result1); // expected: 1

        // Example 2
        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        int result2 = sol.findContentChildren(g2, s2);
        System.out.println("Example 2 Output: " + result2); // expected: 2

        // Extra test
        int[] g3 = {2, 3, 4};
        int[] s3 = {1, 2, 3};
        int result3 = sol.findContentChildren(g3, s3);
        System.out.println("Extra Test Output: " + result3); // expected: 2
    }
}
