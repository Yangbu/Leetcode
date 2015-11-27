package solution;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode cur = result;
        for(int i=0; i<m-1; i++) cur = cur.next;
        ListNode start = cur.next;
        ListNode then = start.next;
        for(int i=0; i<n-m; i++){
            start.next = then.next;
            then.next = cur.next;
            cur.next = then;
            then = start.next;
        }
        return result.next;
    }
}
