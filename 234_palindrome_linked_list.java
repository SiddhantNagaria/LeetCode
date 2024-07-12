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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        int left = 0;
        int right = list.size()-1;
        while(left < right && list.get(left) == list.get(right)) {
            left++;
            right--;
        }
        return left >= right;
    }
}

//OR

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
    public boolean isPalindrome(ListNode head) {
       //slow pointer move 1 step at a time
       //fast pointer move 2 steps at a time
       ListNode slow = head, fast = head;
       while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
       }
       ListNode prev = null;
       while(slow!=null){
        ListNode tmp = slow.next;
        slow.next = prev;
        prev = slow;
        slow = tmp;
       }
       while(prev!=null){
        if(head.val!=prev.val) return false;
        head = head.next;
        prev = prev.next;
       }
       return true;
    }
}