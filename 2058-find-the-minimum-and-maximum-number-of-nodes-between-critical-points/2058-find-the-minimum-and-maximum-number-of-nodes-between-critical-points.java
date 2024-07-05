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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode prev = head;
        ListNode curr = head.next;
        int i = 2;
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = -1;
        int temp = 0;
        while(curr.next != null){
            if((curr.val > prev.val && curr.val > curr.next.val) || (curr.val < prev.val && curr.val < curr.next.val)){
                a.add(i);
                if(temp != 0){
                    minDistance = Math.min(minDistance, i - temp);
                }
                temp = i;
            }
            prev = curr;
            curr = curr.next;
            i++;
        }
        int n = a.size();
        if(n > 1){
            maxDistance = a.get(n-1) - a.get(0);
        }
        else{
            return new int[]{-1, -1};
        }
        int[] ans = {minDistance, maxDistance};
        return ans;
    }
}