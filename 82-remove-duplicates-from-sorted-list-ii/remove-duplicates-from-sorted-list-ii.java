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
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            map.put(temp.val, map.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }
        temp = head;
        ListNode x = null;
        ListNode tail = null;
        while (temp != null) {
            if (map.get(temp.val)==1) {
                ListNode newNode = new ListNode(temp.val);
                if (x == null) {
                    x = newNode;
                    tail=x;
                } else {
                    tail.next = newNode;
                    tail = tail.next;
                }
            }
                temp=temp.next;
        }
        return x;
    }
}