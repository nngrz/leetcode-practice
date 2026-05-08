function ListNode(val) {
    this.val = val;
    this.next = null;
}

// Create nodes
const node1 = new ListNode(10);
const node2 = new ListNode(20);
const node3 = new ListNode(30);

// Connect nodes
node1.next = node2;
node2.next = node3;

// node1 is the head of the linked list
let head = node1;

function printList(head) {
    let current = head;
    while (current !== null) {
        console.log(current.val);
        current = current.next
    }
}

printList(head);
