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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode n = head;
        while(n != null) {
            if (n.next != null) {
                ListNode next = n.next;
                ListNode temp = new ListNode(findDivisor(n.val, n.next.val));
                n.next = temp;
                temp.next = next;
                n = next;
            } else {
                n = n.next;
            }
        }
        return head;
    }

    public int findDivisor(int a, int b) {
        if (b == 0) 
            return a;
        return findDivisor(b, a % b);
    }
}