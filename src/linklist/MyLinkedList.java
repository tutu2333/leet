package linklist;

public class MyLinkedList {

    int size;
    ListNode virtual;

    public MyLinkedList() {
        size = 0;
        virtual = new ListNode();
    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        ListNode cur = virtual;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        virtual.next = new ListNode(val, virtual.next);
        size++;
    }

    public void addAtTail(int val) {
        ListNode cur = virtual;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(val, null);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        ListNode cur = virtual;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        ListNode addNode = new ListNode(val, cur.next);
        cur.next = addNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        ListNode cur = virtual;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }

}
