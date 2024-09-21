
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        ListNode newNode = new ListNode(val);

        // Case 1: Empty list or insert at the beginning
        if (head == null || position <= 1) {
            newNode.next = head;
            return newNode;
        }

        ListNode current = head;
        int currentPosition = 1;

        // Traverse the list until we reach the end or the desired position
        while (current.next != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}
