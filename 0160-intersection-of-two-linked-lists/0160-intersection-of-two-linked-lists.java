/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode prev = headA;
        ListNode curr = headB;
        while(prev != curr){
            if(prev == null){
                prev = headB;
            }
            else{
                prev = prev.next;
            }
            if(curr == null){
                curr = headA;
            }
            else{
                curr = curr.next;
            }
        }
        return curr;
    }
}