class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public int pairSum(ListNode head) {
        // TODO
        return 0;
    }
}

public class MaximumTwinSumOfALinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1: [5,4,2,1]
        ListNode head1 = buildList(new int[]{5, 4, 2, 1});
        int result1 = sol.pairSum(head1);
        System.out.println("Example 1 Output: " + result1); // expected: 6

        // Example 2: [4,2,2,3]
        ListNode head2 = buildList(new int[]{4, 2, 2, 3});
        int result2 = sol.pairSum(head2);
        System.out.println("Example 2 Output: " + result2); // expected: 7

        // Example 3: [1,100000]
        ListNode head3 = buildList(new int[]{1, 100000});
        int result3 = sol.pairSum(head3);
        System.out.println("Example 3 Output: " + result3); // expected: 100001

        // Extra Test 1
        ListNode head4 = buildList(new int[]{1, 2, 3, 4, 5, 6});
        int result4 = sol.pairSum(head4);
        System.out.println("Extra Test 1 Output: " + result4);

        // Extra Test 2
        ListNode head5 = buildList(new int[]{10, 20, 30, 40});
        int result5 = sol.pairSum(head5);
        System.out.println("Extra Test 2 Output: " + result5);
    }

    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }
}
