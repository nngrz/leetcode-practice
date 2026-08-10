class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        return new int[]{first, last};
    }
}

public class FindFirstAndLastPositionOfElementInSortedArray2 {
        public static void main(String[] args) {

        Solution sol = new Solution();
        printResult(sol.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)); // [3, 4]
        printResult(sol.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)); // [-1, -1]
        printResult(sol.searchRange(new int[]{}, 0));                   // [-1, -1]
        printResult(sol.searchRange(new int[]{8, 8, 8, 8}, 8));        // [0, 3]
    }

    public static void printResult(int[] arr) {
        System.out.println("[" + arr[0] + ", " + arr[1] + "]");
    }
}



