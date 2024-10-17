//  * Definition for singly-linked list.
class LinkedList {
    int val;
    LinkedList next;

    LinkedList() {
    }

    LinkedList(int val) {
        this.val = val;
    }

    LinkedList(int val, LinkedList next) {
        this.val = val;
        this.next = next;
    }
}

class reverseLinkedListSolution {
    public LinkedList reverseList(LinkedList head) {
        if (head == null || head.next == null)
            return head;
        LinkedList p1 = new LinkedList();
        LinkedList p2 = head;
        LinkedList next;
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