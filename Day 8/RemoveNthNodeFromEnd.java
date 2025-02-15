class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthNodeFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        
        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        // Remove nth node
        second.next = second.next.next;
        
        return dummy.next;
    }
    
    // Utility function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example 1: [1,2,3,4,5], n = 2
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printList(removeNthFromEnd(head, 2)); // Expected output: 1 -> 2 -> 3 -> 5 -> null

        // Example 2: [1], n = 1
        head = new ListNode(1);
        printList(removeNthFromEnd(head, 1)); // Expected output: null

        // Example 3: [1,2], n = 1
        head = new ListNode(1, new ListNode(2));
        printList(removeNthFromEnd(head, 1)); // Expected output: 1 -> null
    }
}
