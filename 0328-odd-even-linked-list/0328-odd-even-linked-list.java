class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(0, head); 
        ListNode odd = dummy.next;
        ListNode even = head.next; 
        ListNode evenHead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return dummy.next;
    }
}