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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0, i = 0;
        ListNode n1 = head;
        while(n1 != null) {
            count++;
            n1 = n1.next;
        }
        if (count - n == 0) {
            head = head.next;
            return head;
        }
        if (count <= 1) {
            head = null;
            return head;
        }
        n1 = head;
        while(i < (count - n - 1)) {
            n1 = n1.next;
            i++;
        }
        n1.next = n1.next.next;
        return head;
    }
}
