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
    public ListNode middleNode(ListNode head) {
        ListNode n = head;
        int c = 0;
        while(n.next != null) {
            n = n.next;
            c++;
        }
        c++;
        System.out.println(c);
        int i = 0;
        n = head;
        while  (i < c/2) {
            i++;
            n = n.next;
        }
        head = n;
        return head;
    }
}