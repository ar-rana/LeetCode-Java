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
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        if(head==null) return res;

        ListNode temp = head;
        int len = 1;
        while (temp.next!=null) {
            len++;
            temp = temp.next;
        }
        temp = head;

        int remains = len%k;
        int size = len/k;

        for (int i=0;i<k && temp!=null;i++) {
            res[i] = temp;

            for (int j=0;j<size -1 + (remains>0?1:0);j++) {
                temp = temp.next;
            }
            if (temp!=null) {
                ListNode keep = temp;
                temp = temp.next;
                keep.next = null;
            }
            remains--;
        }
        return res;
    }
}