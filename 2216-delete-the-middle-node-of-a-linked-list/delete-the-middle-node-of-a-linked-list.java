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
        ListNode s = head;
        ListNode f = head;
        ListNode prev = head;
        if(f.next == null){
            head = null;
            return head;
        }
        if(f.next != null && f.next.next == null){
            f.next = null;
        }
        while(f.next != null && f.next.next != null){
            prev = s;
            s = s.next;
            f = f.next.next;
        }
        if(f.next == null){
            prev.next = s.next;
        }
        else{
            s.next = s.next.next; 
        }  
        return head;
    }
}