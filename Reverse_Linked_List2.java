class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Step 1: Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;