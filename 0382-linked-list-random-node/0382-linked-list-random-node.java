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
    ListNode head;
    public Solution(ListNode head) {
        this.head = head;
        // while(head != null){
        //     a.add(head.val);
        //     head = head.next;
        // }
    }
    
    public int getRandom() {
        int ans = 0, i = 1;
        ListNode curr = head;
        while(curr != null){
            if(Math.random() < 1.0 / i){
                ans = curr.val;
            }
            i++;
            curr = curr.next;
        }
        return ans;
        // return a.get((int) Math.random() * a.size());
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */