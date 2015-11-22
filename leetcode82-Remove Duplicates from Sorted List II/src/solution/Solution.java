package solution;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        ListNode cur = head;
        while(cur != null){
            while(cur.next!=null && cur.next.val == cur.val){
                cur = cur.next;
            }
            if(pre.next == cur){
                pre = pre.next;
            }else{
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return start.next;
    }
}
