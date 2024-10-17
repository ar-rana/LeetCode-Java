package medium; 
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class addTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode nextEle = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;

            int sum = num1 + num2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            nextEle.next = newNode;
            nextEle = nextEle.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        ListNode result = dummyHead.next;
        nextEle.next = null;
        return result;
    }
}