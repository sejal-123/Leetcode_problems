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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        if (fast == null || fast.next == null) {
            return null;
        }
        while(fast.next != null) {
            if (fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            } else {
                slow.next = slow.next.next;
                return head;
            }
        }
        head = removeNode(slow, head);
        return head;
    }

    public ListNode removeNode(ListNode n, ListNode head) {
        ListNode temp = head;
        while(temp.next != n) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}