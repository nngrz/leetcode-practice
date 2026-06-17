class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        String reversedStr = "";

        for (int i = 0; i < s.length(); i++) {
            char currentElement = s.charAt(i);

            if (currentElement >= 'a' && currentElement <= 'z') {
                result.append(currentElement);

            } else if (currentElement == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }

            } else if (currentElement == '#') {
                result.append(result.toString());

            } else if (currentElement == '%') {
                reversedStr = "";
                for (int j = 0; j < result.length(); j++) {
                    reversedStr = result.charAt(j) + reversedStr;
                }
                result = new StringBuilder(reversedStr);
            }
        }

        return result.toString();
    }
}

public class ProcessStringWithSpecialOperationsI {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        String s1 = "a#b%*";
        String result1 = sol.processStr(s1);
        System.out.println("Example 1 Output: " + result1);
        // expected: ba

        // Example 2
        String s2 = "z*#";
        String result2 = sol.processStr(s2);
        System.out.println("Example 2 Output: " + result2);
        // expected: ""

        // Extra test 1
        String s3 = "abc";
        String result3 = sol.processStr(s3);
        System.out.println("Extra Test 1 Output: " + result3);

        // Extra test 2
        String s4 = "a#";
        String result4 = sol.processStr(s4);
        System.out.println("Extra Test 2 Output: " + result4);

        // Extra test 3
        String s5 = "ab%";
        String result5 = sol.processStr(s5);
        System.out.println("Extra Test 3 Output: " + result5);

        // Extra test 4
        String s6 = "abc*%#";
        String result6 = sol.processStr(s6);
        System.out.println("Extra Test 4 Output: " + result6);
    }
}
