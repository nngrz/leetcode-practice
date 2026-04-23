
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode current;

        // if one of the lists is empty
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        // determine head and current
        if (list1.val <= list2.val) {
            head = list1;
            current = list1;
            list1 = list1.next;
        } else {
            head = list2;
            current = list2;
            list2 = list2.next;
        }

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            } else {
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            }
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return head;
    }
}

public class MergeTwoSortedLists {
    public static void main(String[] args) {

        ListNode list1 = buildList(new int[]{1, 2, 4});
        ListNode list2 = buildList(new int[]{1, 3, 4});
        Solution solution = new Solution();
        ListNode result = solution.mergeTwoLists(list1, list2);
        printList(result);
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
