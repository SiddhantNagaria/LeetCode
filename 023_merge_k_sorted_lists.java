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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)return null;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        List<Integer> ll = new ArrayList<>();
        for(ListNode list: lists){
            while(list!=null){
                ll.add(list.val);
                list = list.next;
            }
        }
        Collections.sort(ll);
        for(int value:ll){
            temp.next = new ListNode(value);
            temp = temp.next;
        }
        return head.next;
    }
}