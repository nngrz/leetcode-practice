class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] myArray = new int[2];
        myArray[0] = findFirst(nums, target);
        myArray[1] = findSecond(nums, target);
        return myArray;
    }

    // find the left most index
    public int findFirst(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int answer = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                answer = m;
                r = m - 1;
            } else {
                if (nums[m] < target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }

        return answer;
    }

    // find the right most index
    public int findSecond(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int answer = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                answer = m;
                l = m + 1;
            } else {
                if (nums[m] < target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }

        return answer;
    }
}

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = sol.searchRange(nums1, target1);
        printArray("Example 1 Output", result1); // expected: [3, 4]

        // Example 2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = sol.searchRange(nums2, target2);
        printArray("Example 2 Output", result2); // expected: [-1, -1]

        // Example 3
        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = sol.searchRange(nums3, target3);
        printArray("Example 3 Output", result3); // expected: [-1, -1]

        // Extra Test
        int[] nums4 = {2, 2};
        int target4 = 2;
        int[] result4 = sol.searchRange(nums4, target4);
        printArray("Extra Test Output", result4); // expected: [0, 1]
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
