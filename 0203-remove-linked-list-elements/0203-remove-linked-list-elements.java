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
    public ListNode removeElements(ListNode head, int val) {
        ListNode n = head;
        while (n != null) {
            if (n == head && n.val == val) {
                head = head.next;
                n = n.next;
            }
            else if (n.next != null && n.next.val == val && n.next.next != null) {
                n.next = n.next.next;
            }
            else if (n.next != null && n.next.val == val && n.next.next == null) {
                n.next = null;
            }
            else { 
                n = n.next;
            }
        }
        return head;
    }
}