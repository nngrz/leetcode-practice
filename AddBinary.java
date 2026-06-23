class Solution {
    public String addBinary(String a, String b) {
        // TODO
        return "";
    }
}

public class AddBinary {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        String a1 = "11";
        String b1 = "1";
        String result1 = sol.addBinary(a1, b1);
        System.out.println("Example 1 Output: " + result1); // expected: 100

        // Example 2
        String a2 = "1010";
        String b2 = "1011";
        String result2 = sol.addBinary(a2, b2);
        System.out.println("Example 2 Output: " + result2); // expected: 10101

        // Extra test 1
        String a3 = "0";
        String b3 = "0";
        String result3 = sol.addBinary(a3, b3);
        System.out.println("Extra Test 1 Output: " + result3); // expected: 0

        // Extra test 2
        String a4 = "1";
        String b4 = "111";
        String result4 = sol.addBinary(a4, b4);
        System.out.println("Extra Test 2 Output: " + result4); // expected: 1000

        // Extra test 3
        String a5 = "1111";
        String b5 = "1111";
        String result5 = sol.addBinary(a5, b5);
        System.out.println("Extra Test 3 Output: " + result5); // expected: 11110
    }
}