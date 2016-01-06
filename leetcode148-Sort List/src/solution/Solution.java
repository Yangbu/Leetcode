package solution;

public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode head2 = sortList(slow.next);
        slow.next = null;
        return merge(sortList(head),head2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode cur = result;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val ){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null? l2:l1;
        return result.next;
    }
}
