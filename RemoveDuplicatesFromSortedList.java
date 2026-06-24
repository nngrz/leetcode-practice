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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1: [1,1,2]
        ListNode head1 = buildList(new int[]{1, 1, 2});
        ListNode result1 = sol.deleteDuplicates(head1);
        System.out.print("Example 1 Output: ");
        printList(result1); // expected: [1,2]

        // Example 2: [1,1,2,3,3]
        ListNode head2 = buildList(new int[]{1, 1, 2, 3, 3});
        ListNode result2 = sol.deleteDuplicates(head2);
        System.out.print("Example 2 Output: ");
        printList(result2); // expected: [1,2,3]

        // Extra test 1: []
        ListNode head3 = buildList(new int[]{});
        ListNode result3 = sol.deleteDuplicates(head3);
        System.out.print("Extra Test 1 Output: ");
        printList(result3); // expected: []

        // Extra test 2: [1]
        ListNode head4 = buildList(new int[]{1});
        ListNode result4 = sol.deleteDuplicates(head4);
        System.out.print("Extra Test 2 Output: ");
        printList(result4); // expected: [1]

        // Extra test 3: [1,1,1,1]
        ListNode head5 = buildList(new int[]{1, 1, 1, 1});
        ListNode result5 = sol.deleteDuplicates(head5);
        System.out.print("Extra Test 3 Output: ");
        printList(result5); // expected: [1]
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

    public static void printList(ListNode head) {
        System.out.print("[");
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(",");
            }
            current = current.next;
        }

        System.out.println("]");
    }
}
