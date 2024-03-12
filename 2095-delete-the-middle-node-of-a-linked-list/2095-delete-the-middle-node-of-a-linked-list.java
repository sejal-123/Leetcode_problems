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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode prev = null;
        if (fast == null || fast.next == null) {
            return null;
        }
        while(fast.next != null) {
            if (fast.next.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            } else {
                slow.next = slow.next.next;
                return head;
            }
        }
        prev.next = slow.next;
        return head;
    }
}