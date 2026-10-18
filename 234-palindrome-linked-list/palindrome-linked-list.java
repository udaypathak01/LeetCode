
class Solution {
    ListNode temp;

    public boolean isPalindrome(ListNode head) {
        temp = head;
        return check(head);
    }

    public boolean check(ListNode head) {
        if (head == null)
            return true;

        boolean result = check(head.next);

        if (temp.val != head.val || result == false) {
            return false;
        }
        temp = temp.next;
        return true;
    }
}