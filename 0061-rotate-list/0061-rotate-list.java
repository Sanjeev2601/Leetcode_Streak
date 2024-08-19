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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode dummy = head;
        int n = 1;
        while(dummy.next != null){
            n++;
            dummy = dummy.next;
        }
        dummy.next = head;
        ListNode prev = head;
        for(int i = 0; i < n - (k % n) - 1; i++){
            prev = prev.next;
        }
        ListNode ans = prev.next;
        prev.next = null;
        return ans;
    }
}