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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);

        int size = 0;
        ListNode current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        int steps = size - n;
        current = dummy;

        for (int i = 0; i < steps; i++) {
            current = current.next;
        }

        current.next = current.next.next;

        return dummy.next;
    }
}

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        ListNode head1 = buildList(new int[]{1, 2, 3, 4, 5});
        int n1 = 2;
        ListNode result1 = sol.removeNthFromEnd(head1, n1);
        System.out.print("Example 1 Output: ");
        printList(result1); // expected: 1 -> 2 -> 3 -> 5

        // Example 2
        ListNode head2 = buildList(new int[]{1});
        int n2 = 1;
        ListNode result2 = sol.removeNthFromEnd(head2, n2);
        System.out.print("Example 2 Output: ");
        printList(result2); // expected: null

        // Example 3
        ListNode head3 = buildList(new int[]{1, 2});
        int n3 = 1;
        ListNode result3 = sol.removeNthFromEnd(head3, n3);
        System.out.print("Example 3 Output: ");
        printList(result3); // expected: 1
    }

    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
