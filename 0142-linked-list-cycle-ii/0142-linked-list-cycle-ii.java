/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode slow = head, fast = head;
        while(fast != null) {
            set.add(fast);
            fast = fast.next;
            if (set.contains(fast)) {
                return fast;
            }
        }
        return null;
    }
}