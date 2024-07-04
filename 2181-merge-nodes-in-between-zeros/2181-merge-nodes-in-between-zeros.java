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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = head.next;
        ListNode zeroSum = dummy;
        while(zeroSum != null){
            int sum = 0;
            while(zeroSum.val != 0){
                sum += zeroSum.val;
                zeroSum = zeroSum.next;
            }
            dummy.val = sum;
            zeroSum = zeroSum.next;
            dummy.next = zeroSum;
            dummy = dummy.next;
        }
        return head.next;
    }
}