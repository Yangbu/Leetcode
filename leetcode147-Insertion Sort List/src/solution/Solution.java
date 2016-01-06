package solution;

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return head;
        ListNode result = new ListNode(0);
        ListNode pre = result;
        ListNode cur = head;
        ListNode next = null;
        while(cur != null){
            next = cur.next;
            while(pre.next != null && pre.next.val < cur.val){
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            pre = result;
            cur = next;
        }
        return result.next;
    }
}
