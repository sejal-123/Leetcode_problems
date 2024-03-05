/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 = headA;
        while(n1 != null) {
            ListNode n2 = headB;
            while(n2 != null) {
                if (n1 == n2) {
                    return n1;
                }
                n2 = n2.next;
            }
            n1 = n1.next;
        }
        return null;
    }
}