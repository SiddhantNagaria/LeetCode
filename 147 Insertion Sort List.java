//20ms

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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0); // Create a dummy node to act as the sorted part of the list
        ListNode curr = head; // Current node to be inserted

        while (curr != null) {
            ListNode prev = dummy; // Insert node between prev and prev.next
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            ListNode next = curr.next; // Save the next node to be processed
            curr.next = prev.next; // Insert curr between prev and prev.next
            prev.next = curr;
            curr = next; // Move to the next node to be inserted
        }

        return dummy.next;
    }
}


//or 

//38ms

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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode temp = head;
        while(temp!=null){
            ListNode next = temp.next;
            ListNode start = head;
            ListNode prev = head;
            while(start!=next){
                if(start.val>temp.val){
                    temp.next=start;
                    if(start == head){
                        head = temp;
                    }else{
                        prev.next = temp;
                    }
                    while(start.next!=temp){
                        start = start.next;
                    }
                    start.next = next;   
                }
                prev = start;
                start = start.next;
            }
            temp = next;
        }
        return head;
    }
}