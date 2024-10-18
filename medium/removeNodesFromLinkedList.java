package medium;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class removeNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next==null) return head;
        ListNode keep = new ListNode(head.val);// implimenting dynamic stack
        ListNode temp = head.next;
        while (temp!=null) {
            ListNode res = new ListNode(temp.val);
            res.next = keep;
            keep = res;
            temp = temp.next;
        }
        ListNode res = keep.next;
        ListNode result = keep;
        keep.next = null;
        while (res!=null){
            if (result.val <= res.val) {
                result = res;
                res = res.next;
                result.next = keep;
                keep = result;
                continue;
            }
            res = res.next;
        }
        return keep;
    }
}
