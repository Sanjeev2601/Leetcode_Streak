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
    public ListNode frequenciesOfElements(ListNode head) {
        Map<Integer, ListNode> hm = new HashMap<>();
        ListNode temp = head;
        ListNode ans = null;
        while(temp != null){
            if(hm.containsKey(temp.val)){
                ListNode freqNode = hm.get(temp.val);
                freqNode.val += 1;
            }
            else{
                ListNode newFreqNode = new ListNode(1, ans);
                hm.put(temp.val, newFreqNode);
                ans = newFreqNode;
            }
            temp = temp.next;
        }
        return ans;
    }
}