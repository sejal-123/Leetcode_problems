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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n1 = list1;
        ListNode n2 = list2;
        ListNode newList = new ListNode();
        ListNode head = newList;
        while(n1 != null && n2 != null) {
            if (n1.val > n2.val) {
                newList.next = n2;
                n2 = n2.next;
            } else {
                newList.next = n1;
                n1 = n1.next;
            }
            newList = newList.next;
        }
        if (n1 != null) {
            newList.next = n1;
        } else {
            newList.next = n2;
        }
        return head.next;
    }
}