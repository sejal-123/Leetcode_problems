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
    public ListNode sortList(ListNode head) {
        ListNode n = head;
        ArrayList<Integer> lst = new ArrayList<>();
        int len = 0;
        while(n != null) {
            lst.add(n.val);
            n = n.next;
        }
        n = head;
        Collections.sort(lst);
        for(Integer i: lst) {
           n.val = i;
           n = n.next;
        }
        return head;
    }
}