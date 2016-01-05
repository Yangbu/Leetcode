package solution;

public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return ;
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = slow.next;
        ListNode cur = pre.next;
        while(cur != null){
            pre.next = cur.next;
            cur.next = slow.next;
            slow.next = cur;
            cur = pre.next;
        }
        ListNode p1 = head;
        ListNode p2 = slow.next;
        while(p1 != slow){
            slow.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = slow.next;
        }
    }
}
