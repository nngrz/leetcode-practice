class Solution {
    public int largestAltitude(int[] gain) {

        int highest = 0;
        int current = 0;

        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            if (current > highest) {
                highest = current;
            }
        }

        return highest;
    }
}

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] gain1 = {-5, 1, 5, 0, -7};
        int result1 = sol.largestAltitude(gain1);
        System.out.println("Example 1 Output: " + result1); // expected: 1

        // Example 2
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        int result2 = sol.largestAltitude(gain2);
        System.out.println("Example 2 Output: " + result2); // expected: 0

        // Extra test 1
        int[] gain3 = {1, 2, 3};
        int result3 = sol.largestAltitude(gain3);
        System.out.println("Extra Test 1 Output: " + result3); // expected: 6

        // Extra test 2
        int[] gain4 = {0, 0, 0};
        int result4 = sol.largestAltitude(gain4);
        System.out.println("Extra Test 2 Output: " + result4); // expected: 0

        // Extra test 3
        int[] gain5 = {-1, -2, -3};
        int result5 = sol.largestAltitude(gain5);
        System.out.println("Extra Test 3 Output: " + result5); // expected: 0
    }
}
