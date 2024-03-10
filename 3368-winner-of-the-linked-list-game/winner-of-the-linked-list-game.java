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
    public String gameResult(ListNode head) {
        ListNode even = head;
        ListNode odd = head.next;
        int oc = 0, ec = 0;
        while(even != null){
            if(even.val > odd.val){
                ec++;
            }
            else{
                oc++;
            }
            even = odd.next;
            if(even == null){
                break;
            }
            odd = even.next;
        }
        if(oc > ec){
            return "Odd";
        }
        else if(oc == ec){
            return "Tie";
        }
        return "Even";
    }
}