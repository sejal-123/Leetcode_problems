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
    public int getDecimalValue(ListNode head) {
        ListNode n = head;
        int c = 0;
        while(n.next != null) {
            n = n.next;
            c++;
            System.out.println(n.val + " " + c);
        }
        double ans = 0;
        n = head;
        while (n.next != null) {
            ans = ans + Math.pow(2,c) * n.val;
            n = n.next;
            c--;
        }
        ans = ans + Math.pow(2,c) * n.val;
        return (int)ans;
    }
}