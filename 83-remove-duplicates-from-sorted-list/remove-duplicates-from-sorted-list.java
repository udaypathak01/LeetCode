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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        else if (head.next == null)
            return head;
        ListNode i = head;
        ListNode j = head.next;
        while (j != null) {
            if (i.val == j.val) {
                i.next = j.next;
                j = j.next;
            } else {
                j = j.next;
                i = i.next;
            }
        }
        return head;
    }
}