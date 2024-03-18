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
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        } 
        ListNode n = head;
        int len = 0;
        while (n != null) {
            len++;
            n = n.next;
        }
        len = k % len;
        ListNode temp = new ListNode();
        while (len > 0) {
            n = head;
            ListNode prev = null;
            while (n.next != null) {
                prev = n;
                n = n.next;
            }
            temp = n;
            prev.next = null;
            temp.next = head;
            head = temp;
            len--;
        }
        return head;
    }
}