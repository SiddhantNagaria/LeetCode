class Solution {
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    
    private ListNode doubleList(ListNode head){
        ListNode temp = head;
        ListNode prev = head;
        int carry = 0, sum;
 
        while (temp != null){
            sum = carry + (temp.val*2);
            carry = sum/10;
            sum = sum % 10;
            temp.val = sum;
            prev = temp;
            temp = temp.next;
        }
        if (carry > 0){
            prev.next = new ListNode(carry);
        }
        return head;
    }

    public ListNode doubleIt(ListNode head) {
        head = reverseList(head);
        head = doubleList(head);
        return reverseList(head);
    }
}