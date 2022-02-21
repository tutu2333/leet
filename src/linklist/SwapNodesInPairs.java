package linklist;

public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode virtual = new ListNode();
        virtual.next = head;
        ListNode pre = virtual;
        ListNode cur = head;
        ListNode next = head.next;

        while (cur != null && next != null) {
            pre.next = next;
            cur.next = next.next;
            next.next = cur;
            pre = cur;
            cur = pre.next;
            if (cur != null) {
                next = cur.next;
            } else {
                next = null;
            }
        }
        return virtual.next;
    }

}
