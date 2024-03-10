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
                int ans = findDivisor(n.val, n.next.val);
                ListNode temp = new ListNode(ans);
                n.next = temp;
                temp.next = next;
                n = next;
            } else {
                n = n.next;
            }
        }
        return head;
    }

    public int findDivisor(int n1, int n2) {
        int big = 0, small = 0;
        if (n1 > n2) {
            big = n1;
            small = n2;
        } else {
            big = n2;
            small = n1;
        }
        if (big % small == 0) {
            return small;
        } else if (big % (big - small) == 0 && small % (big - small) == 0) {
            return big-small;
        } else  {
            int i = small-1; 
            while(i > 0) {
                if (small % i == 0 && big % i == 0) {
                    return i;
                }
                i--;
            }
            return 1;
        }
    }
}