import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int size = score.length;
        int[][] arr = new int[size][2];

        for (int i = 0; i < size; i++) {
            arr[i][0] = score[i]; // score
            arr[i][1] = i;        // original index
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        String[] answer = new String[size];

        for (int i = 0; i < size; i++) {
            int originalIndex = arr[i][1];

            if (i == 0) {
                answer[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                answer[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                answer[originalIndex] = "Bronze Medal";
            } else {
                answer[originalIndex] = String.valueOf(i + 1);
            }
        }

        return answer;
    }
}

public class RelativeRanks {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] score1 = {5, 4, 3, 2, 1};
        String[] result1 = sol.findRelativeRanks(score1);
        System.out.println("Example 1 Output: " + Arrays.toString(result1));
        // expected: [Gold Medal, Silver Medal, Bronze Medal, 4, 5]

        // Example 2
        int[] score2 = {10, 3, 8, 9, 4};
        String[] result2 = sol.findRelativeRanks(score2);
        System.out.println("Example 2 Output: " + Arrays.toString(result2));
        // expected: [Gold Medal, 5, Bronze Medal, Silver Medal, 4]
    }
}
