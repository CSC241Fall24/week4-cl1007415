// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        ListNode current = l1;
        while(current.next != null)
        {
            current = current.next;
        }
        
        while(l2 != null)
        {
            current.next = new ListNode(l2.val);
            current = current.next;
            l2 = l2.next;
        }
        return l1;
    }
}
