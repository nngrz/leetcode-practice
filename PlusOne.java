class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

public class PlusOne {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] digits1 = {1, 2, 3};
        int[] result1 = sol.plusOne(digits1);
        printArray("Example 1 Output", result1); // expected: [1, 2, 4]

        // Example 2
        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = sol.plusOne(digits2);
        printArray("Example 2 Output", result2); // expected: [4, 3, 2, 2]

        // Example 3
        int[] digits3 = {9};
        int[] result3 = sol.plusOne(digits3);
        printArray("Example 3 Output", result3); // expected: [1, 0]

        // Extra Test 1
        int[] digits4 = {1, 2, 9};
        int[] result4 = sol.plusOne(digits4);
        printArray("Extra Test 1 Output", result4); // expected: [1, 3, 0]

        // Extra Test 2
        int[] digits5 = {9, 9, 9};
        int[] result5 = sol.plusOne(digits5);
        printArray("Extra Test 2 Output", result5); // expected: [1, 0, 0, 0]
    }

    public static void printArray(String label, int[] arr) {
        System.out.print(label + ": [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}