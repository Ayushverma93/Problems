public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head == null || head.next == null ){
            return null;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                ListNode start = head;
                while(start != slow){
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }
        }
        return null;
    }
}