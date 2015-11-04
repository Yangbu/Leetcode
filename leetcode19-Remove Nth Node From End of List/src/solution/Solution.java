package solution;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = new ListNode(0);
        cur.next = head;
        ListNode fast = cur;
        ListNode slow = cur;
        
        for(int i=0; i<n;i++){
            fast = fast.next;
        }
        
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return cur.next;
    }
}
