package linklist;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode virtual = new ListNode(0, head);
        ListNode iter = virtual;
        while (iter.next != null) {
            if (iter.next.val == val) {
                iter.next = iter.next.next;
            } else {
                iter = iter.next;
            }
        }
        return virtual.next;
    }

}
