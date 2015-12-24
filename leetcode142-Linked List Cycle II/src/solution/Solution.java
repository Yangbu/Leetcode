package solution;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        boolean isCycle = false;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                isCycle = true;
                break;
            }
        }
        if(!isCycle) return null;
        ListNode start = head;
        while(start != slow){
            start = start.next;
            slow = slow.next;
        }
        return start;
    }
}
