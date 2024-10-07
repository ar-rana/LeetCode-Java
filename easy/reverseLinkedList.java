//  * Definition for singly-linked list.
class reverseLinkedList {
    int val;
    reverseLinkedList next;

    reverseLinkedList() {
    }

    reverseLinkedList(int val) {
        this.val = val;
    }

    reverseLinkedList(int val, reverseLinkedList next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public reverseLinkedList reverseList(reverseLinkedList head) {
        if (head == null || head.next == null)
            return head;
        reverseLinkedList p1 = new reverseLinkedList();
        reverseLinkedList p2 = head;
        reverseLinkedList next;
        while (p2 != null) {
            next = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = next;
        }
        head.next = null;
        return p1;
    }
}