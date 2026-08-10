class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];

        for (int num : arr1) {
            count[num]++;
        }

        int[] result = new int[arr1.length];
        int index = 0;

        for (int num : arr2) {
            while (count[num] > 0) {
                result[index] = num;
                index++;
                count[num]--;
            }
        }

        for (int num = 0; num <= 1000; num++) {
            while (count[num] > 0) {
                result[index] = num;
                index++;
                count[num]--;
            }
        }

        return result;
    }
}

public class RelativeSortArray {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] arr1_1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2_1 = {2, 1, 4, 3, 9, 6};
        int[] result1 = sol.relativeSortArray(arr1_1, arr2_1);

        System.out.print("Example 1 Output: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // expected: [2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19]

        // Example 2
        int[] arr1_2 = {28, 6, 22, 8, 44, 17};
        int[] arr2_2 = {22, 28, 8, 6};
        int[] result2 = sol.relativeSortArray(arr1_2, arr2_2);

        System.out.print("Example 2 Output: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // expected: [22, 28, 8, 6, 17, 44]
    }
}

