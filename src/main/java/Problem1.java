// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        if(l1 == null)
        {
            return l2; //tests for empty list
        }
        
        ListNode current = l1;
        while(current.next != null)
        {
            current = current.next; //copies nodes from l1 to current
        }
        
        while(l2 != null)
        {
            current.next = new ListNode(l2.val); //adds nodes from l2 to the end of l1
            current = current.next;
            l2 = l2.next; //preserving l2
        }
        return l1;
    }
}
