class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
        // ListNode dummy = new ListNode(0, head);
        // ListNode ans = dummy.next;
        // ListNode curr = dummy.next;
        // Set<Integer> hs = new HashSet<>();
        // hs.add(head.val);
        // while(curr != null){
        //     if(!hs.contains(curr.val)){
        //         hs.add(curr.val);
        //         ans.next = curr;
        //         ans = curr;
        //     }
        //     curr = curr.next;
        // }
        // ans.next = null;
        // return dummy.next;
    }
}