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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        ListNode dummy = head;
        Map<Integer, Integer> hm = new HashMap<>();
        while(dummy != null){
            hm.put(dummy.val, hm.getOrDefault(dummy.val, 0) + 1);
            dummy = dummy.next;
        }
        ListNode temp = new ListNode(0, head);
        ListNode prev = temp;
        ListNode current = temp.next;
        while(current != null){
            if(hm.get(current.val) == 1){
                prev = current;
            }
            else{
                prev.next = current.next;
            }
            current = current.next;
        }
        return temp.next;
    }
}