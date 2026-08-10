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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummy.next;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        ListNode l1 = buildList(new int[]{2, 4, 3});
        ListNode l2 = buildList(new int[]{5, 6, 4});
        ListNode result1 = sol.addTwoNumbers(l1, l2);
        System.out.print("Example 1 Output: ");
        printList(result1); // expected: 7 -> 0 -> 8

        // Example 2
        ListNode l3 = buildList(new int[]{0});
        ListNode l4 = buildList(new int[]{0});
        ListNode result2 = sol.addTwoNumbers(l3, l4);
        System.out.print("Example 2 Output: ");
        printList(result2); // expected: 0

        // Example 3
        ListNode l5 = buildList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l6 = buildList(new int[]{9, 9, 9, 9});
        ListNode result3 = sol.addTwoNumbers(l5, l6);
        System.out.print("Example 3 Output: ");
        printList(result3); // expected: 8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1
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
