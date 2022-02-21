package linklist;

public class RemoveNthNodeFromEndofList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        ListNode virtual = new ListNode(0, head);
        ListNode target = virtual;
        ListNode iter = virtual;
        int count = 0;
        while (iter != null) {
            iter = iter.next;
            count++;
            if (count > n + 1) {
                target = target.next;
            }
        }

        target.next = target.next.next;
        return virtual.next;
    }

}
