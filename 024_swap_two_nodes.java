/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode returnhead = temp;
        while (temp.next != null && temp.next.next != null) {
            ListNode curr = temp.next;
            ListNode next = temp.next.next;
            temp.next = next;
            curr.next = next.next;
            next.next = curr;
            temp = curr;
        }

        return returnhead.next;
    }
}